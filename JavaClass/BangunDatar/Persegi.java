package BangunDatar;

public class Persegi extends BangunDatar{
    public double sisi;

    @Override 
    public double hitungLuas(){
        double luas = this.sisi * this.sisi;
        return luas;
    }

    @Override 
    public double hitungKeliling(){
        double keliling = 4*this.sisi;
        return keliling;
    }

    @Override 
    public void penampil(){
        this.nama = "fire";
        System.err.println(this.nama + " for Fire");
    }
}
