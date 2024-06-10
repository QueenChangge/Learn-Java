package BangunDatar;

public class Lingkaran extends BangunDatar{
    public double jarijari;
    protected double phi = 3.14;

    @Override
    public double hitungLuas(){
        double luas = phi * jarijari * jarijari;
        return luas;
    }

    @Override
    public double hitungKeliling(){
        double keliling = 2 * phi * jarijari;
        return keliling;
    }

    @Override 
    public void penampil(){
        this.nama = "fire";
        System.err.println(this.nama + " for Fire");
    }
}
