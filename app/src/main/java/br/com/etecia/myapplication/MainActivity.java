package br.com.etecia.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoJogar;
    private TextView txtMostrar;
    private Button botaoLimpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = findViewById(R.id.btnEnviar);
        txtMostrar = findViewById(R.id.txtMostrar);
        botaoLimpar = findViewById(R.id.btnLimpar);

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();
                int resultado = random.nextInt(10);
                txtMostrar.setText("O resultado é: " + resultado);
            }
        });

        botaoLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMostrar.setText("");
            }
        });
    }
}
