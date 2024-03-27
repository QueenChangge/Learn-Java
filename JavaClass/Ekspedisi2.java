import java.util.Scanner;

public class Ekspedisi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input berat barang
        System.out.print("Masukkan berat barang (kg): ");
        double beratBarang = scanner.nextDouble();

        // Hitung biaya per kg
        double biayaPerKg = 5000;

        // Hitung biaya tambahan
        double biayaTambahan = 0;
        if (beratBarang > 1) {
            double beratTambahanKg = beratBarang - 1;
            int jumlahKelipatan500gr = (int) Math.ceil(beratTambahanKg * 2) / 2;
            biayaTambahan = jumlahKelipatan500gr * 4000;

            System.out.println(Math.ceil(2.3));
        }

        // Hitung total ongkos kirim
        double totalOngkosKirim = biayaPerKg + biayaTambahan;

        

        // Tampilkan hasil
        System.out.println("Total ongkos kirim: Rp" + totalOngkosKirim);
    }
}
