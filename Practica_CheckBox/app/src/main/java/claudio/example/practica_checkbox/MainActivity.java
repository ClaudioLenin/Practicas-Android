package claudio.example.practica_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2;
    private CheckBox check1,check2;
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();
        //La actividad está creada
        et1 = (EditText)findViewById(R.id.txt_valor1);
        et2 = (EditText)findViewById(R.id.txt_valor2);
        check1 = (CheckBox)findViewById(R.id.check_Suma);
        check2 = (CheckBox)findViewById(R.id.check_Resta);
        tv1 = (TextView)findViewById(R.id.tv_Resultado);
    }
    public void Calcular(View view){
        String valor1_String = et1.getText().toString();
        String valor2_String = et2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_String);
        int valor2_int = Integer.parseInt(valor2_String);

        String resultado = "";
        if(check1.isChecked() == true){
            int suma = valor1_int + valor2_int;
            resultado = "La suma es: "+suma+" / ";
        }
        if(check2.isChecked() == true){
            int resta = valor1_int - valor2_int;
            resultado += "La resta es: "+resta;
        }
        tv1.setText(resultado);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
        //La actividad está a punto de hacerse visible
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
        //La actividad está a vuelto visible (ahora se "reanuda")
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
        //enfocarse en otra actividad (esta actividad esta a punto de ser "detenida")
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
        //La actividad ya no es visible (ahora esta "detenida")
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();
        //La actividad está a punto de ser destruida
    }
}
