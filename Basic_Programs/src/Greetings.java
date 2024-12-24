import java.util.Scanner;
public class Greetings {
    public static void main(String[] args) {
        System.out.println("This program takes in User Inputs and Prints them on terminal.");

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = input.nextLine();

        System.out.println("Please enter your age: ");
        int age = input.nextInt();

        System.out.println("Please enter your CGPA: ");
        double cgpa = input.nextDouble();

        System.out.println("Are you still studying ?");
        boolean study = input.nextBoolean();

        input.close();

        System.out.println("Hello " +name +" , it's nice to meet you.");
        System.out.println("You are " +age + " years old.");
        System.out.println("Your CGPA is  " +cgpa + " .");
        if (study == true){
            System.out.println("You are still studying.");
        }
        else {
            System.out.println("You have completed your studies.");
        }

    }
}
