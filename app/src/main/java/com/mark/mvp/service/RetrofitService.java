package com.mark.mvp.service;


import com.mark.mvp.bean.Book;
import com.mark.mvp.bean.BookInfo;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface RetrofitService {

    // search?q=python&fields=id,title  //查询 python 丛书  指定返回 字段 id title
    public static final String API_BOOKS = "https://api.douban.com/v2/book/";

    @GET("search")
    Observable<Book> getSearchBook(
            @Query("q") String name,
            @Query("fields") String fields
    );


    //https://api.douban.com/v2/book/search?q=水浒传&tag=古典&start=0&count=1
    @GET("search")
    Observable<BookInfo> getSearchBook(
            @Query("q") String name,
            @Query("tag") String tag,
            @Query("start") int start,
            @Query("count") int count
    );

}
