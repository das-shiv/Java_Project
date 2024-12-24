import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number you want to count : ");
        float num = input.nextFloat();
        input.close();

        for (float i=0; i<=num; i++)
        {
            System.out.println("Counting number : " +i);
        }
    }
    
}
