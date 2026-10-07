package collectionFramework;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(5);
        list.add(50);

        System.out.println(list.get(2));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for(int x: list){
            System.out.println(x);
        }
        // chek
        System.out.println(list.contains(5));  //true
        System.out.println(list.contains(50));  //true
    }
}