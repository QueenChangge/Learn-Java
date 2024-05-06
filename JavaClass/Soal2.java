import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double hargaBeli, ongkir;

        System.out.print("Harga Beli : ");
        hargaBeli = input.nextDouble();

        System.out.print("Biaya ongkir : ");
        ongkir = input.nextDouble();

        if(hargaBeli > 10000){
            System.out.println("Biaya yang harus dibayar = Rp. "+hargaBeli);
            System.out.println("Anda Mendapatkan gratis ongkir ");

        }else{
            System.out.println("Biaya yang harus dibayar = Rp"+ (hargaBeli + ongkir));
        }
    }
}
