package PigLatin;

public class PigLatin {
    public static String toPigLatin(String str){
        str = str.toLowerCase();
        String newStr = "";
        String newStr2 = "";
        while(str.length() > 1){
            if(str.indexOf(" ") > -1) {
                newStr = str.substring(0, str.indexOf(" "));
                str = str.substring(str.indexOf(" ") + 1);
            }
            else {
                newStr = str;
                str = "";
            }
            newStr2 += translateWordToPigLatin(newStr) + " ";
        }
        System.out.println(newStr2);
        newStr2 = newStr2.substring(0, 1).toUpperCase() + newStr2.substring(1);
        newStr2 = newStr2.substring(0, newStr2.length() - 1);
        return newStr2;
    }
    public static String translateWordToPigLatin(String str){
        String newStr = "";
        if(isVowel(str.charAt(0))){
            newStr = str + "yay";
        }else if(!isVowel(str.charAt(0)) && isVowel(str.charAt(1))){
            for (var i = 1; i < str.length(); i++) {
                newStr += str.charAt(i);
            }
            newStr += str.charAt(0) + "ay";
        }else{
            for (var i = 2; i < str.length(); i++) {
                newStr += str.charAt(i);
            }
            newStr += str.charAt(0) + "" + str.charAt(1) + "ay";
        }
        return newStr;
    }
    public static boolean isVowel(char ch){
        String vowels = "aeiou";
        for(var i = 0; i < vowels.length(); i++){
            if(vowels.charAt(i) == ch){
                return true;
            }
        }
        return false;
    }
}
