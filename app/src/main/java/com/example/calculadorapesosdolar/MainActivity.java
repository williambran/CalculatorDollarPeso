package com.example.calculadorapesosdolar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText campoDolar;
    private EditText campoPesos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Definir editext en activity
        campoDolar = (EditText) findViewById(R.id.dolar);
        campoPesos = (EditText) findViewById(R.id.pesos);

        Button dolarAPesos = (Button) findViewById(R.id.Btn_dolar_to_pesos);
        Button pesosADolar = (Button) findViewById(R.id.Btn_pesos_to_dolar);
        Button borrar = (Button) findViewById(R.id.borrar);
        Button salir = (Button) findViewById(R.id.salir);


        dolarAPesos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                campoDolar.setText(""+Double.parseDouble(campoDolar.getText().toString())*19.92);
            }
        });


        pesosADolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                campoPesos.setText(""+Double.parseDouble(campoPesos.getText().toString())/19.92);
            }
        });

        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                campoPesos.setText("");
                campoDolar.setText("");
            }
        });


        salir.setOnClickListener(new View.OnClickListener() { public void onClick(View view) {
            setResult(RESULT_OK);
            finish();
        } });

    }
}