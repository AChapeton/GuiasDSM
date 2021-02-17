package sv.edu.udb.discusion1;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.os.Bundle;

public class secondActivity extends AppCompatActivity {

    private TextView tvName;
    private TextView tvHours;
    private TextView tvIsss;
    private TextView tvAfp;
    private TextView tvRenta;
    private TextView tvSalarioNeto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvName = (TextView)findViewById(R.id.txtViewName);
        tvHours = (TextView)findViewById(R.id.txtViewHours);
        tvIsss = (TextView)findViewById(R.id.txtViewIsss);
        tvAfp = (TextView)findViewById(R.id.txtViewAfp);
        tvRenta = (TextView)findViewById(R.id.txtViewRenta);
        tvSalarioNeto = (TextView)findViewById(R.id.txtViewSalario);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("txtName");
        String hours = bundle.getString("txtHours");

        Double salarioTotal = Double.parseDouble(hours) * 8.5;
        Double isss = salarioTotal * 0.02;
        Double afp = salarioTotal * 0.03;
        Double renta = salarioTotal * 0.04;
        Double salarioNeto = salarioTotal - (isss + afp + renta);
        tvName.setText(name);
        tvHours.setText(hours);
        tvIsss.setText(isss.toString());
        tvAfp.setText(afp.toString());
        tvRenta.setText(renta.toString());
        tvSalarioNeto.setText(salarioNeto.toString());

    }

    public void endActivity(View v){
        finish();
    }
}