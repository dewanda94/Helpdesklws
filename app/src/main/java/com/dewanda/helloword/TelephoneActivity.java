package com.dewanda.helloword;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class TelephoneActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telephone);

        Button btn = (Button) findViewById(R.id.btn_aksesui);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "081380789936"));
                startActivity(intent);

            }
        });

        Button btn1 = (Button) findViewById(R.id.btn_RayaPramuka);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "081380789824"));
                startActivity(intent);
            }
        });

        Button btn2 = (Button) findViewById(R.id.btn_meruya);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "081380789952"));
                startActivity(intent);
            }
        });
        Button btn3 = (Button) findViewById(R.id.btn_bundamulia);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "081380789885"));
                startActivity(intent);
            }
        });
        Button btn4 = (Button) findViewById(R.id.btn_km57);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "081380790151"));
                startActivity(intent);
            }
        });
        Button btn5 = (Button) findViewById(R.id.btn_RayaCipete);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "081380789926"));
                startActivity(intent);
            }
        });
        Button btn6 = (Button) findViewById(R.id.btn_Mabes);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "081380789884"));
                startActivity(intent);
            }
        });
        Button btn7 = (Button) findViewById(R.id.btnTangcity);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "081380789973"));
                startActivity(intent);
            }
        });
        Button btn8 = (Button) findViewById(R.id.btn_km42);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "081380790117"));
                startActivity(intent);
            }
        });
        Button btn9 = (Button) findViewById(R.id.btn_km39);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "081380790145"));
                startActivity(intent);
            }
        });
        Button btn10 = (Button) findViewById(R.id.btn_PercetakanNegara);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "081380789819"));
                startActivity(intent);
            }
        });
        Button btn11 = (Button) findViewById(R.id.btn_SekolahBundaMulia);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "081380789875"));
                startActivity(intent);
            }
        });
        Button btn12 = (Button) findViewById(R.id.btn_Singaraja);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "081380789942"));
                startActivity(intent);
            }
        });
        Button btn13 = (Button) findViewById(R.id.btn_Dr_Satrio);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "081380789815"));
                startActivity(intent);
            }
        });
        Button btn14 = (Button) findViewById(R.id.btn_TamanMalakaSelatan);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "081380789916"));
                startActivity(intent);
            }
        });
        Button btn15 = (Button) findViewById(R.id.btn_Vienna);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "081380789967"));
                startActivity(intent);
            }
        });
        Button btn16 = (Button) findViewById(R.id.btn_permatakarawaci);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "081380789964"));
                startActivity(intent);
            }
        });

        Button btn17 = (Button) findViewById(R.id.rayapamulang);
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "081380789963"));
                startActivity(intent);
            }
        });

        Button btn18 = (Button) findViewById(R.id.btn_walahar);
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "081380790024"));
                startActivity(intent);
            }
        });

        Button btn19 = (Button) findViewById(R.id.btn_wisata);
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "081380790074"));
                startActivity(intent);
            }
        });

        }
    }