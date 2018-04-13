package ipn.cecyt9.edu.examen_primerparcial_luislopez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ETUsuario, ETContraseña;
    Button Enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ETUsuario = findViewById(R.id.editText);
        ETContraseña = findViewById(R.id.editText2);
        Enviar = findViewById(R.id.button);
    }

    public void Validacion (View view){

        String Usuario="Luis", Contraseña="1234";

        if(Usuario.equals(ETUsuario.getText().toString()) && Contraseña.equals(ETContraseña.getText().toString())){
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(this, "Usuario incorrecto", Toast.LENGTH_SHORT).show();
        }
    }
}
