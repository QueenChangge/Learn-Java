package TugasUAS.Soal1;

public class KepalaBagian extends Karyawan {
    public int tunjangan_per_bulan = 1000000;

    @Override
    public int hitungGajiSebulan(){
        // Case : sebulan kita anggap ada 4 minggu, jadi karyawan kerja 5 hari setiap minggu dengan 8 jam kerja per hari
        // Menghitung gaji per hari
        int gaji_harian = 8 * gaji_per_jam;
        int gaji_mingguan = 5 * gaji_harian;
        int gaji_bulanan = 4 * gaji_mingguan;
        int total_gaji = gaji_bulanan + tunjangan_per_bulan;

        return total_gaji;
    }



}
