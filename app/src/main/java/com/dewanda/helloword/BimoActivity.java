package com.dewanda.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BimoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bimo);

        Button btn_callbimo = (Button) findViewById(R.id.btn_bimo);
        btn_callbimo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "081295520691"));
                startActivity(intent);
            }
        });

        Button btn_callwabimo = (Button) findViewById(R.id.btn_callwabimo);
        btn_callwabimo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse("smsto:" + "6281295520691");
                Intent i = new Intent(Intent.ACTION_SENDTO, uri);
                i.setPackage("com.whatsapp");
                startActivity(Intent.createChooser(i, ""));

/*
        Button btn_callwabimo = (Button) findViewById(R.id.btn_callwabimo);
        btn_callwabimo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://wa.me/=6281295520691"));
                startActivity(i);
                */

            }
        });
    }
}