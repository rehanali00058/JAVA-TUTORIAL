import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("It works!");
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in); // system.in hepls in reading from keyboard
        // System.out.println("enter number 1 :");
        // int a = sc.nextInt();
        // boolean b1 = sc.hasNextInt();
        // System.out.println(b1);
        String str = sc.nextLine(); //if nextline() is not used it will read only one 
        System.out.println(str);

        // System.out.println("Enter number 1 :");
        // float a = sc.nextFloat();
        // System.out.println("enter number 2 :");
        // int b = sc.nextInt();
        // float b = sc.nextFloat();
        // float sum = a+b;
        // System.out.println("the sum of these numbers is");
        // System.out.println(sum);

        
    }
}