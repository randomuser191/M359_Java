package U3.Notes;

public class Course {
    private String classTitle;
    private int numStudentsEnrolled;
    private String teacherName;
    public Course(String t, int n, String nm){
        classTitle = t;
        numStudentsEnrolled = n;
        teacherName = nm;
    }

    public boolean equals(Course other) {
        return(classTitle.equals(other.classTitle) && numStudentsEnrolled == other.numStudentsEnrolled);
    }
    public int compareTo(Course other){
        if(classTitle.equals(other.classTitle) || (classTitle.compareTo(other.classTitle) > 0)){
            return(numStudentsEnrolled - other.getNumStudentsEnrolled());
        }
        return classTitle.compareTo(other.classTitle);
    }
    public String getClassTitle() {
        return classTitle;
    }

    public void setClassTitle(String classTitle) {
        this.classTitle = classTitle;
    }

    public int getNumStudentsEnrolled() {
        return numStudentsEnrolled;
    }

    public void setNumStudentsEnrolled(int numStudentsEnrolled) {
        this.numStudentsEnrolled = numStudentsEnrolled;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
