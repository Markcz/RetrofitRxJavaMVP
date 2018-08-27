package com.mark.mvp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewAnimator;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mark.mvp.bean.Book;
import com.mark.mvp.bean.BookInfo;
import com.mark.mvp.constant.DoubanApi;
import com.mark.mvp.presenter.NetPresenter;
import com.mark.mvp.presenter.NumberPresenter;
import com.mark.mvp.service.RetrofitService;
import com.mark.mvp.view.NetView;
import com.mark.mvp.view.NumberView;
import java.util.List;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements NetView, NumberView {

    static final String TAG = "MainActivity -- ";


    static final String BOOK_NAME = "java";

    NumberPresenter mOnePresenter;
    NetPresenter mNetPresenter;


    ViewAnimator mViewAnimator;
    ListView mListView;
    RecyclerView mRecyclerView;
    LinearLayout mContent;
    ProgressBar mLoadProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    void init() {
        mViewAnimator = findViewById(R.id.view_animator);
        mListView = findViewById(R.id.list_view);
        mRecyclerView = findViewById(R.id.recycler_view);
        mContent = findViewById(R.id.linear_content_layout);
        mLoadProgressBar = findViewById(R.id.load_progress_bar);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

    }

    @Override
    public void showLoading(String msg) {
        //加载视图
        mLoadProgressBar.setVisibility(View.VISIBLE);
        Log.e(TAG, msg);
    }

    @Override
    public void show(List<String> datas) {
        mListView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, datas));
    }

    @Override
    public void show(int flag, final List<Book.BooksBean> datas) {
        //toast(datas);

        mRecyclerView.setAdapter(new NetAdapter(datas, new NetAdapter.Listener() {
            @Override
            public void onItemClicked(int item) {
                mContent.removeAllViews();
                mViewAnimator.setDisplayedChild(2);
                //Toast.makeText(MainActivity.this,datas.get(item).getId()+"",Toast.LENGTH_LONG).show();
                String title = datas.get(item).getTitle();
                Gson gson = new GsonBuilder()
                        //配置你的Gson
                        .setDateFormat("yyyy-MM-dd hh:mm:ss")
                        .create();

                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(DoubanApi.API_BOOKS)
                        .addConverterFactory(GsonConverterFactory.create(gson))
                        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                        .build();

                RetrofitService retrofitService = retrofit.create(RetrofitService.class);

                retrofitService.getSearchBook(title, title, 0, 1)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Observer<BookInfo>() {
                            @Override
                            public void onSubscribe(Disposable d) {

                            }

                            @Override
                            public void onNext(BookInfo book) {
                                if (book != null) {
                                    List<BookInfo.BooksBean> books = book.getBooks();
                                    if (books != null) {
                                        if (books.size() > 0) {
                                            BookInfo.BooksBean booksBean = books.get(0);
                                            if (booksBean != null) {
                                                TextView textView = new TextView(MainActivity.this);
                                                textView.setTextColor(Color.GRAY);
                                                textView.setText(booksBean.getCatalog());
                                                mContent.addView(textView);
                                            }
                                        }
                                    }
                                    TextView textView1 = new TextView(MainActivity.this);
                                    textView1.setTextColor(Color.GREEN);
                                    textView1.setText("-----------onComplete-----------");
                                    mContent.addView(textView1);
                                }
                            }

                            @Override
                            public void onError(final Throwable e) {
                                if (e != null) {
                                    TextView textView = new TextView(MainActivity.this);
                                    textView.setTextColor(Color.RED);
                                    textView.setText(e.getLocalizedMessage());
                                    mContent.addView(textView);
                                }
                            }

                            @Override
                            public void onComplete() {
                            }
                        });
            }
        }));
    }

    private void toast(List<Book.BooksBean> datas) {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (Book.BooksBean bean : datas) {
            builder.append("{id:").append(bean.getId()).append(",title:").append(bean.getTitle()).append("},");
        }
        builder.deleteCharAt(builder.lastIndexOf(","));
        builder.append("]");
        Log.e(TAG, builder.toString());
        Toast.makeText(this, builder.toString(), Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

    }

    @Override
    public void hideLoading() {
        mLoadProgressBar.setVisibility(View.GONE);
        Log.e(TAG, "hideLoading");
    }

    @Override
    public void showError(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }


    public void loadDataClick(View view) {
        switch (view.getId()) {

            case R.id.btn_local:
                mViewAnimator.setDisplayedChild(0);
                mOnePresenter = new NumberPresenter(this);
                mOnePresenter.start();
                break;

            case R.id.btn_net:
                mViewAnimator.setDisplayedChild(1);
                mNetPresenter = new NetPresenter(this);
                mNetPresenter.start(BOOK_NAME);
                break;

        }

    }
}
