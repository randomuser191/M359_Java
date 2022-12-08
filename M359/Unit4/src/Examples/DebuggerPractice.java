package Examples;

public class DebuggerPractice {
    public static void main(String[] args) {
        int sum = 0;
        String name = "Shrek";
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println(reverseString(name));
    }
    public static String reverseString(String str){
        String revStr = "";
        for(int i = str.length() - 1; i >= 0; i--){
            revStr += str.charAt(i);
        }
        return revStr;
    }
}
