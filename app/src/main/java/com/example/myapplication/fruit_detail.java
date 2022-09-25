package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class fruit_detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit_detail);

        Intent intent = getIntent();
        String fruitName = intent.getStringExtra("fruitName");
        String fruitImg = intent.getStringExtra("fruitImg");

        ScrollView scrollView = new ScrollView(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        scrollView.setLayoutParams(layoutParams);

        LinearLayout linearLayout = new LinearLayout(this);
        LinearLayout.LayoutParams linearParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setLayoutParams(linearParams);

        scrollView.addView(linearLayout);

        ImageView imageView = new ImageView(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.setMargins(0, 0, 0, 30);
        params.gravity = Gravity.CENTER;
        imageView.setLayoutParams(params);
        //imageView.setImageResource(R.drawable.jackfruit);       // chk IF as imageVar=1 ==> jackfruit
        //----------------------------------------
        // Show img
        //----------------------------------------
        switch (fruitImg){
            case "dragon_fruit": imageView.setImageResource(R.drawable.dragon_fruit); break;
            case "magosteen": imageView.setImageResource(R.drawable.magosteen); break;
            case "kiwi": imageView.setImageResource(R.drawable.kiwi); break;
            case "lychee": imageView.setImageResource(R.drawable.lychee); break;
            case "pine_apple": imageView.setImageResource(R.drawable.pine_apple); break;
            case "star_fruit": imageView.setImageResource(R.drawable.star_fruit); break;
            default: imageView.setImageResource(R.drawable.dragon_fruit);
        }
        linearLayout.addView(imageView);
        TextView tv = new TextView(this);
        tv.setText(fruitName);
        tv.setGravity(Gravity.CENTER_HORIZONTAL);
        linearLayout.addView(tv);


        LinearLayout linearLayout1 = findViewById(R.id.rootContainer);
        if (linearLayout1 != null) {
            linearLayout1.addView(scrollView);
        }
    }
}