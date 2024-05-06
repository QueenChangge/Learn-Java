package OOP.PersegiPanjang;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);

        PersegiPanjang pp = new PersegiPanjang();
        System.out.print("Input panjang : ");
        pp.panjang = ipt.nextInt();

        System.out.print("Input lebar : ");
        pp.lebar = ipt.nextInt();

        pp.hitungLuas();
        pp.hitungKeliling();
    }
    
}
