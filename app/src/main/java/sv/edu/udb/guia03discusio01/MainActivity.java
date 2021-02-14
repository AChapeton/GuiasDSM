package sv.edu.udb.guia03discusio01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int counter;
    Button btn01;
    TextView txtNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = 0;
        txtNumber = findViewById(R.id.lblCounter);
        btn01 = findViewById(R.id.btnCounter);
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                txtNumber.setText(Integer.toString(counter));
                if (counter == 9){
                    counter = 0;
                }
            }
        });

    }
}