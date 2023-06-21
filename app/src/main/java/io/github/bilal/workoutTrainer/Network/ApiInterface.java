package io.github.bilal.workoutTrainer.Network;

import io.github.bilal.workoutTrainer.data.PlanResponse;
import io.github.bilal.workoutTrainer.data.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ApiInterface {
    // For POST request

    @POST("completions") // specify the sub url for our base url
    Call<PlanResponse> getWorkoutPlan(@Header("Authorization") String authToken,@Body RequestBody requestBody);

}
