package Inheritance;

public class Mahasiswa {
    // atribut
    public String nim;
    public String nama;
    public String gelar_1;

    // method
    public void bayar(){
        System.out.println(this.nama + ","+ this.gelar_1+" bayar kuliah");
    }

    public void kuliah(){
        System.out.println(this.nama + ","+ this.gelar_1 + " kuliah");
    }
}
