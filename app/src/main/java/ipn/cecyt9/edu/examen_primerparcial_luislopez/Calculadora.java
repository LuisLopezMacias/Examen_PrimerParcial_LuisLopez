package ipn.cecyt9.edu.examen_primerparcial_luislopez;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by luislopez on 15/04/18.
 */

public class Calculadora extends AppCompatActivity{

    EditText TxtCantidad1, TxtCanridad2;
    Button BtnSuma, BtnResta, BtnMultiplicacion, BtnDivision;
    TextView TxtVResultado;
    Double Numero1, Numero2, Resultado;
    String ResultadoS;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora_v);

        TxtCantidad1 = findViewById(R.id.TxtB3);
        TxtCanridad2 = findViewById(R.id.TxtB4);
        BtnSuma = findViewById(R.id.Btn6);
        BtnResta = findViewById(R.id.Btn7);
        BtnMultiplicacion = findViewById(R.id.Btn8);
        BtnDivision = findViewById(R.id.Btn9);
        TxtVResultado = findViewById(R.id.TxtV2);
    }

    public void Sumar (View view){

        Numero1 = Double.parseDouble(TxtCantidad1.getText().toString());
        Numero2 = Double.parseDouble(TxtCanridad2.getText().toString());

        if(Numero1.equals("") && Numero2.equals("")) {
            Toast.makeText(Calculadora.this, "Falta agregar una cantidad", Toast.LENGTH_LONG).show();
        }else{
            Resultado = Numero1 + Numero2;
            ResultadoS = Resultado.toString();

            TxtVResultado.setText(ResultadoS);
        }

    }

    public void Restar (View view){


        Numero1 = Double.parseDouble(TxtCantidad1.getText().toString());
        Numero2 = Double.parseDouble(TxtCanridad2.getText().toString());

        if(Numero1.equals("") && Numero2.equals("")) {
            Toast.makeText(Calculadora.this, "Falta agregar una cantidad", Toast.LENGTH_LONG).show();
        }else{
            Resultado = Numero1 - Numero2;
            ResultadoS = Resultado.toString();

            TxtVResultado.setText(ResultadoS);
        }

    }

    public void Multiplicar (View view){

        Numero1 = Double.parseDouble(TxtCantidad1.getText().toString());
        Numero2 = Double.parseDouble(TxtCanridad2.getText().toString());

        if(Numero1.equals("") && Numero2.equals("")) {
            Toast.makeText(Calculadora.this, "Falta agregar una cantidad", Toast.LENGTH_LONG).show();
        }else{
            Resultado = Numero1 * Numero2;
            ResultadoS = Resultado.toString();

            TxtVResultado.setText(ResultadoS);
        }

    }

    public void Dividir (View view){

        Numero1 = Double.parseDouble(TxtCantidad1.getText().toString());
        Numero2 = Double.parseDouble(TxtCanridad2.getText().toString());

        if(Numero1.equals("") && Numero2.equals("")) {
            Toast.makeText(Calculadora.this, "Falta agregar una cantidad", Toast.LENGTH_LONG).show();
        }else{
            Resultado = Numero1 / Numero2;
            ResultadoS = Resultado.toString();

            TxtVResultado.setText(ResultadoS);
        }
    }

    public void Exponenciacion (View view){

        Numero1 = Double.parseDouble(TxtCantidad1.getText().toString());
        Numero2 = Double.parseDouble(TxtCanridad2.getText().toString());

        if(Numero1.equals("") && Numero2.equals("")) {
            Toast.makeText(Calculadora.this, "Falta agregar una cantidad", Toast.LENGTH_LONG).show();
        }else{
            Resultado = Math.pow(Numero1,Numero2);
            ResultadoS = Resultado.toString();

            TxtVResultado.setText(ResultadoS);
        }
    }

    public void Modulo (View view){

        Numero1 = Double.parseDouble(TxtCantidad1.getText().toString());
        Numero2 = Double.parseDouble(TxtCanridad2.getText().toString());

        if(Numero1.equals("") && Numero2.equals("")) {
            Toast.makeText(Calculadora.this, "Falta agregar una cantidad", Toast.LENGTH_LONG).show();
        }else{
            Resultado = Numero1 % Numero2;
            ResultadoS = Resultado.toString();

            TxtVResultado.setText(ResultadoS);
        }
    }

    public void RaizCuadrada (View view){

        Numero1 = Double.parseDouble(TxtCantidad1.getText().toString());
        Numero2 = Double.parseDouble(TxtCanridad2.getText().toString());

        if(Numero1.equals("") && Numero2.equals("")) {
            Toast.makeText(Calculadora.this, "Falta agregar una cantidad", Toast.LENGTH_LONG).show();
        }else{
            Resultado = Math.sqrt(Numero1);
            ResultadoS = Resultado.toString();

            TxtVResultado.setText(ResultadoS);
        }
    }
}
