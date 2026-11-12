public class Array {
    
    public static void main(String[] args) {
        int[] a = new int[5];

        System.out.println(a[2]);

        a[3] = 50;
        System.out.println(a[3]);
        for(int i = 0; i < 5; i++){
            System.out.println(a[i]);
        }
    }
}
