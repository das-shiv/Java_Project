public class StringExample {
    public static void main(String[] args) {
        String name = new String(); // Creates a new String object initialized to an empty string ("")
        System.out.println(name);   // Prints an empty line because 'name' contains an empty string ("")
        System.out.println(name.hashCode());    // hashcode is 0 for empty string

        name = "shiv";
        System.out.println(name);
        System.out.println(name.hashCode());    // prints the hashcode for "shiv" string
    }
}
