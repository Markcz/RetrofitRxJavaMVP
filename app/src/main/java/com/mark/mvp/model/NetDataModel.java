package com.mark.mvp.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mark.mvp.bean.Book;
import com.mark.mvp.constant.DoubanApi;
import com.mark.mvp.service.RetrofitService;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by chenzhen on 2018/8/20.
 */

public class NetDataModel extends SimpleModel {

    private final static String FILTER_FIELDS = "id,title";


    @Override
    public void loadData(String q, final DataLoadListener listener) {
        if (q == null || listener == null){
            throw new NullPointerException(getClassName() + "  loadData()参数不能为null");
        }
        Gson gson = new GsonBuilder()
                //配置你的Gson
                .setDateFormat("yyyy-MM-dd hh:mm:ss")
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(DoubanApi.API_BOOKS)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        RetrofitService service = retrofit.create(RetrofitService.class);
        service.getSearchBook(q, FILTER_FIELDS).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Book>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Book book) {
                        if (book != null){
                            listener.onComplete(book.getBooks());
                        }
                    }

                    @Override
                    public void onError(final Throwable e) {
                        if (e != null) {
                            listener.onFailure(e.getMessage());
                        }
                    }

                    @Override
                    public void onComplete() {

                    }
                });


    }
}
