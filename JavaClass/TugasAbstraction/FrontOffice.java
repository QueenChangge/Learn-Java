package TugasAbstraction;

public class FrontOffice extends Karyawan{
    @Override
    public void bekerja(){
        System.out.println("Saya "+this.nama+" selalu rajin membantu dan mengarahkan tamu yang datang");
    }

    @Override
    public void emosian(){
        System.out.println("Woiii, gw "+ this.nama + ", pegel taw senyum terus dari tadeee");
    }
}
