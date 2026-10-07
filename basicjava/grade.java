package basicjava;

public class grade {
    public static void main(String[] args) {
        int marks = 75;
        // marks = 90 a
        // marks = 75  b
        // marks = 60 c


        if(marks >= 90){
            System.out.println("Grade A");
        }else if(marks >= 75){
            System.out.println("Grade B");
        }else if(marks >= 60){
            System.out.println("Grade c");
        }else{
            System.out.println("fail");
        }
    }
    
}
