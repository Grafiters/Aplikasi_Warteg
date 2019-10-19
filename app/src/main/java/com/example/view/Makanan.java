package com.example.view;

public class Makanan {
    private String nama, harga;

    public Makanan(String nama, String harga){
        this.nama = nama;
        this.harga = harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getHarga() {
        return harga;
    }
}
