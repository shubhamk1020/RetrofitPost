package com.mastercoding.retrofitpost;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface PostRequestApi {

    //https://httpbin.org/post

    @POST("post")
    Call<PostModel> PostDataIntoServer(@Body PostModel postModel);


    //https://httpbin.org/put
    @PUT("put")
    Call<PostModel> updateData(@Body PostModel postModel);

}

