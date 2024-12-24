class SumOfArray {
    // the sum method takes an array of double type as parameter and stores in numbers array
    public double sum(Double[] numbers){
        int len = numbers.length; // finding the length of the array numbers, so that many times we have to run the loop to add the items
        double total = 0; // total sum of numbers initialized to 0
        for(int i=0; i< len; i++){
            total = total + numbers[i]; // for each iteration the ith item of the array is getting added to total
        }

        return total; // returns the total after the method is done executing
    }
}
