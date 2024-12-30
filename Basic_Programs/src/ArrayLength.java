public class ArrayLength {
    public static void main(String[] args) {
        int[] arr = new int[6];

        arr[0] = 3;
        arr[1] = -56;
        arr[2] = (int)98.0; // typecast
        arr[3] = 4;

        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }


    }
}
