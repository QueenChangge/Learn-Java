package Tugas;

public class JamTangan extends Perhiasan{
    @Override
    public void pakai(){
        System.out.println("Saya beli " + this.nama + ", tapi entah kenapa karena "+ this.ukuran+" jadi malas saya pakai");
    }

    @Override
    public void menyesal(){
        System.out.println("Kenapa "+ this.nama + " lecet, padahal baru beli dan harganya "+ this.harga);
    }
}
