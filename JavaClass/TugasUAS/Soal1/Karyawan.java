package TugasUAS.Soal1;

public abstract class Karyawan {
    public String NIK;
    public String nama;
    public String jabatan;
    
    public int gaji_per_jam = 30000;

    
    // method
    public abstract int hitungGajiSebulan();
    public void infoGaji(){
        System.out.println("Gaji "+nama+" dengan jabatan "+jabatan+ " yaitu "+ hitungGajiSebulan());
    };
}
