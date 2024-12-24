class SumOfArray {
    public double sum(Double[] numbers){
        int len = numbers.length;
        double total = 0;
        for(int i=0; i< len; i++){
            total = total + numbers[i];
        }

        return total;
    }
}
