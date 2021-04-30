package sv.edu.udb.guia10app;

import android.telecom.Call;

public interface APIService {
    @GET(".")
    Call<List<Producto>> getProducts();
    @GET()
    Call<RespProducto> getProductById(@Url String url);
    @POST("agrega")
    Call<Respuesta> insertProduct(@Body Producto producto);
    @DELETE()
    Call<Respuesta> deleteProduct(@Url String url);
    @PUT()
    Call<Respuesta> updateProduct(@Url String url, @Body Producto producto);
}
