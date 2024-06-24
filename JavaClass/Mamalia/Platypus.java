package Mamalia;

public class Platypus extends Mamalia {
    String warnaplaty;
    
    @Override 
    public void bersuara(){
        System.out.println(this.nama + " bersuara gkkrkgkkgg");
    }

    @Override 
    public void makan(){
        System.out.println(this.nama + " makan lil fish, lil worm" + warnaplaty);
    }
}
