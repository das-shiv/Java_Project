import java.util.Scanner;
public class MultiDimensionalArray {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);    // Create the scanner object input //

         System.out.println("Enter the number of rows: ");
         int rows = input.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = input.nextInt();
        double[][] myArray = new double[rows][columns];  // a multi dimensional arrays with rows and columns entered by user

        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                System.out.println("Please enter the number in row " + (i+1) + " and column " + (j+1) );
                myArray[i][j] = input.nextDouble();

            }
        }



       for (int i=0; i<rows; i++){
           for (int j=0; j<columns; j++){
               System.out.print(myArray[i][j] + " ");
           }
           System.out.println();
       }

    }
}
