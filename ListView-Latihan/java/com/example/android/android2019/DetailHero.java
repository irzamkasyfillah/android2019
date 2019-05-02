package com.example.android.android2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailHero extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hero);

        ImageView gambar = findViewById(R.id.gambar);
        TextView nama = findViewById(R.id.nama);
        TextView desk = findViewById(R.id.desk);

        Intent i = getIntent();
        int gbr = i.getIntExtra("foto", 0);
        String name = i.getStringExtra("nama");
        String desc = i.getStringExtra("desk");

        gambar.setImageResource(gbr);
        nama.setText(name);
        desk.setText(desc);
    }
}
