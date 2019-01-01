package com.example.roya.cookingstudio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class HomeScreen extends AppCompatActivity

{
    //declaring variables for the view flipper
    private ViewFlipper viewFlipper;

    //declaring variables for the country dishes
    private TextView textView_bengali;
    private TextView textView_indian;
    private TextView textView_chinese;
    private TextView textView_italian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        //declaring an array for storing the images for the slider
        int [] slider_images={R.drawable.item_1,R.drawable.item_2,R.drawable.item_3,R.drawable.item_5};


        //finding the id of the view flipper
        viewFlipper=findViewById(R.id.homescreen_slider);
        //finding the id of the country text
        textView_bengali=findViewById(R.id.Bengali_txt);
        textView_indian=findViewById(R.id.indian_txt);
        textView_chinese=findViewById(R.id.chinese_txt);

        //calling the flipper images method by loop
        for (int i=0;i<slider_images.length;i++)
        {
            flipperImages(slider_images[i]);
        }

        //creating intent for the country text
        textView_bengali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeScreen.this,BengaliDishes.class);
                startActivity(intent);
            }
        });

        textView_indian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeScreen.this,IndianDishes.class);
                startActivity(intent);
            }
        });

        textView_chinese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeScreen.this,ChineseDishes.class);
                startActivity(intent);
            }
        });

    }

    //creating a method for flipping the images
    public void flipperImages(int image)
    {
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(image);

        //adding the flipping features
        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(3000);//3 seconds
        viewFlipper.setAutoStart(true);

        //adding animation to the flipper
        viewFlipper.setInAnimation(this,android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }
}
