package com.example.sorteioprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero(View view){

        TextView texto = findViewById(R.id.textoResultado);

        //Foi definida uma variavel x que vai receber um valor Randomico
        int numero = new Random().nextInt(11);//Vai ler esse número inteiro vai gerar ele

        texto.setText("Número: "+numero);

    }

}
