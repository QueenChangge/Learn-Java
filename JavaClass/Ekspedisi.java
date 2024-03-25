import java.util.Scanner;

public class Ekspedisi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Berat total produk : ");
        Double beratProduk = input.nextDouble();

        int hargaOngkir;
        if(beratProduk > 1){
            beratProduk = beratProduk - 1;
            double jumlahKali = (int) Math.floor(beratProduk) / 0.5;
            hargaOngkir = 5000 + (int)(jumlahKali*4000);
        }else{
            hargaOngkir = 0;
        }

        System.out.println("Total harga ongkos kirim : Rp. "+ hargaOngkir);
        
        
    }
}
