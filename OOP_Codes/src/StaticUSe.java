public class StaticUSe {
    String brand;
    int price;
    static String type = "Smartphone";  // static variable of the StaticUse class

    public void print(){
        System.out.println(brand + " : " + price + " : " + type );
    }

}

class mobile{
    public static void main(String[] args) {
        StaticUSe obj1 = new StaticUSe();
        StaticUSe obj2 = new StaticUSe();

        obj1.brand = "Apple";
        obj1.price = 1000;

        obj2.brand = "Samsung";
        obj2.price = 800;


        obj1.print();
        obj2.print();

        obj1.type = "mobile";   // this is updating the static variable, so it will be updated for all objects
        System.out.println("After updating the static variable with obj1.");
        obj1.print();
        obj2.print();
        System.out.println("Accessing the static variable without any object, using class name");
        System.out.println(StaticUSe.type);  // accessing the static variable directly without any object.


    }
}