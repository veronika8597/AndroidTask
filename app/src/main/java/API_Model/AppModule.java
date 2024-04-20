package API_Model;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AppModule {

    // Constants for the base URL and API key
    public static final String BASE_URL = "https://developer.marvel.com";
    public static final String API_KEY = "ebabc11792bfc604e236790934607b16";
    // Static method to get a Retrofit instance
    public static Retrofit getRetroInstance() {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}

