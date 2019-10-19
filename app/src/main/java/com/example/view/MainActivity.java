package com.example.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

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
