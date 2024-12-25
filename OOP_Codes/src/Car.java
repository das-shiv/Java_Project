import java.util.Scanner;
public class Car {
    //String model;
    //String color;
    int wheels;
    int topSpeed;
    //int fuelInLiters;

    public void drive(String model, String  color, int fuelInLiters){

        System.out.println("You are now driving a "+color+ " color " +model + " car.");
        while(fuelInLiters > 0) {
            System.out.println("The Car is driving");
            fuelInLiters--;
            System.out.println("Remaining fuel is " + fuelInLiters +" liters.");
        }

        if (fuelInLiters == 0){
            System.out.println("Tank is empty, how much Fuels you want to add? ");
            Scanner input = new Scanner(System.in);
            fuelInLiters = input.nextInt();
            input.close();
            System.out.println("Now you have "+ fuelInLiters + " Liters fuel.");
            System.out.println("Restarting the car...");
            drive(model, color, fuelInLiters);

        }
    }

}
