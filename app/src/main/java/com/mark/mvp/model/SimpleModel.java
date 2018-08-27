package com.mark.mvp.model;

/**
 * Created by chenzhen on 2018/8/20.
 */

public class SimpleModel implements IModel {

    private final static String TAG = "SimpleModel";

    protected String getClassName (){
        String simpleName = getClass().getSimpleName();
        if (simpleName != null){
            return simpleName;
        }
        return TAG;
    }

    @Override
    public void loadData(DataLoadListener listener) {

    }

    @Override
    public void loadData(String q, DataLoadListener listener) {

    }


}
