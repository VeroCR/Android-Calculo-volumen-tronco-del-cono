package com.example.dpmo_u3_a3_verm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);

        TextView txtRadioMayor, txtRadioMenor, txtAltura, txtResultado, txtH, txtR, txtrm, txtR2, txtrm2;
        Button btnRegresar = findViewById(R.id.btnRegresar);
        txtRadioMayor = findViewById(R.id.txtRMayor);
        txtRadioMenor = findViewById(R.id.txtRMenor);
        txtAltura = findViewById(R.id.txtAlt);
        txtResultado = findViewById(R.id.txtResultado);
        txtH = findViewById(R.id.txtH);
        txtR = findViewById(R.id.txtR);
        txtrm = findViewById(R.id.txtrm);
        txtR2 = findViewById(R.id.txtR2);
        txtrm2 = findViewById(R.id.txtrm2);

        String radMay = getIntent().getStringExtra("txtRadMayor");
        String radMen = getIntent().getStringExtra("txtRadMenor");
        String alt = getIntent().getStringExtra("txtAltura");

        txtRadioMayor.setText(radMay);
        txtRadioMenor.setText(radMen);
        txtAltura.setText(alt);
        txtH.setText(alt);
        txtR.setText(radMay);
        txtrm.setText(radMen);
        txtR2.setText(radMay);
        txtrm2.setText(radMen);

        int rMayor = Integer.parseInt(radMay);
        int rMenor = Integer.parseInt(radMen);
        int altura = Integer.parseInt(alt);

        double resultado = Math.round(((3.1416 * altura)/3) * ((rMayor*rMayor) + (rMenor*rMenor) + (rMayor*rMenor))*100.0)/100.0;
        String res = String.valueOf(resultado);

        txtResultado.setText(res);

        btnRegresar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                finish();
            }
        });
    }
}