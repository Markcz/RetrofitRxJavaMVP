package com.mark.mvp.presenter;

import com.mark.mvp.model.IModel;
import com.mark.mvp.view.IView;

/**
 * Created by chenzhen on 2018/8/20.
 */

public abstract class BasePresenter<M extends IModel,V extends IView> {
    protected M iModel;
    protected V iView;

    protected abstract void start();




}
