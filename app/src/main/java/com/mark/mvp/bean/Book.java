package com.mark.mvp.bean;

import java.util.List;

/**
 * Created by chenzhen on 2018/8/20.
 */

public class Book {


    /**
     * count : 20
     * start : 0
     * total : 1666
     * books : [{"id":"26829016","title":"Python编程：从入门到实践"},{"id":"25779298","title":"利用Python进行数据分析"},{"id":"4866934","title":"Python基础教程"},{"id":"27028517","title":"流畅的Python"},{"id":"10561367","title":"Head First Python（中文版）"},{"id":"3112503","title":"Python核心编程（第二版）"},{"id":"26836700","title":"Python编程快速上手"},{"id":"26264642","title":"\"笨办法\"学Python"},{"id":"3117898","title":"Python源码剖析"},{"id":"26005639","title":"父与子的编程之旅"},{"id":"3948354","title":"Python学习手册"},{"id":"26740503","title":"Python网络数据采集"},{"id":"6049132","title":"Python学习手册（第4版）"},{"id":"4828875","title":"Python Cookbook"},{"id":"26675127","title":"Python语言及其应用"},{"id":"4915945","title":"Python Algorithms"},{"id":"26274202","title":"Flask Web开发：基于Python的Web应用开发实战"},{"id":"26919485","title":"从Python开始学编程"},{"id":"4212921","title":"Python高级编程"},{"id":"26709315","title":"Effective Python"}]
     */

    private int count;
    private int start;
    private int total;
    private List<BooksBean> books;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<BooksBean> getBooks() {
        return books;
    }

    public void setBooks(List<BooksBean> books) {
        this.books = books;
    }

    public static class BooksBean {
        /**
         * id : 26829016
         * title : Python编程：从入门到实践
         */

        private long id;
        private String title;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
