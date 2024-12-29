import java.util.Scanner;
public class DisplayArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The size of your Array: ");
        int sizeOfArray = input.nextInt();

        Double[] myArray = new Double[sizeOfArray];

        for(int i=0; i < sizeOfArray; i++){
            System.out.println("Enter the next item: ");
            myArray[i] = input.nextDouble();

        }

        input.close();
        System.out.println("Your array is: ");
        for (int j=0 ; j < sizeOfArray; j++){
            System.out.print(myArray[j] + " ");
        }
    }

}
