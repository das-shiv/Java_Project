import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Car myCar = new Car();
        Scanner carDetails = new Scanner(System.in);
        System.out.println("Enter your car model: ");
        String carModel = carDetails.nextLine();
        System.out.println("Enter your car color: ");
        String carColor = carDetails.nextLine();
        System.out.println("How much fuel in liters do you have: ");
        int initialFuelLevel = carDetails.nextInt();
        carDetails.close();

        myCar.drive(carModel , carColor, initialFuelLevel);

    }

}
