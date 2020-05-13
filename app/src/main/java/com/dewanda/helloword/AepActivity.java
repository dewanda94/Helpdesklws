package com.dewanda.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AepActivity extends AppCompatActivity {

    Intent sendIntent = new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aep);

        Button btn_callaep = (Button) findViewById(R.id.btn_callaep);
        btn_callaep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "081380789270"));
                startActivity(intent);
            }
        });

        Button btn_callwaaep = (Button) findViewById(R.id.btn_callwaaep);
        btn_callwaaep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse("smsto:" + "6287886680408");
                Intent i = new Intent(Intent.ACTION_SENDTO, uri);
                i.setPackage("com.whatsapp");
                startActivity(Intent.createChooser(i, ""));

                /*
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://wa.me/=6287886680408"));
                sendIntent.setPackage("com.whatsapp");
                startActivity(i);
                * */
            }
        });
    }
}