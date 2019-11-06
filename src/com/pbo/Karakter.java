package com.pbo;

public class Karakter {
    private String nama;
    private String jenisKelamin;
    private String pekerjaan;

    public Karakter(String nama, String jenisKelamin, String pekerjaan) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.pekerjaan = pekerjaan;
    }

    public String getNama() {
        return nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

}
