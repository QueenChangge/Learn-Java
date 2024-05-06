import java.util.Scanner;

public class ganjilgenap {
    public static void main(String[] args) {
        

        // for(int j = 1; j<= 15; j++){
        //     for (int i = 1; i <= 10; i++){
        //         if(10 % i == 0){
        //             int bilangan[j] = i;
        //         }
        // }

        
        // }



        Scanner ipt = new Scanner(System.in);
        int bil1, bil2;
        int faktor1[] = new int[10];
        int faktor2[] = new int[10];

        System.out.println("Input bilangan satu : ");
        bil1 = ipt.nextInt();
        bil2 = ipt.nextInt();

        int idx = 0;

        for (int i = 1; i <= bil1; i++){
            if(bil1 % i == 0){
                faktor1[idx] = bil1;
                idx++;
            }
        }

        for (int i = 1; i <= bil2; i++){
            if(bil2 % i == 0){
                faktor2[idx] = bil1;
                idx++;
            }
        }

        System.out.println("Faktor dari"+ bil1);
        for (int i : faktor1){
            System.out.println();
        }
    }
}
