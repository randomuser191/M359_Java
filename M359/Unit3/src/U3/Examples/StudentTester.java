package U3.Examples;

public class StudentTester {
    public static void main(String[] args) {
        Student s1 = new Student("John", "Doe");
        Student s2 = new Student("John", "Doe");
        Student s3 = new Student("James", "Doe");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s2));
    }
}
