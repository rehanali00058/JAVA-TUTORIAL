import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter Marks of Science: ");
        float a = input.nextFloat();
        System.out.println("Enter Marks of Hindi: ");
        float b = input.nextFloat();
        System.out.println("Enter Marks of English: ");
        float c = input.nextFloat();
        System.out.println("Enter Marks of CS: ");
        float d = input.nextFloat();
        System.out.println("Enter Marks of Maths: ");
        float e = input.nextFloat();
        float percentage = (a+b+c+d+e)*100/500f;
        System.out.println("your Percentage is: " +percentage);
        float CGPA = percentage/10f;
        System.out.println("your CGPA is: " + CGPA);
    }
}
