package Inheritance;

public class MahasiswaDualDegree extends Mahasiswa{
    public String gelar_2;

    public void kuliahDiKampusLain(){
        System.out.println(this.nama + ","+ gelar_1+".,"+gelar_2+" kuliah di kampus lain, tapi online");
    }
}
