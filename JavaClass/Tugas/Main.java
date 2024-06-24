package Tugas;

public class Main {
    public static void main(String[] args) {
        Cincin c = new Cincin();
        c.nama = "Cincin batu akik";
        c.harga = "3 juta";
        c.ukuran = "kecil";

        c.pakai();
        c.menyesal();


        JamTangan jt = new JamTangan();
        jt.nama = "Jam tangan berlian";
        jt.harga = "2 milliar";
        jt.ukuran = "besar";

        jt.pakai();
        jt.menyesal();
    
    }
}
