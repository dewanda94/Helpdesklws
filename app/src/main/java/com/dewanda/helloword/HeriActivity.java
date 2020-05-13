package com.dewanda.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HeriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heri);

        Button btn_callheri = (Button) findViewById(R.id.btn_callheri);
        btn_callheri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "081380789543"));
                startActivity(intent);
            }
        });
        Button btn_callwaheri = (Button) findViewById(R.id.btn_callwaheri);
        btn_callwaheri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            Uri uri = Uri.parse("smsto:" + "6289637787738");
            Intent i = new Intent(Intent.ACTION_SENDTO, uri);
                i.setPackage("com.whatsapp");
            startActivity(Intent.createChooser(i, ""));

         /*
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://wa.me/=6281380789543"));
                startActivity(i);
          */
            }
        });
    }
}