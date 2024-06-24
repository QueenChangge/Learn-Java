package TugasUAS.Soal2;

public class Main {
    public static void main(String[] args) {
        Warrior W = new Warrior();
        W.nama_hero = "Wu Zong";
        W.role = "warrior";
        W.strength = 15;
        W.healing();

        Mage M = new Mage();
        M.nama_hero = "Chang'e";
        M.role = "mage";
        M.intelligence = 25;
        M.healing();
    }   
}
