public class PPN {

    static void myMethod(double value){
        double produk;
        produk = value * 1.11;
        System.out.println("Harga Produk ditambah PPN adalah "+ produk);
    }
    public static void main(String[] args) {
        myMethod(100000);
    }
}
