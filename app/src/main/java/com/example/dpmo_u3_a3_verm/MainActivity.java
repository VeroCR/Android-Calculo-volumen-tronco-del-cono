package com.example.dpmo_u3_a3_verm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnTerminar = findViewById(R.id.btnTerminar);
        Button btnEnviar = findViewById(R.id.btnEnviar);
        EditText txtRadMayor, txtRadMenor, txtAltura;

        txtRadMayor = findViewById(R.id.txtRadMayor);
        txtRadMenor = findViewById(R.id.txtRadMenor);
        txtAltura = findViewById(R.id.txtAltura);

        btnEnviar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                String rmayor = txtRadMayor.getText().toString();
                String rmenor = txtRadMenor.getText().toString();
                String alt = txtAltura.getText().toString();
                if(rmayor.equals("") || rmenor.equals("") || alt.equals("")){
                    Toast.makeText(MainActivity.this, "Agregue todos los valores.", Toast.LENGTH_SHORT).show();
                }else {
                    int radMayor = Integer.parseInt(rmayor);
                    int radMenor = Integer.parseInt(rmenor);
                    int altura = Integer.parseInt(alt);
                    if(radMayor < 0 || radMenor < 0 || altura < 0){
                        Toast.makeText(MainActivity.this, "Los valores deben ser positivos", Toast.LENGTH_SHORT).show();
                    }else{
                        Intent i = new Intent(MainActivity.this, Calculo.class);
                        i.putExtra("txtRadMayor", rmayor);
                        i.putExtra("txtRadMenor", rmenor);
                        i.putExtra("txtAltura", alt);

                        startActivity(i);
                    }
                }
            }
        });

        btnTerminar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                finish();
                System.exit(0);
            }
        });
    }
}