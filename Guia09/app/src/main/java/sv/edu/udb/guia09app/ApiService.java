package sv.edu.udb.guia09app;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {

    @GET("{raza}/images")
    Call<DogsResponse> getDogsByBreed(@Path("raza") String raza);
}




