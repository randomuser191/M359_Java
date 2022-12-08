package Examples;

public class ChallengingLoops {
    public static void main(String[] args) {
        String str = "12345";
        for(int i = 5; i > 0; i--){
            System.out.println(str.substring(0, i));
        }

        System.out.println();
        System.out.println();

        for(int i = 5; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        everyOtherLetterPyramid("FremdVikings");
        everyOtherWordBackwards("Boy these loops are tricky!");
    }
    public static void everyOtherLetterPyramid(String str){
        System.out.println(str);
        String newStr = "";
        while(str.length() >= 2){
            newStr = "";
            for(var i = 0 ; i < str.length(); i+=2){
                newStr += str.charAt(i);
            }
            System.out.println(newStr);
            str = newStr;
        }
    }
    public static void everyOtherWordBackwards(String str){
        String newStr = "";
        for(var i = 0; i < str.length(); i++){
            int spIdx = str.indexOf(" ");
            newStr += str.substring(0, spIdx);
            str = str.substring(spIdx);//have to reverse
        }
        System.out.println(newStr);
    }


}
