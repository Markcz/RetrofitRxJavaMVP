package com.mark.mvp.presenter;

import com.mark.mvp.bean.Book;
import com.mark.mvp.model.IModel;
import com.mark.mvp.model.NetDataModel;
import com.mark.mvp.view.IView;
import com.mark.mvp.view.NetView;

import java.util.List;


/**
 * Created by chenzhen on 2018/8/20.
 */

public class NetPresenter<T extends NetView> extends SimpleBasePresenter{

    public NetPresenter() {
    }

    public NetPresenter(T view){
        iView = view;
        iModel = new NetDataModel();
    }

    public void start(String q) {
        if (q == null){
            throw new NullPointerException(getClassName() + " start(String q) 参数不能为null");
        }
        if (iView != null){
            iView.showLoading("数据加载中...");
            if (iModel != null){
                iModel.loadData(q,new IModel.DataLoadListener<Book.BooksBean>(){
                    @Override
                    public void onComplete(List<Book.BooksBean> datas) {
                        if (iView != null){
                            iView.hideLoading();
                            ((T)iView).show(1,datas);
                        }
                    }

                    @Override
                    public void onFailure(String msg) {
                        if (iView != null){
                            iView.hideLoading();
                            iView.showError(msg);
                        }
                    }
                });
            }
        }
    }
}
