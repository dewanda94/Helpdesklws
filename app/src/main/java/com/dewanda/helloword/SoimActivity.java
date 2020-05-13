package com.dewanda.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SoimActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soim);

        Button btn_callsoim = (Button) findViewById(R.id.btn_callsoim);
        btn_callsoim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "081380789271"));
                startActivity(intent);
            }
        });

        Button btn_callwasoim = (Button) findViewById(R.id.btn_callwasoim);
        btn_callwasoim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse("smsto:" + "6281380789271");
                Intent i = new Intent(Intent.ACTION_SENDTO, uri);
                i.setPackage("com.whatsapp");
                startActivity(Intent.createChooser(i, ""));

                /*
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://wa.me/=6281380789271"));
                startActivity(i);
                */
            }
        });
    }
}
