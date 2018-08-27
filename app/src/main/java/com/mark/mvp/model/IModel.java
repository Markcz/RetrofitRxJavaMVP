package com.mark.mvp.model;

import java.util.List;

/**
 * Created by mark on 18-4-29.
 */

public interface IModel {

    //加载数据
    void loadData(DataLoadListener listener);

    //携带参数
    void loadData(String q,DataLoadListener listener);


    //数据加载 回调接口
    interface DataLoadListener<T> {
        void onComplete(List<T> datas);
        void onFailure(String msg);
    }


}
