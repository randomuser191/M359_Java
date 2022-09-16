package Unit2.Examples.MathExamples;
import java.util.Scanner;

//Akshat Handa 3 Denna
public class DistanceFormula {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter x1: ");
        int x1 = inp.nextInt();
        System.out.print("Enter y1: ");
        int y1 = inp.nextInt();
        System.out.print("Enter x2: ");
        int x2 = inp.nextInt();
        System.out.print("Enter y2: ");
        int y2 = inp.nextInt();


        double distance = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow(y2 - y1, 2)));

        System.out.println("The distance between (" + x1 + "," + y1 + ") and ("+ x2 + "," + y2 + ") is " + distance);
    }


}
