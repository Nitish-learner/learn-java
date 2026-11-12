public class array1 {
    public static void main(String[] args) {
        int[] number = {3, 5, 7, 9, 11};

        int sum = 0;
        int max = number[0];
        int min = number[0];

        System.out.println("array elemerts are: ");

        for(int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
            sum += number[i];
            if(number[i] > max) {
                max = number[i];
            }
            if(number[i] < min) {
                min = number[i];
            }
        }

        double average = (double) sum / number.length;
        System.out.println("Sum of array elements is: " + sum);
        System.out.println("Maximum element is: " + max);
        System.out.println("Minimum element is: " + min);
        System.out.println("Average of array elements is: " + average);
    }

}


