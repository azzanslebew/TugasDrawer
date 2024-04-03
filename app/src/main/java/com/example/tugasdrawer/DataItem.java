package com.example.tugasdrawer;

public class DataItem {
    String nama;
    String rating;
    int gambar;
    String button;

    public DataItem(String nama, String rating, int gambar, String button) {
        this.nama = nama;
        this.rating = rating;
        this.gambar = gambar;
        this.button = button;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

}
