package TugasInheritance;

public class Scopy extends SepedaMotor{
    // Atribut tambahan
    int stiker;
    String model;
    int lampuhidup;

    // Method
    public void jalanNanjak(){
        System.out.println("Aku scopy " +this.warna+" model "+this.model +", kuat nanjak dong dengan roda "+this.roda);
    }
    public void inginTerbang(){
        System.out.println("Aku scopy "+ this.warna+" model "+this.model +", punya kekuatan super untuk terbang. Tapi jatuh:(");
    }

}
