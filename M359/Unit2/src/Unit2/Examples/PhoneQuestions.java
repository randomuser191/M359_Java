package Unit2.Examples;
import java.util.Scanner;


public class PhoneQuestions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your phone's brand");
        String brand = input.nextLine();

        System.out.println("How much storage does your phone have?");
        int storage = input.nextInt();

        System.out.println("Does your phone have service?");
        String hasService = input.nextLine();

        System.out.println("How much did the phone cost?");
        double price = input.nextDouble();

    }

}
