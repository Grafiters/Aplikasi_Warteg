package com.example.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class detail_menu extends AppCompatActivity {

    TextView nama, harga, desc;
    ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        nama = (TextView)findViewById(R.id.nama);
        harga = (TextView)findViewById(R.id.harga);
        desc = (TextView)findViewById(R.id.desc);
        image = (ImageView) findViewById(R.id.image);


    }
}
