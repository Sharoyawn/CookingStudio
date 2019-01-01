package com.example.roya.cookingstudio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ChineseDishes extends AppCompatActivity {

    //declaring variables for the recipe items texts

    private TextView mama_chang;
    private TextView sour;
    private TextView tso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese_dishes);

        //finding id for the recipe items texts
        mama_chang=findViewById(R.id.mama_chang_txt);
        sour=findViewById(R.id.hotandsour_soup_txt);
        tso=findViewById(R.id.tso_txt);

        //setting on click listener for the recipe items texts
        mama_chang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ChineseDishes.this,Mama.class);
                startActivity(intent);
            }
        });

        sour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ChineseDishes.this,Sour.class);
                startActivity(intent);
            }
        });

        tso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ChineseDishes.this,Tso.class);
                startActivity(intent);
            }
        });

    }
}


