package BangunDatar;

public class PersegiPanjang extends BangunDatar{
    public double panjang;
    public double lebar;

    @Override 
    public double hitungLuas(){
        double luas = this.panjang * this.lebar;
        return luas;
    }

    @Override 
    public double hitungKeliling(){
        double keliling = 2*(this.panjang + this.lebar);
        return keliling;
    }

    @Override 
    public void penampil(){
        this.nama = "fire";
        System.err.println(this.nama + " for Fire");
    }
}
