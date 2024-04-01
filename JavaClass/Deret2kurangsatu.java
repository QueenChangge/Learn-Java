public class Deret2kurangsatu {
    public static void main(String[] args) {
        int base = 2;
        for (int i = 1; i <= 10; i++){
            System.out.print(base + ", ");
            if(i % 2 != 0){
                base = base * 2;
            } else{
                base = base - 1;
            }
            
        }
    }
}
