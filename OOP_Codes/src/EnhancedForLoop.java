public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] numbers = new int[3];  // an integer array named numbers

        numbers[0] = 34;
        numbers[1] = 65;
        numbers[2] =98;

        for(int num : numbers){         //Enhanced for loop. num is a variable of int type, it gets the value of numbers array with each iteration.
            System.out.println(num);
        }
    }
}
