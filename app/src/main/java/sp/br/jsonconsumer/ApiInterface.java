package sp.br.jsonconsumer;

import retrofit2.Call;
import retrofit2.http.GET;
import sp.br.jsonconsumer.model.Data;

public interface ApiInterface {

    @GET("pontotel-docs/data.json")
    Call<Data> getData();

}
