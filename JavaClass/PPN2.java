import java.util.Scanner;

public class PPN2 {
    public static void main(String[] args) {
        //scanner object
        Scanner input = new Scanner(System.in);

        Double harga, produkKenaPPN;

        System.out.println("Harga Produknya : ");
        harga = input.nextDouble();

        System.out.println("Harga produk adalah "+ harga);

        produkKenaPPN = harga * 0.11;
        System.out.println("Nilai PPN produk adalah "+ produkKenaPPN);
        System.out.println("Harga Produk ditambah PPN adalah "+ (harga + produkKenaPPN));

     
        

    }

}
