package Arrays.Examples;

public class Student {
    private String name;
    private Course[] myClasses;
    public Student(String n){
        name = n;
        myClasses = new Course[8];
    }
    public Student(String n, Course[] c){
        name = n;
        myClasses = c;
    }
    public String toString(){
        String ret = "Student Name: " + name;
        for(int i = 0; i < myClasses.length; i++){
            ret +=  "\n" + myClasses[i].toString();
        }
        return ret;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course[] getMyClasses() {
        return myClasses;
    }

    public void setMyClasses(Course[] myClasses) {
        this.myClasses = myClasses;
    }
}
