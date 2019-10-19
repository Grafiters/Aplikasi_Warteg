package com.example.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    private List<Makanan> makananList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MakananAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler);

        mAdapter = new MakananAdapter(makananList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);

        recyclerView.addOnItemTouchListener(new RecyclerClickListener(getApplicationContext(), recyclerView, new RecyclerViewClick() {
            @Override
            public void onClick(View view, int position) {
                Intent intent = new Intent(MainActivity.this, detail_menu.class);
                startActivity(intent);

//                Toast.makeText(getApplicationContext(), makananList.get(position).getNama() + " is click pressed!", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onLong(View view, int position) {
//                Intent intent = new Intent(MainActivity.this, detail_menu.class);
//                startActivity(intent);
                Toast.makeText(getApplicationContext(), makananList.get(position).getNama() + " is long pressed!", Toast.LENGTH_SHORT).show();
            }
        }));

        prepareMakanan();
    }

    private void prepareMakanan() {
        Makanan makanan = new Makanan("tongseng", "12000", "Tongseng makanan khas pedesaan yang baisa disajikan saat masih hangat");
        makananList.add(makanan);
        makanan = new Makanan("nasi goreng", "12000", "Nasgor yang sudah menjaid makanan bagi semua kalangan");
        makananList.add(makanan);
        makanan = new Makanan("ikan kakap", "12000", "Makanan ini adalah jenis menu terbaru dari warteg kami dan mempunyai rasa yang tidak kalah enaknya");
        makananList.add(makanan);
        makanan = new Makanan("tempe", "12000", "Tempe adalah makanan khas dari seluruh indonesia yang mempunyai beberapa manfaat yang sangat tinggi");
        makananList.add(makanan);
        makanan = new Makanan("tahu", "12000", "Jenis makanan seperti tempe namun lebih empuk dan padat berisi");
        makananList.add(makanan);
        makanan = new Makanan("lele", "12000", "Menu yang satu ini adalah salah satu menu yang menjadi favorit bagi para orang");
        makananList.add(makanan);
        makanan = new Makanan("nasi", "12000", "Makanan yang selalu membuat orang ketagihan karna warnanya dan rasanya");
        makananList.add(makanan);
        makanan = new Makanan("kecambah", "12000", "Jenis makanan yang biasanya digunakan untuk pelengkap makan");
        makananList.add(makanan);

        mAdapter.notifyDataSetChanged();
    }

}
