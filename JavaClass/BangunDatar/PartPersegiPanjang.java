package BangunDatar;

public class PartPersegiPanjang{
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        pp.panjang = 12;
        pp.lebar = 15;

        System.out.println(pp.hitungLuas());
        System.out.println(pp.hitungKeliling());
        pp.penampil();
    }
}
