package com.mark.mvp.view;

import java.util.List;

/**
 * Created by mark on 18-4-29.
 */

public interface IView {
    //loading view
    void showLoading(String msg);

    void hideLoading();

    void showError(String msg);
}
