class Cars{
    String brand;
    float price;
    static String type = "Vehicle";     // static variable

    public void display(){
        System.out.println("From the non static display method, called using an object of Cars class");
        System.out.println("Brand is: " +brand+ " : Price is: " +price+ " : type is: " +type);
    }

    public static void StaticMethod(){
        System.out.println("This is from StaticMethod method called without any object");
    }

    public static void display2(Cars obj2){
        System.out.println("This is from display2 static method called using an object of Cars class.");
      //  System.out.println("Brand is: " +brand+ " : Price is: " +price+ " : Price is: " +price );
        // we can not access non-static variables brand and price directly
        System.out.println("Brand is: " +obj2.brand+ " : Price is: " +obj2.price+ " : Type is :" +type );

        // taking an obj as argument we can access the non-static variables that belongs to that object.
        // we can access the static variables directly

    }
}


public class StaticMethod {
    public static void main(String[] args) {
        System.out.println("Testing Static methods and Static Variables: ");

        Cars.StaticMethod();

        Cars car1 = new Cars();
        car1.brand = "Tesla";
        car1.price = 50000;
        car1.display();

        Cars.display2(car1);
    }
}