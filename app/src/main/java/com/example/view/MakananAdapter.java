package com.example.view;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.MyViewHolder> {

    private List<Makanan> makananList;
    private Context mContext;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView nama,harga;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nama = (TextView) itemView.findViewById(R.id.nama);
            harga = (TextView) itemView.findViewById(R.id.harga);
        }
    }

    public MakananAdapter(List<Makanan> makananList){
        this.makananList = makananList;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.makanan_list, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        Makanan makanan = makananList.get(position);
        holder.nama.setText(makanan.getNama());
        holder.harga.setText(makanan.getHarga());


    }

    @Override
    public int getItemCount() {
        return makananList.size();
    }
}
