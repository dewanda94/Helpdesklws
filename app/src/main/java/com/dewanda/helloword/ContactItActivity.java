package com.dewanda.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ContactItActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactit);

        ImageView iv_aep = (ImageView) findViewById(R.id.iv_aep);
        iv_aep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ContactItActivity.this,AepActivity.class);
                startActivity(i);
            }
        });

        ImageView iv_bambang = (ImageView) findViewById(R.id.iv_bambang);
        iv_bambang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ContactItActivity.this,BambangActivity.class);
                startActivity(i);
            }
        });

        ImageView iv_bimo = (ImageView) findViewById(R.id.iv_bimo);
        iv_bimo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ContactItActivity.this,BimoActivity.class);
                startActivity(i);
            }
        });

        ImageView iv_heri = (ImageView) findViewById(R.id.iv_heri);
        iv_heri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ContactItActivity.this,HeriActivity.class);
                startActivity(i);
            }
        });

        ImageView iv_soim = (ImageView) findViewById(R.id.iv_Soim);
        iv_soim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ContactItActivity.this,SoimActivity.class);
                startActivity(i);
            }
        });

        ImageView iv_yudi = (ImageView) findViewById(R.id.iv_Yudi);
        iv_yudi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ContactItActivity.this,YudiActivity.class);
                startActivity(i);
            }
        });
    }
}
