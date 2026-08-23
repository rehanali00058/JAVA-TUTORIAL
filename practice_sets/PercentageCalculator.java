import java.util.Scanner;
public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Science subject:");
        float a = sc.nextFloat();
        System.out.println("Enter number of Maths subject:");
        float b = sc.nextFloat();
        System.out.println("Enter number of Hindi subject:");
        float c = sc.nextFloat();
        System.out.println("Enter number of CS subject:");
        float d = sc.nextFloat();
        System.out.println("Enter number of English subject:");
        float e = sc.nextFloat();

        float percentage = (a+b+c+d+e)*100f/500f;
        System.out.println("your percentage is"+percentage);

        float SGPA = percentage/10;
        System.out.println("the sgpa is"+SGPA);



    }
}
