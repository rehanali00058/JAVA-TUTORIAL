import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("It works!");
        Scanner sc = new Scanner(System.in); // system.in hepls in reading from keyboard
        System.out.println("enter number 1");
        int a = sc.nextInt();
        System.out.println("enter number 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("the sum of these numbers is");
        System.out.println(sum);

        
    }
}