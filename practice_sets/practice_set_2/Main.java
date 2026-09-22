import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // question 1
        float a = 7/4*9/2; // as all given numbers are integers then it will only take integer part
        float b = 7/4.0f*9/2.0f;
        System.out.println(a);
        System.out.println(b);
        // both will show different results
        
        // question 2
        // encryption
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);
        
        //decryption
        grade = (char)(grade - 8);
        System.out.println(grade);

        // question 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int c = sc.nextInt();
        System.out.println(c>8);
        // returns output in true or false

        // question 4 
        // float d = (v*v-u*u)/(2*e*s);
        // System.out.println(d);

        // question 5
        int f = 7*49/7+35/7;
        System.out.println(f);


    }    
}

