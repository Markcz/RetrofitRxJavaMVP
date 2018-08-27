package com.mark.mvp.presenter;

import com.mark.mvp.model.IModel;
import com.mark.mvp.model.NumberModel;
import com.mark.mvp.view.IView;
import com.mark.mvp.view.NumberView;

import java.util.List;

/**
 * Created by mark on 18-4-29.
 */

public class NumberPresenter<T extends NumberView> extends BasePresenter{

    public NumberPresenter(T view){
        iView = view;
        iModel = new NumberModel();
    }

    public void start(){
        if (iView != null){
            iView.showLoading("数据加载中...");
            if (iModel != null){
                iModel.loadData(new IModel.DataLoadListener<String>() {
                    @Override
                    public void onComplete(List<String> datas) {
                        ((T)iView).show(datas);
                        iView.hideLoading();
                    }

                    @Override
                    public void onFailure(String msg) {
                        iView.hideLoading();
                        iView.showError(msg);
                    }
                });
            }
        }
    }

}
