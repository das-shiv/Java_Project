import java.util.Scanner;

public class Voter {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = scan.nextInt();
        scan.nextLine();

        if(age >= 18)
        System.out.println("You are eligible for voting.");

        else if(age < 18)
        System.out.println("You are not eligible for voting.");
        scan.close();
    }
    
}
