import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        //scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();
        //you need to add more nextLine because of the nextInt stop the nextLine input

        System.out.println("What is your favorite food? ");
        String food = scanner.nextLine();

        System.out.println("Hello "+ name);
        System.out.println("Your age is "+ age + " years old");
        System.out.println("You like "+ food);
        

    }

}
