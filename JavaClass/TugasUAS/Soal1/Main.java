package TugasUAS.Soal1;

public class Main {
    public static void main(String[] args) {
        KepalaBagian KB = new KepalaBagian();
        KB.nama = "David";
        KB.jabatan = "KaBag Pemasaran";
        KB.infoGaji();


        Direktur D = new Direktur();
        D.nama = "Citra";
        D.jabatan = "Direktur SDM";
        D.infoGaji();
    }
}
