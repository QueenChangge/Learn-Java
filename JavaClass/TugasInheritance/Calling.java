package TugasInheritance;

import java.util.Scanner;

public class Calling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scopy koko = new Scopy();
        System.out.print("Warna Scopy anda : ");
        koko.warna = input.nextLine();
        System.out.print("Tipe Scopy anda : ");
        koko.model = input.nextLine();

        koko.gas();
        koko.jalanNanjak();
        koko.inginTerbang();
        koko.terjun();
    }
}
