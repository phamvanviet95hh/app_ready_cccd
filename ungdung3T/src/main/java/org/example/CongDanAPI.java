package org.example;

import Api.BaseResponse;
import Api.CongDanDTO;
import Api.CongDanResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface CongDanAPI {
    @POST("/api/send-data")
    public Call<CongDanResponse> congDanDTO(

            @Body CongDanDTO congDanDTO
    );
}
