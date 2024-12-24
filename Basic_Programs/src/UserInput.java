import java.util.Scanner;

public class UserInput{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name :");
        String name = scan.nextLine();

        System.out.println("Enter your age :");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your favorite color :");
        String color = scan.nextLine();

        System.out.println("Hello " + name +" , nice to meet you.");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your favorite color is " + color);

        scan.close();



        
    }
    
}
