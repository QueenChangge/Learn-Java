import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Harga Belanja : ");
        double harga = input.nextDouble();

        if(harga > 100000){
            double diskon = 0.2;
            double totalDiskon = harga * diskon;
            if(totalDiskon >= 50000){
                totalDiskon = 50000;
            }
            double hargaTotal = harga - totalDiskon;
            System.out.println("Nilai diskon : "+ totalDiskon);
            System.out.println("Harga Total yang dibayarkan setelah diskon : "+ hargaTotal);
        }else{
            System.out.println("Harga Total yang dibayarkan tanpa diskon : "+ harga);
        }
    }
}
