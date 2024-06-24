package TugasAbstraction;

public class Chef extends Karyawan {
    @Override
    public void bekerja(){
        System.out.println("Saya seorang " +this.nama +" saat bekerja bunyinya dusss, byurrr, duarrrrrr");
    }

    @Override
    public void emosian(){
        System.out.println("Woi gw "+this.nama + " dah kerja panes\"an, tangan kebakar, gaji lama lagee");
    }
}
