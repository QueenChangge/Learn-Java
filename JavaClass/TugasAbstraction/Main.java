package TugasAbstraction;

public class Main {
    public static void main(String[] args) {
        Chef chefi = new Chef();
        chefi.id_karyawan = "129XY";
        chefi.nama = "Fifi";
        chefi.bekerja();
        chefi.emosian();
        chefi.terimaGaji();


        FrontOffice offi = new FrontOffice();
        offi.id_karyawan = "1009HOPE";
        offi.nama = "Fian";
        offi.bekerja();
        offi.emosian();

        offi.terimaGaji();
    
    }
}
