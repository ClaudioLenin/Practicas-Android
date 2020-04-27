package claudio.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SegundoActivity extends AppCompatActivity {
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        tv1 = (TextView)findViewById(R.id.tv1);
        String dato = getIntent().getStringExtra("dato");
        tv1.setText("Hola "+dato);
    }
    //Método para el botón Anterior
    public void Anterior(View view){
        Intent anterior = new Intent(this,MainActivity.class);
        startActivity(anterior);
    }
}
