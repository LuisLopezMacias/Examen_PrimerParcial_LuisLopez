package ipn.cecyt9.edu.examen_primerparcial_luislopez;

/**
 * Created by luislopez on 15/04/18.
 */

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Intenciones extends AppCompatActivity implements View.OnClickListener {

    Button UNO, DOS, TRES, CUATRO, CINCO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intenciones_v);

        UNO = findViewById(R.id.PaginaWEB);
        UNO.setOnClickListener(this);
        DOS = findViewById(R.id.Llamada);
        DOS.setOnClickListener(this);
        TRES = findViewById(R.id.GoogleMaps);
        TRES.setOnClickListener(this);
        CUATRO = findViewById(R.id.Fotos);
        CUATRO.setOnClickListener(this);
        CINCO = findViewById(R.id.Correo);
        CINCO.setOnClickListener(this);
    }

    @Override
    public void onClick (View view){
        if(view.getId() == UNO.getId()){
            abrirPaginaWeb(view);
        }else
        if(view.getId() == DOS.getId()){
            llamadaTelefono(view);
        }else
        if(view.getId() == TRES.getId()){
            googleMaps(view);
        }else
        if(view.getId() == CUATRO.getId()){
            tomarFoto(view);
        }else{
            mandarCorreo(view);
        }
    }

    public void abrirPaginaWeb(View paginaWeb)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://cursosprogra.website"));
        startActivity(intent);
    }

    public void llamadaTelefono(View llamada)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL,
                Uri.parse("tel:57296000"));
        startActivity(intent);
    }

    public void googleMaps(View maps)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("geo:19.453659, -99.175298"));
        startActivity(intent);
    }

    public void tomarFoto(View maps)
    {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(intent);
    }

    public void mandarCorreo(View correo)
    {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto: Prueba");
        intent.putExtra(Intent.EXTRA_TEXT, "Contenido del correo: Prueba");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "eoropezag@ipn.mx"} );
        startActivity(intent);
    }

    public void AbrirStreetView (View view){
        Intent intent = new Intent(Intenciones.this, StreetView.class);
        startActivity(intent);
    }

}
