package sv.edu.udb.discusion1;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText etName;
    private EditText etHours;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = (EditText)findViewById(R.id.txtName);
        etHours = (EditText)findViewById(R.id.txtHours);
    }

    public void segundaActividad (View v){
        Intent i = new Intent(  this, secondActivity.class);
        i.putExtra("txtName", etName.getText().toString());
        i.putExtra("txtHours", etHours.getText().toString());
        startActivity(i);
    }
}