class MaximumFromArray {
    public static void main(String[] args) {
        int[] numbers = { 5, 8, 3, 12, 9 };
        int max = numbers[0]; 

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; 
            }
        }

        System.out.println("The maximum value is: " + max);
    }
}





