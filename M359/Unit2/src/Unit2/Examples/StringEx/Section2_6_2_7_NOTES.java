package Unit2.Examples.StringEx;

public class Section2_6_2_7_NOTES {
    public static void main(String args[]) {

        String s1 = "Vacation";
        String s2 = "Sunshine cures all things";

        System.out.println(s1.toUpperCase()); //Sets all letters in string to uppercase
        System.out.println(s1);             // notice s1 wasn't changed!  That is bc it is immutable

        System.out.println(s2.indexOf("u"));    // there are multiple occurrences of "u".  This returns loc of first
        System.out.println(s2.indexOf("x"));    // there are NO occurrences of "x".  This returns -1

        System.out.println(s1.substring(4));    // returns String from index 4 to the end
        System.out.println(s1.substring(2, 5)); // returns String of (5-2) or 3 char starting at index 2

        System.out.println(s1.length()); //Prints length of string s1
        System.out.println(s2.length()); //Prints length of string s2

        boolean isEqual = s1.equals("VACATION");          // false; s1 is not VACATION
        System.out.println(isEqual);

        isEqual = s1.equals("Vacation");                  // true; s1 is Vacation
        System.out.println(isEqual);

        isEqual = s1.toUpperCase().equals("VACATION");    // true; s1 with all upppercase letters is VACATION
        System.out.println(isEqual);

        String s3 = "bat";
        String s4 = "bird";
        String s5 = "Mickey";

        System.out.println(s3.compareTo(s4));       // returns value < 0 because bat comes before bird in alphabet
        System.out.println(s3.compareTo(s3));       // returns 0 because they are equal
        System.out.println(s4.compareTo(s3));       // returns value > 0 because bat comes after bird in alphabet
        System.out.println(s5.compareTo(s3));       // returns value < 0 because all capital letters come before lowercase


        // letters in the ASCII alphabet

        System.out.println("I love " + "M" + "3" + "5" + "9");  // Strings concatenate literally
        System.out.println("I love " + "M" + (3 + 5 + 9));      // Mathematically adds before concatenating

        System.out.println(24 + 56 + " Days of School");        // Mathematically adds before concatenating
        System.out.println("Days of School: " + 24 + 56);       // Strings + numbers will ALWAYS concatenate

        String str1 = "math";
        String str2 = "mickey";
        System.out.println();
        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str1));
    }
}