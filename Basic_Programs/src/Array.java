import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("This program takes array of numbers as input and produces a sum operation.");

        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers you want to add ? ");
        int count = input.nextInt();
        Double num[] = new Double[count];

        System.out.println("Please enter " + count + " number of elements.");
        for (int i = 0; i < count; i++) {
            System.out.print("Please enter the next number : ");
            num[i] = input.nextDouble();

        }

        SumOfArray obj = new SumOfArray();
        double result = obj.sum(num);

        System.out.println("The total sum of your numbers is :" + result );


    }

}
