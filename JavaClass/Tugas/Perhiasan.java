package Tugas;

public abstract class Perhiasan {
    public String nama;
    public String ukuran;
    public String harga;

    public abstract void pakai();
    public abstract void menyesal();

    public void simpan(){
        System.out.println("Saya suka menyimpan " + this.nama + " di tempat khusus dan rahasia");
    }
}
