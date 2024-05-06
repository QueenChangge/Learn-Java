public class Soal1 {
    public static void main(String[] args) {
        Double satuanRoti, satuanIkanAsin, satuanGaram, totalRoti, totalIkanAsin, totalGaram, hutang, totalBelanjaan;
        satuanRoti = 5000.0;
        satuanIkanAsin = 30000.0;
        satuanGaram = 10000.0;
        hutang = 12000.0;
        
        totalRoti = 6.0 * satuanRoti;
        totalIkanAsin = 0.5 * satuanIkanAsin;
        totalGaram = 0.25 * satuanGaram;
        totalBelanjaan = totalRoti + totalIkanAsin + totalGaram;
        System.out.println("Total Belanjaan Pak Somat dengan hutang : Rp. "+ (totalBelanjaan+hutang) );
    }
}
