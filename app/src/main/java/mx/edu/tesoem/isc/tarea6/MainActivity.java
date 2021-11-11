package mx.edu.tesoem.isc.tarea6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Convertir(View view){
        EditText datos = findViewById(R.id.datos);
        String datos1 = datos.getText().toString();
        TextView nombre1 = findViewById(R.id.nombre);
        TextView color1 = findViewById(R.id.color);
        TextView comida1 = findViewById(R.id.comida);
        TextView numero1 = findViewById(R.id.numero);
        Gson gson = new Gson();
        Datos datos2 = gson.fromJson(datos1,Datos.class);
        nombre1.setText("Nombre: " + datos2.getNombre());
        color1.setText("Color Favorito: " + datos2.getColorFavorito());
        comida1.setText("Comida Favorita: " + datos2.getComidaFavorita());
        numero1.setText("Numero Favorito: " + datos2.getNumeroFavorito());
    }
}