package OOP.PersegiPanjang;

public class PersegiPanjang {
    // atribut
    public int panjang;
    public int lebar;

    // method
    public void hitungLuas(){
        int panjang = 8;
        int luas = this.panjang*this.lebar;
        int luas2 = panjang*this.lebar;
        System.out.println("Luas persegi panjang = "+luas);
        System.out.println("Luas persegi panjang pakai local variable = "+luas2);

    }


    public void hitungKeliling(){
        int keliling = 2 * (this.panjang + this.lebar);
        System.out.println("Keliling persegi panjang = "+keliling);

    }
}
