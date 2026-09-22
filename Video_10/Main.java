public class Main {
    public static void main(String[] args) {
        //data types (numeric) 
        byte x = 5;
        int y = 6;
        short z = 7;
        int a = y+z;
        float b = 6.54f +x;
        System.out.println(b);

        //increment and decrement operators
        int i = 54;
        int v = i++; // first i is assigned to v then it is incremented
        int h = ++i; // first value of i is increased then it is assigned to h
        int j = 56;
        int c = ++j;
        System.out.println(c);
        System.out.println(i++); // prints value of i and the increses it (54 will be printed)
        System.out.println(i); // prints value of i (55 will be printed)
        System.out.println(++i); // increments value of i and then prints it (56 will be printed)
        
        int u = 7;
        int f = ++u*8;
        System.out.println(f);

        char ch = 'B';
        System.out.println(++ch);

    }
}
