package com.dewanda.helloword;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

    //Class Adapter ini Digunakan Untuk Mengatur Bagaimana Data akan Ditampilkan
    public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

        private ArrayList<String> arrayList;
        private ArrayList<Integer> storelist;

        public RecyclerViewAdapter(ArrayList<String> arrayList, ArrayList<Integer> storelist) {
            this.arrayList = arrayList;
            this.storelist = storelist;
        }

        //ViewHolder Digunakan Untuk Menyimpan Referensi Dari View-View
        public class ViewHolder extends RecyclerView.ViewHolder {

            private TextView NamaToko;
            private ImageView Dp;
            private RelativeLayout ItemList;

            public ViewHolder(View itemView) {
                super(itemView);
                NamaToko = itemView.findViewById(R.id.NamaToko);
                Dp = itemView.findViewById(R.id.Dp);
                ItemList = itemView.findViewById(R.id.item_list);
            }
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            //Membuat View untuk Menyiapkan dan Memasang Layout yang Akan digunakan pada RecyclerView
            View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_design, parent, false);
            ViewHolder VH = new ViewHolder(V);
            return VH;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            //Memasukan Nilai/Value Pada View-View Yang Telah Dibuat
            final String Nama = arrayList.get(position);
            holder.NamaToko.setText(Nama);
            holder.Dp.setImageResource(storelist.get(position));
            }

        @Override
        public int getItemCount() {
            //Menghitung Ukuran/Jumlah Data Yang Akan Ditampilkan Pada RecyclerView
            return arrayList.size();
        }
    }