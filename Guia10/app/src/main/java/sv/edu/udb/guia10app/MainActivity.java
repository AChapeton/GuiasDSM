package sv.edu.udb.guia10app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.RemoteCallbackList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Call<List<Producto>> call = Servicio.sercvice.getProducts();
    call.enqueue(new RemoteCallback<List<Producto>>){
        @Override
                public void onResponse(Call<List<Producto>> call, r)
    }
}