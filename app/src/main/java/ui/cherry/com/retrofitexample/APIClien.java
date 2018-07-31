package ui.cherry.com.retrofitexample;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by PPS on 2/2/2018.
 */

public class APIClien {

    private static Retrofit retrofit = null;
    public static final String BASE_URL = "http://navjacinth9.000webhostapp.com/json/";
    static  Retrofit getClient(){

        if(retrofit == null){

            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;

    }

}


