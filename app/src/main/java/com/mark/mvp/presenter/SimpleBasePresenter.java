package com.mark.mvp.presenter;

/**
 * Created by chenzhen on 2018/8/20.
 */

public class SimpleBasePresenter extends BasePresenter {

    private final static String TAG = "SimpleBasePresenter";

    protected String getClassName (){
        String simpleName = getClass().getSimpleName();
        if (simpleName != null){
            return simpleName;
        }
        return TAG;
    }

    @Override
    protected void start() {

    }

    protected void start(String q){

    }
}
