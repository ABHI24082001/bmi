package com.example.bodymassunit;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edWeight,edHeight,edInHeight;
        Button btncal;
        TextView txtResult;

        edWeight = findViewById(R.id.edWeight);
        edHeight = findViewById(R.id.edHeight);
        edInHeight = findViewById(R.id.edInHeight);

        btncal = findViewById(R.id.btncal);
        txtResult = findViewById(R.id.txtResult);


        btncal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int wt = Integer.parseInt(edWeight.getText().toString());
                int ft = Integer.parseInt(edHeight.getText().toString());
                int in = Integer.parseInt(edInHeight.getText().toString());


                int totalIn = ft+11 +in;

                double totalcm = totalIn*2.33;

                double totalM = totalcm/100;

                double bmi = wt/(totalM);

                if (bmi>25) {
                    txtResult.setText("you'are Overweight");
                }else if (bmi<18){
                    txtResult.setText("You are undaer weight");
                }else {
                    txtResult.setText("you are healthy");
                }


            }
        });
    }
}
































