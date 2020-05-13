package com.dewanda.helloword;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dewanda.helloword.R;
import com.dewanda.helloword.RecyclerViewAdapter;

import java.util.ArrayList;

public class StoreContactActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> DataNamaToko;
    private ArrayList<Integer> DataDP;
    private String[] NamaToko = {
            "ABDULLAH SAFEI"
            , "AEROPOLIS"
            , "AKSES UI"
            , "APT BELLEZZA"
            , "BANDARA TERMINAL 2E"
            , "BENDUNGAN WALAHAR"
            , "BTPN TOWER"
            , "BENDUNGAN WALAHAR"
            , "BTPN TOWER"
            , "BUNDA MULIA"
            , "CBD PLUIT"
            , "CEMPAKA MAS"
            , "DR. SATRIO"
            , "EQUITY TOWER"
            , "GRAHA MANDIRI"
            , "GRAHA SUCOFINDO"
            , "GRAHA SURVEYOR"
            , "GRAHA TAMIYA"
            , "ITC DEPOK"
            , "KEBON KACANG"
            , "KELAPA GADING BLVRD"
            , "KEMANG RAYA"
            , "KOTA WISATA"
            , "KTB MITSUBISHI"
            , "LANDMARK PLUIT"
            , "M GOLD"
            , "MANGGA BESAR RAYA"
            , "MANGGA DUA SQUARE"
            , "MEDITERANIA 1"
            , "MENARA ASTRA"
            , "MENARA DANAMON"
            , "MENARA MULIA"
            , "MERUYA SELATAN"
            , "METROPOLITAN MALL"
            , "MID PLAZA"
            , "MITSUBISHI (MMKI)"
            , "MRT FATMAWATI"
            , "MRT SENAYAN"
            , "PERCETAKAN NEGARA"
            , "PERMATA KARAWACI"
            , "PGC"
            , "PGC 2"
            , "RAWA BELONG"
            , "RAYA CIPETE"
            , "RAYA PAMULANG"
            , "RAYA PRAMUKA"
            , "REST AREA KM 10"
            , "REST AREA KM 43"
            , "REST AREA KM 6 B"
            , "REST AREA KM 72A"
            , "REST AREA KM. 39"
            , "REST AREA KM. 42"
            , "REST AREA KM. 57"
            , "RSAB HARAPAN KITA"
            , "RUKO VERSAILLES"
            , "RUKO VIENNA"
            , "SARINAH"
            , "SCK PERCETAKAN"
            , "SEKOLAH BUNDA MULIA"
            , "SENTRAL SENAYAN II"
            , "SINGARAJA"
            , "STASIUN GAMBIR"
            , "STASIUN GONDANGDIA"
            , "STASIUN MANGGARAI"
            , "STASIUN SENEN"
            , "STASIUN SUDIRMAN"
            , "SUNTER KIRANA"
            , "SYAHDAN"
            , "SYAHDAN 2"
            , "TAMAN MALAKA SELATAN"
            , "TANGERANG CITY"
            , "THAMRIN CITY"
            , "UBM TOWER ALAM SUTERA"
            , "UIN KERTAMUKTI"
    };
    private int[] Dp = {
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
            R.drawable.ic_contact,
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_contact);

        DataNamaToko = new ArrayList<>();
        DataDP = new ArrayList<>();
        recyclerView = findViewById(R.id.recycler);
        DaftarItem();
        //Menggunakan Layout Manager, Dan Membuat List Secara Vertical
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        //Membuat Underline pada Setiap Item Didalam List
        DividerItemDecoration itemDecoration = new DividerItemDecoration(getApplicationContext(), DividerItemDecoration.VERTICAL);
        itemDecoration.setDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.line));
        recyclerView.addItemDecoration(itemDecoration);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        adapter = new RecyclerViewAdapter(DataNamaToko, DataDP);
        //Memasang Adapter pada RecyclerView
        recyclerView.setAdapter(adapter);
    }

    private void DaftarItem() {
        for (int w = 0; w < NamaToko.length; w++) {
            DataDP.add(Dp[w]);
            DataNamaToko.add(NamaToko[w]);
        }
    }

}