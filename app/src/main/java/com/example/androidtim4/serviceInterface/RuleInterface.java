package com.example.androidtim4.serviceInterface;
import java.util.List;



import model.Rule;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface RuleInterface {
    @Headers({
            "User-Agent: Mobile-Android",
            "Content-Type:application/json"
    })
    @GET("/mail/rules") //lista rule
    Call<List<Rule>> getRules();

    @GET("/mail/rules/{id}") //izabrani rule
    Call<Rule> getRule(@Path("id")int id);

    @POST("/mail/rules") //kreiranje novog objekta
    Call<Rule> createRule(@Body Rule rule);

    @PUT("/mail/rules") //izmena izabranog rule
    Call<Rule> editRule(@Body Rule rule);

    @DELETE("/mail/rules/{id}") //brisanje rule
    Call<Rule> deleteRule(@Path("id") int id);
}