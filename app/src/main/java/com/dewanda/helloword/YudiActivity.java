package com.dewanda.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class YudiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yudi);

        Button btn_callyudi = (Button) findViewById(R.id.btn_callwayudi);
        btn_callyudi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "081295520692"));
                startActivity(intent);
            }
        });

        Button btn_callwayudi = (Button) findViewById(R.id.btn_callwayudi);
        btn_callwayudi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("smsto:" + "6281295520692");
                Intent i = new Intent(Intent.ACTION_SENDTO, uri);
                i.setPackage("com.whatsapp");
                startActivity(Intent.createChooser(i, ""));
                /*
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://wa.me/=6281295520692"));
                startActivity(i);
                 */
            }
        });
    }
}