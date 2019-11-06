package com.pbo;

public class TokohUtama extends Karakter {
    private String hubungan;

    public TokohUtama(String nama, String jenisKelamin, String pekerjaan, String hubungan) {
        super(nama, jenisKelamin, pekerjaan);
        this.hubungan = hubungan;
    }

    public String getHubungan() {
        return hubungan;
    }

    public void tampilTokoh() {
        System.out.println("Nama\t\t\t: " + getNama());
        System.out.println("Jenis Kelamin\t: " + getJenisKelamin());
        System.out.println("Pekerjaan\t\t: " + getPekerjaan());
        System.out.println("Hubungan\t\t: " + getHubungan());
        System.out.println();
    }
}
