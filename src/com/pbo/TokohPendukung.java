package com.pbo;

public class TokohPendukung extends Karakter {

    private String panggilan;
    private String hubungan;

    public TokohPendukung(String nama, String jenisKelamin, String pekerjaan, String panggilan, String hubungan) {
        super(nama, jenisKelamin, pekerjaan);
        this.panggilan = panggilan;
        this.hubungan = hubungan;
    }

    public String getPanggilan() {
        return panggilan;
    }

    public String getHubungan() {
        return hubungan;
    }

    public void tampilTokoh() {
        System.out.println("Nama\t\t\t: " + getNama());
        System.out.println("Jenis Kelamin\t: " + getJenisKelamin());
        System.out.println("Pekerjaan\t\t: " + getPekerjaan());
        System.out.println("Panggilan\t\t: " + getPanggilan());
        System.out.println("Hubungan\t\t: " + getHubungan());
        System.out.println();
    }
}
