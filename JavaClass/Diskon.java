import java.util.Scanner;

public class Diskon {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Harga Belanjaan : ");
        double hargaBelanja = input.nextDouble();

        double diskon;

        if(hargaBelanja > 50000){
            diskon = 0.5;
            double nilaiDiskon = hargaBelanja*diskon;
            if(nilaiDiskon > 40000){
                nilaiDiskon = 40000;
            }
            double totalHarga = hargaBelanja - nilaiDiskon;
            System.out.println("Total harga setelah diskon : Rp. "+ totalHarga);
        }else{
            diskon = 0;
            System.out.println("Total harga tanpa diskon : Rp. "+ hargaBelanja);
        }


        if((hargaBelanja*0.5) > 40000){
            System.out.println("Selamat anda mendapatkan gratis ongkir");
        } else{
            System.out.println("Anda dikenakan biaya ongkir sebesar 10000");
        }

    }
}
