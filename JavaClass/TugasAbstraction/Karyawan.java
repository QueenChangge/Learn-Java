package TugasAbstraction;

public abstract class Karyawan {
    // attribute
    public String nama;
    public String id_karyawan;

    // abstract methods
    public abstract void bekerja();
    public abstract void emosian();


    // concrete method
    public void terimaGaji(){
        System.out.println("Karyawan dengan nama "+ this.nama +" dan id "+ this.id_karyawan +" sangat bahagia ketika menerima gaji");
    }


}
