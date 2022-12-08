package Arrays.Examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentTester {
    public static void main(String[] args) throws FileNotFoundException {
        Course[] classes = {new Course("English", "Syed", "A", 1), new Course("Physical Education", "Jetel", "A+", 2),new Course("AP Computer Science A", "Denna", "A", 3),new Course("Spanish 3", "Yoshimura", "A-", 4),new Course("AP US History", "Billitier", "A", 5),new Course("Chemistry", "Teberg", "A-", 6),new Course("Lunch", 7),new Course("Trig Calc A", "Young", "A", 8)};
//        Student s = new Student("John", classes);


        File oneCourse = new File("Unit6/oneCourse.txt");
        File schoolDay = new File("Unit6/oneSchedule.txt");

        Scanner inF = new Scanner(oneCourse);
        Scanner sDay = new Scanner(schoolDay);
        String name = sDay.nextLine();
        Course[] sClasses = new Course[8];
        for(int i = 0; i < 8; i++){
            String teacher = sDay.nextLine();
            String course = sDay.nextLine();
            String grade = sDay.nextLine();
            int period = sDay.nextInt();
            Course file = new Course(course, teacher, grade, period);
            sClasses[i] = file;
            if(sDay.hasNextLine()) {
                sDay.nextLine();
            }
        }

//        String teacher = inF.nextLine();
//        String course = inF.nextLine();
//        String grade = inF.nextLine();
//        int period = inF.nextInt();
//        Course file = new Course(course, teacher, grade, period);
        Student s = new Student(name, sClasses);




        File multStud = new File("Unit6/studentScheduleData.txt");
        Scanner stuScan = new Scanner(multStud);
        int size = Integer.parseInt(stuScan.nextLine());
        Student[] studs = new Student[size];

        for(int j = 0; j < size; j++){
            if(!stuScan.hasNextLine()) break;
            String n = stuScan.nextLine();
            Course[] cls = new Course[8];
            for(int i = 0; i < 8; i++){
                String teacher = stuScan.nextLine();
                String course = stuScan.nextLine();
                String grade = stuScan.nextLine();
                int period = stuScan.nextInt();
                Course file = new Course(course, teacher, grade, period);
                cls[i] = file;
                if(stuScan.hasNextLine()) {
                    stuScan.nextLine();
                }
            }
            Student st = new Student(n, cls);
            studs[j] = st;
        }
        for(Student student: studs){
            if(student != null) System.out.println(student + "\n");
        }
















    }
}
