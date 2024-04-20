package API_Model;

import ObjectModel.CharacterDetails;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MarvelAPIService {
    // Fetch a list of superheroes based on the name search
    @GET("api/{Token}/search/{Name}")
    Call<Character> getSuperHeroList(
            @Path("Name") String name,
            @Path("Token") String apiKey
    );

    // Fetch detailed data of a superhero by their ID
    @GET("api/{Token}/{Id}")
    Call<CharacterDetails> getSuperHeroData(
            @Path("Id") String id,
            @Path("Token") String apiKey
    );
}