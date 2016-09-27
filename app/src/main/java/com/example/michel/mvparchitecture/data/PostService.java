package com.example.michel.mvparchitecture.data;

import java.util.List;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by michel on 27/09/16.
 */

public interface PostService {
    @GET("/posts")
    Observable<List<Post>> getPostList();
}
