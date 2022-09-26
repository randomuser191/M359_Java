package U3.Examples;

public class Student {
    private String fName;
    private String lName;

    public Student(String f, String l){
        fName = f;
        lName = l;
    }

    public boolean equals(Student other){
        return (this.fName.equals(other.fName) && this.lName.equals(other.lName));
    }

}
