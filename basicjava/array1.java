public class array1 {
    public static void main(String[] args) {
        int[] number = {3, 5, 7, 9, 11};

        System.out.println("array elemerts are: ");

        for(int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

        int sum = 0;
        for(int i = 0; i < number.length; i++) {
            sum += number[i];
        }
        System.out.println("Sum of array elements is: " + sum);
    }
    
}
