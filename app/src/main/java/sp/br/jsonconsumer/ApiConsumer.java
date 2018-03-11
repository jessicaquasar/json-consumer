package sp.br.jsonconsumer;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiConsumer {

    public static String BASE_URL = "https://s3-sa-east-1.amazonaws.com/";

    private static Retrofit retrofit;

    public static Retrofit getConsumer() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
