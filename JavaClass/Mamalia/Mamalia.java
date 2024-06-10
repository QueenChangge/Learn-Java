package Mamalia;

abstract public class Mamalia {
    public String nama;
    public int usia;

    public abstract void bersuara();

    public abstract void makan();

    public void bernapas(){
        System.out.println(this.nama + " bernapas dengan paru-paru");
    }
}
