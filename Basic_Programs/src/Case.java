import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        //Trying out switch cases in Java

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 1 to 7 : ");

        int a = scan.nextInt();
        scan.close();
        switch (a) {
            case 1:
            System.out.println("Today is : Monday");
                break;
            case 2:
            System.out.println("Today is : Tuesdas" );
                break;
            case 3:
            System.out.println("Today is : Wednesday");
                break;

            case 4:
            System.out.println("Today is : Thursday");
                break;
            
            case 5:
            System.out.println("Today is : Friday");
                break;
            
            case 6:
            System.out.println("Today is : Saturday");
                break;
            
            case 7:
            System.out.println("Today is : Sunday");
                break;
            
            default:
            System.out.println("Enter a value between 1 and 7");
                break;
        }
    }
    
}
