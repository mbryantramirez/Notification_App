package com.example.rzmorales.notification_app_hw_zaratemorales_robert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class SecondActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        imageView = findViewById(R.id.display_imageView);
        textView=findViewById(R.id.display_textview);
        Intent intent = getIntent();
        textView.setText(intent.getStringExtra("text"));
//        Picasso.get().load(intent.getStringExtra("image")).into(imageView);

        imageView.setImageResource(intent.getIntExtra("image",0));


    }
}
