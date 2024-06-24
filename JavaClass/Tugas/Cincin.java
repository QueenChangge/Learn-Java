package Tugas;

public class Cincin extends Perhiasan {
    @Override
    public void pakai(){
        System.out.println("Saya pakai " + this.nama + "rasanya gimana ya, mungkin karena ukurannya "+ this.ukuran);
    }

    @Override
    public void menyesal(){
        System.out.println("Saya menyesal beli " + this.nama + " karena harganya "+ this.harga);
    }
}
