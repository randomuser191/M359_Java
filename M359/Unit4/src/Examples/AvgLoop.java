package Examples;
import java.sql.SQLOutput;
import java.util.Scanner;
public class AvgLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //user will enter -999 to exit
        //create int vars for sum and count
        //prompt user for value
        //while loop making sure they want to continue
        //add to the sum
        //increment the count
        //calculate avg and print it out
        int sum = 0;
        int count = 0;
        System.out.println("Enter a number: -999 to quit");
        int userInp = input.nextInt();
        while(userInp != -999){
            System.out.println("Enter a number: -999 to quit");
            count++;
            sum += userInp;
            userInp = input.nextInt();
        }
        System.out.println("The average is: " + ((double)(sum) / count));
    }
}
