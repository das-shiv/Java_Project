import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("This program takes array of numbers as input and produces a sum operation.");

        Scanner input = new Scanner(System.in);  //created a scanner to take user input
        System.out.print("How many numbers you want to add ? ");
        int count = input.nextInt();  //count variable stores the number of items user wants to give, i.e. the total number of items user wants to add.
        Double num[] = new Double[count]; // created am array named num that stores double type data.

        System.out.println("Please enter " + count + " number of elements.");
        // this loop runs for the number of times user wants to enter data
        for (int i = 0; i < count; i++) {
            System.out.print("Please enter the next number : ");
            num[i] = input.nextDouble();  // storing the user inputs in num array

        }

        SumOfArray obj = new SumOfArray();  // creating an object of the SumOfArray class
        double result = obj.sum(num);   //calling the sum method from SumOfArray class, passing the num array as parameter and storing the return in result variable

        System.out.println("The total sum of your numbers is :" + result );


    }

}
