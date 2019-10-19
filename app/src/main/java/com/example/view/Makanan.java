package com.example.view;

public class Makanan {
    private String nama, harga, desc;

    public Makanan(String nama, String harga, String desc){
        this.nama = nama;
        this.harga = harga;
        this.desc = desc;
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

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
