package com.example.roya.cookingstudio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BengaliDishes extends AppCompatActivity {

    //declaring variables for the recipe items texts

    private TextView kacchi;
    private TextView vuna;
    private TextView panta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bengali_dishes);

        //finding id for the recipe items texts
        kacchi=findViewById(R.id.kacchi_txt);
        vuna=findViewById(R.id.bunaKhichuri_txt);
        panta=findViewById(R.id.panta_txt);

        //setting on click listener for the recipe items texts
        kacchi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BengaliDishes.this,Kacchi.class);
                startActivity(intent);
            }
        });

        vuna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BengaliDishes.this,Buna.class);
                startActivity(intent);
            }
        });

        panta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BengaliDishes.this,Panta.class);
                startActivity(intent);
            }
        });

    }
}
