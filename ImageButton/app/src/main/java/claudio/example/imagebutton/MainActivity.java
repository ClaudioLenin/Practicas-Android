package claudio.example.imagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void batman(View view){
        Toast.makeText(this,"Yo soy Batman",Toast.LENGTH_LONG).show();
    }
    public void crash(View view){
        Toast.makeText(this,"Yo soy Crash Bandicoot",Toast.LENGTH_LONG).show();
        prueba obj = new prueba();
    }
}
