package com.dewanda.helloword

import android.Manifest
import android.content.DialogInterface
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        if (ContextCompat.checkSelfPermission(
                this@HomeActivity,
                Manifest.permission.CALL_PHONE
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this@HomeActivity,
                arrayOf(Manifest.permission.CALL_PHONE),
                TelephoneActivity.CONTEXT_INCLUDE_CODE
            )
        } else {
            ActivityCompat.requestPermissions(
                this@HomeActivity,
                arrayOf(Manifest.permission.CALL_PHONE),
                ContactItActivity.CONTEXT_INCLUDE_CODE
            )
        }

        if (ContextCompat.checkSelfPermission(
                this@HomeActivity,
                Manifest.permission.READ_EXTERNAL_STORAGE
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this@HomeActivity,
                arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE),
                TelephoneActivity.CONTEXT_INCLUDE_CODE
            )
        } else {
            ActivityCompat.requestPermissions(
                this@HomeActivity,
                arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE),
                ContactItActivity.CONTEXT_INCLUDE_CODE
            )
        }


        iv_office.setOnClickListener {
            startActivity(Intent(this, OfficeActivity::class.java))
            overridePendingTransition(R.anim.slide_in, R.anim.slide_in_out)
        }

        iv_file.setOnClickListener {
            startActivity(Intent(this, FirebaseUpload::class.java))
            overridePendingTransition(R.anim.slide_in, R.anim.slide_in_out)
        }

        iv_store_contact.setOnClickListener {
            startActivity(Intent(this, TelephoneActivity::class.java))
            overridePendingTransition(R.anim.slide_in, R.anim.slide_in_out)

        }

        iv_map.setOnClickListener {
           startActivity(Intent(this, MapActivity::class.java))
            overridePendingTransition(R.anim.slide_in, R.anim.slide_in_out)
        }

        iv_contactit.setOnClickListener {
            startActivity(Intent(this, ContactItActivity::class.java))
            overridePendingTransition(R.anim.slide_in, R.anim.slide_in_out)
        }
    }

        override fun onBackPressed() {
            AlertDialog.Builder(this)
                .setTitle("Konfirmasi")
                .setMessage("Apakah Anda yakin ingin keluar?")
                .setPositiveButton("Ya", DialogInterface.OnClickListener { dialogInterface, i ->
                    Toast.makeText(
                        this, "Terimakasih telah menggunakan Aplikasi ini",
                        Toast.LENGTH_LONG
                    ).show()
                    System.exit(0);

                })
                .setNegativeButton("Batal", DialogInterface.OnClickListener { dialogInterface, i ->
                })
                .show()
        }
    }
