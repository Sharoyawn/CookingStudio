package com.example.roya.cookingstudio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class IndianDishes extends AppCompatActivity {

    //declaring variables for the recipe items texts

    private TextView h_biryani;
    private TextView dhokla;
    private TextView mutton_korma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian_dishes);

        //finding id for the recipe items texts
        h_biryani=findViewById(R.id.h_biryani_txt);
        dhokla=findViewById(R.id.dhokla_txt);
        mutton_korma=findViewById(R.id.korma_txt);

        //setting on click listener for the recipe items texts
        h_biryani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IndianDishes.this,H_biryani.class);
                startActivity(intent);
            }
        });

        dhokla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IndianDishes.this,Dhokla.class);
                startActivity(intent);
            }
        });

        mutton_korma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IndianDishes.this,Korma.class);
                startActivity(intent);
            }
        });

    }
}

