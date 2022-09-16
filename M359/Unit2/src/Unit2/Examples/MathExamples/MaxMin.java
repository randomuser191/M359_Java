package Unit2.Examples.MathExamples;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Minimum Number: ");
        int minNum = inp.nextInt();
        System.out.print("Enter Maximum Number: ");
        int maxNum = inp.nextInt();
        double randNum = (int)(Math.random() * ((maxNum - minNum) + 1)) + minNum;
        System.out.println("A random number between " + minNum + " and " + maxNum + " is " + (int)randNum);
        }
    }

