package TugasInheritance;

public class Scopy extends SepedaMotor{
    int stiker;
    String model;
    int lampuhidup;

    // Method
    public void jalanNanjak(){
        if(this.model.equals("2022")){
            System.out.println("Aku scopy " +this.warna+" model "+this.model +", kuat nanjak dong dengan roda "+this.roda);
        }else if(this.model.equals("2023")){
            System.out.println("Aku scopy "+ this.warna+" model "+this.model +", tidak kuat nanjak lah:(" );
        }else{
            System.out.println("Maaf ya ngga terdata scopy "+ this.warna+" model "+this.model+" anda");
        }
    }

}
