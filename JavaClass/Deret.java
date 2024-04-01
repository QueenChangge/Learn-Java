public class Deret {
    // public static void main(String[] args) {
    //     int deret = 1;
    //     for(int i = 1; i <= 10; i++){   
    //         System.out.print(deret + ", ");
    //         deret = deret * 2;
    //     }
    // }
    public static void main(String[] args) {
        
        for (int i = 0; i <= 10; i++){
            int deret;
            deret = (int) Math.pow(2, i);
            System.out.println(deret);

        }
    }
}
