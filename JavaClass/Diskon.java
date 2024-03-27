import java.util.Scanner;

public class Diskon {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Total Belanjaan : ");
        double totalBelanja = input.nextDouble();

        double diskon;

        if(totalBelanja > 50000){
            diskon = 0.5;
            double nilaiDiskon = totalBelanja*diskon;
            if(nilaiDiskon > 40000){
                nilaiDiskon = 40000;
            }
            double totalHarga = totalBelanja - nilaiDiskon;
            System.out.println("Total pembayaran : Rp. "+ totalHarga);
        }else{
            // diskon = 0;
            System.out.println("Total pembayaran : Rp. "+ totalBelanja);
        }


        if((totalBelanja*0.5) > 40000){
            System.out.println("Selamat anda mendapatkan gratis ongkir");
        } else{
            System.out.println("Anda dikenakan biaya ongkir sebesar 10000");
        }

    }
}
