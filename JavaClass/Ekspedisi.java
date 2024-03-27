import java.util.Scanner;

public class Ekspedisi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Berat total produk (kg) : ");
        Double beratProduk = input.nextDouble();

        Double hargaOngkir;
        if(beratProduk > 1){
            beratProduk = beratProduk - 1;
            Double pengurangBerat = beratProduk % 0.5;
            Double sisaBerat = (beratProduk - pengurangBerat) / 0.5;
            hargaOngkir = 5000 + (sisaBerat*4000);
        }else{
            hargaOngkir = .0;
        }

        System.out.println("Total ongkos kirim yang dibayarkan : "+ hargaOngkir);
        
        
        
    }
}
