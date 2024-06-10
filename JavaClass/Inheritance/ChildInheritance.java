package Inheritance;

import java.util.Scanner;

public class ChildInheritance {
    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);
        MahasiswaDualDegree citra = new MahasiswaDualDegree();
        System.out.print("Nama : ");
        citra.nama = ipt.nextLine();
        System.out.print("Gelar 1 : ");
        citra.gelar_1 = ipt.nextLine();
        System.out.print("Gelar 2 : ");
        citra.gelar_2 = ipt.nextLine();

        citra.bayar();
        citra.kuliahDiKampusLain();


        // Mahasiswa agus = new Mahasiswa();
        // agus.nim = "220030213";
        // agus.nama = "Agus Surya";
        // agus.gelar_1 = "S.Kom";

        // agus.bayar();
        // agus.kuliah();


        // MahasiswaDualDegree dinda = new MahasiswaDualDegree();
        // dinda.nim = "220030888";
        // dinda.nama = "Dinda Puji";
        // dinda.gelar_1 = "S.Kom";
        // dinda.gelar_2 = "S.Ds";

        // dinda.bayar();
        // dinda.kuliah();
        // dinda.kuliahDiKampusLain();
    }
}
