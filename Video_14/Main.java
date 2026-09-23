public class Main {
    public static void main(String[] args) {
        String name = "ReHan";
        // System.out.println(name);
        int value = name.length();
        // System.out.println(value);
        String lstring = name.toLowerCase();
        // System.out.println(lstring);
        String ustring = name.toUpperCase();
        // System.out.println(ustring);
        
        //trim function
        String surname = "     Ali    ";
        String trimstring = surname.trim(); // we can assign trim function to a new string or we can simply just use it during printing
        // System.out.println(trimstring); //deletes the trailing spaces
        
        
        //substring method
        System.out.println(name.substring(1));
        // when substring start index given as 0 it will highlight it will call it as redundant
        System.out.println(name.substring(1, 5));

        System.out.println(name.replace('e', 'i'));
        System.out.println(name.replace("Han", "Hen"));









    }
    
}
