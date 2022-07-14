package com.mastercoding.retrofitpost;

import com.google.gson.annotations.SerializedName;

public class PostModel {

    String title;

    @SerializedName("data")
    String bodyPost;

    json json;

    // constructor


    public PostModel(String title, String bodyPost) {
        this.title = title;
        this.bodyPost = bodyPost;
    }

    // Getters


    public String getTitle() {
        return title;
    }

    public String getBodyPost() {
        return bodyPost;
    }

    public com.mastercoding.retrofitpost.json getJson() {
        return json;
    }
}
