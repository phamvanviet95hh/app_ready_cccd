package org.example;

import Api.BaseResponse;
import Api.CongDanDTO;
import Api.Verify;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface GerritAPI {
    @GET("changes/")
    Call<List<Change>> loadChanges(@Query("q") String status);
    @Headers({"x-api-key: tZ3hsBK2yjtTb7UKQNjPNQXMJbHydMho"})
    @POST("/eid_verify/sdk/verify")
    public Call<BaseResponse> verify(
            @Body Verify verify
    );
}
