import java.util.Scanner;

public class DiskonWajib {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Harga beli : ");
        Double hargaBeli = input.nextDouble();

        if(hargaBeli > 100000){
            Double diskon = 0.2;
            Double nilaiDiskon = diskon * hargaBeli;

            if(nilaiDiskon > 50000){
                nilaiDiskon = 50000.0;
            }

            Double hargaAkhir = hargaBeli - nilaiDiskon;
            System.out.println("Harga akhir yang harus dibayar : " + hargaAkhir);
        }else{
            System.out.println("Harga akhir yang harus dibayar : " + hargaBeli);
        }
    }
}
