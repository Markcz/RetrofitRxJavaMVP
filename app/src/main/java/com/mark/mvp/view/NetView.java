package com.mark.mvp.view;

import com.mark.mvp.bean.Book;

import java.util.List;

/**
 * Created by chenzhen on 2018/8/20.
 */

public interface NetView extends IView {

    void show(int flag,List<Book.BooksBean> datas);

}
