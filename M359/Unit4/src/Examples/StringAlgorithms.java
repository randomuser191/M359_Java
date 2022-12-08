package Examples;

import java.sql.SQLOutput;

public class StringAlgorithms {
    public static void main(String[] args) {

        // PART I
        String mySchool = "Fremd Vikings";

        // print every other character of mySchool on the same line
        for (var i = 0; i < mySchool.length(); i += 2) {
            System.out.print(mySchool.charAt(i));
        }

        System.out.println();
        System.out.println();
        // print the String mySchool in reverse (all characters on the same line)
        for (var i = mySchool.length() - 1; i >= 0; i--) {
            System.out.print(mySchool.charAt(i));
        }
        System.out.println();
        System.out.println();



         /* PART II
           Given the String animal, print the output such that the first line shows
           the first character, the second line shows the second character, and so on
           Ex:  If animal = "monkey" then the output would be:
               m
               mo
               mon
               monk
               monke
               monkey
        */
        String animal = "monkey";
        for (var i = 0; i < animal.length(); i++) {
            System.out.println(animal.substring(0, i + 1));
        }
        System.out.println();
        System.out.println();


        // PART III
        String phrase = "Mary had a little lamb, little lamb, little lamb";
        phrase += " Mary had a little lamb, its fleece was white as snow";
        int count = 0;
        String newPhrase = phrase;
        // Print the amount of times the word "little" appears within phrase?
        while (newPhrase.contains("little")) {
            count++;
            newPhrase = newPhrase.substring(0, newPhrase.indexOf("little") - 1) + newPhrase.substring(newPhrase.indexOf("little") + 1);
        }
        System.out.println("The word little appears in phrase " + count + " times\n");
        // create a new String, or modify the existing String, that removes
        // the word "little" entirely
        System.out.println("The new string is: \n");
        System.out.println(phrase.replace("little ", ""));


        // create a new String (based on phrase), or modify the existing String,
        // that replaces the word "little" with the word "BIG"
        System.out.println("The new string is: \n");
        System.out.println(phrase.replace("little ", "BIG "));
    }
}
