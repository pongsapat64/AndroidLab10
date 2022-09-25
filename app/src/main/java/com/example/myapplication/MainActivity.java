package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ScrollView scrollView = new ScrollView(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        scrollView.setLayoutParams(layoutParams);

        LinearLayout linearLayout = new LinearLayout(this);
        LinearLayout.LayoutParams linearParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setLayoutParams(linearParams);

        scrollView.addView(linearLayout);

        ImageView imageView1 = new ImageView(this);
        LinearLayout.LayoutParams params1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params1.setMargins(0, 30, 0, 30);
        params1.gravity = Gravity.CENTER;
        imageView1.setLayoutParams(params1);
        imageView1.setImageResource(R.drawable.dragon_fruit);
        linearLayout.addView(imageView1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, fruit_detail.class);
                intent.putExtra("fruitName", "มังคุด");
                // Send img id to the next page
                intent.putExtra("fruitImg", "magosteen");
                startActivity(intent);
            }
        });

        ImageView imageView2 = new ImageView(this);
        LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params2.setMargins(0, 0, 0, 30);
        params2.gravity = Gravity.CENTER;
        imageView2.setLayoutParams(params2);
        imageView2.setImageResource(R.drawable.magosteen);
        linearLayout.addView(imageView2);

        ImageView imageView3 = new ImageView(this);
        LinearLayout.LayoutParams params3 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params3.setMargins(0, 0, 0, 30);
        params3.gravity = Gravity.CENTER;
        imageView3.setLayoutParams(params3);
        imageView3.setImageResource(R.drawable.kiwi);
        linearLayout.addView(imageView3);

        ImageView imageView4 = new ImageView(this);
        LinearLayout.LayoutParams params4 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params4.setMargins(0, 0, 0, 30);
        params4.gravity = Gravity.CENTER;
        imageView4.setLayoutParams(params4);
        imageView4.setImageResource(R.drawable.lychee);
        linearLayout.addView(imageView4);

        ImageView imageView5 = new ImageView(this);
        LinearLayout.LayoutParams params5 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params5.setMargins(0, 0, 0, 30);
        params5.gravity = Gravity.CENTER;
        imageView5.setLayoutParams(params5);
        imageView5.setImageResource(R.drawable.pine_apple);
        linearLayout.addView(imageView5);

        ImageView imageView6 = new ImageView(this);
        LinearLayout.LayoutParams params6 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params6.setMargins(0, 0, 0, 30);
        params6.gravity = Gravity.CENTER;
        imageView6.setLayoutParams(params6);
        imageView6.setImageResource(R.drawable.star_fruit);
        linearLayout.addView(imageView6);

        LinearLayout linearLayout1 = findViewById(R.id.rootContainer);
        if (linearLayout1 != null) {
            linearLayout1.addView(scrollView);
        }
    }
}

