package Mamalia;

public class AbstraksiMamalia{
    public static void main(String[] args) {

        Platypus x = new Platypus();
        x.nama = "Platy";
        x.usia = 5;

        x.bersuara();
        x.makan();
        x.bernapas();
    }
}
