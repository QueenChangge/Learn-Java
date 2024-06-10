package Mamalia;

public class AbstraksiMamalia{
    public static void main(String[] args) {
        String nama;
        String usia;

        Platypus x = new Platypus();
        x.nama = "Platy";
        x.usia = 5;

        x.bersuara();
        x.makan();
        x.bernapas();
    }
}
