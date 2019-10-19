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
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
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
        Makanan makanan = new Makanan("tongseng", "12000");
        makananList.add(makanan);
        makanan = new Makanan("nasi goreng", "12000");
        makananList.add(makanan);
        makanan = new Makanan("ikan kakap", "12000");
        makananList.add(makanan);
        makanan = new Makanan("tempe", "12000");
        makananList.add(makanan);
        makanan = new Makanan("tahu", "12000");
        makananList.add(makanan);
        makanan = new Makanan("lele", "12000");
        makananList.add(makanan);
        makanan = new Makanan("nasi", "12000");
        makananList.add(makanan);
        makanan = new Makanan("kecambah", "12000");
        makananList.add(makanan);

        mAdapter.notifyDataSetChanged();
    }

}
