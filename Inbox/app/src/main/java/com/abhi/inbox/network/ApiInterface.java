package com.abhi.inbox.network;

/**
 * Created by abhisheksisodia on 2017-10-06.
 */

import com.abhi.inbox.model.Message;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("inbox.json")
    Call<List<Message>> getInbox();

}