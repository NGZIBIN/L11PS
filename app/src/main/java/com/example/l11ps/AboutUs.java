package com.example.l11ps;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class AboutUs extends AppCompatActivity {
ImageView iv;
    ActionBar ab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        iv = findViewById(R.id.iv);
        ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        String url = "https://upload.wikimedia.org/wikipedia/commons/8/80/Republic_Polytechnic_Logo.jpg";
        Picasso.with(AboutUs.this).load(url).error(R.drawable.error).placeholder(R.drawable.ajax_loader).into(iv);

    }
}