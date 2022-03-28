package com.cdp.agenda;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.os.Bundle;

public class CreditosActivi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);

        Button botonEntrar1 = findViewById(R.id.senatibuton);

        // Ahora escuchamos el click del botón
        botonEntrar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ahora vamos la otra actividad
                Intent intent = new Intent(CreditosActivi.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}