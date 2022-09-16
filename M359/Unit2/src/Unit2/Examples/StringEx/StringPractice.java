package Unit2.Examples.StringEx;
import java.util.Scanner;


public class StringPractice {
    public static void main(String[] args) {
        String course = "AP Java - CSA";
        String school = "Fremd High School";
        String teacherName;

        // find first occurrence of "a" in course and print out the result
        System.out.println(course.indexOf("a"));
        // find first occurrence of "a" in school and print out the result
        System.out.println(school.indexOf("a"));
        // how would you extra the string "md H" from school?
        System.out.println(school.substring(3, 7));
        // how would you extra the string CSA from course?
        System.out.println(course.substring(course.length() - 3));
        // This can be done TWO ways - can you figure out both?
        System.out.println(course.substring(10));
        // how can we print out FREMD HIGH SCHOOL
        System.out.println(school.toUpperCase());
        //** BONUS **//

        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Read in the teacher name as two words with a space in between them
        System.out.println("What is your teacher's name?");
        teacherName = input.nextLine();
        // using TWO lines of code, display the teacher name as ONE word, without a space
        teacherName = teacherName.substring(0, teacherName.indexOf(" ")) + teacherName.substring(teacherName.indexOf(" ") + 1);
        System.out.println(teacherName);
    }
}
