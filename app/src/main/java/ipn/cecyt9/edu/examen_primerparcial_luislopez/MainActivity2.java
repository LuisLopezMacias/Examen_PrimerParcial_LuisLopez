package ipn.cecyt9.edu.examen_primerparcial_luislopez;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by luislopez on 12/04/18.
 */

public class MainActivity2 extends AppCompatActivity{

    Button VCalculadora, VReserva, VIntenciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        VCalculadora = findViewById(R.id.Btn1);
        VReserva = findViewById(R.id.Btn2);
        VIntenciones = findViewById(R.id.Btn3);
    }

    public void AbrirCalculdaora (View view){
        Intent Calculadora = new Intent(MainActivity2.this, Calculadora.class);
        startActivity(Calculadora);
    }

    public void AbrirReserva (View view){
        Intent Reserva = new Intent(MainActivity2.this, Reserva.class);
        startActivity(Reserva);
    }

    public void AbrirIntenciones (View view){
        Intent Intenciones = new Intent(MainActivity2.this, Intenciones.class);
        startActivity(Intenciones);
    }


}
