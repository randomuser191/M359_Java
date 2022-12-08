package Arrays.Examples;

public class Course {
    private String teacherName, subject, currentGrade;
    private int period;
    public Course(String s, String t, String c, int p){
        teacherName = t;
        subject = s;
        currentGrade = c;
        period = p;
    }
    public Course(String s, int p){
        subject = s;
        teacherName = "";
        currentGrade = "";
        period = p;
    }
    public String toString(){
        String ret = "Per: " + period + " ";
        if(currentGrade.length() < 1){
            ret +=  "- " + currentGrade + "\t" + subject;
        }else{
            ret +=  currentGrade + "\t" + subject;
        }
        if(subject.length() < 8){
            ret += "\t\t\t\t\t\t\t" + teacherName;
        }
        else if(subject.length() < 12){
            ret += "\t\t\t\t\t\t" + teacherName;
        }else if(subject.length() <= 15) {
            ret += "\t\t\t\t\t" + teacherName;
        }else if(subject.length() <= 19){
            ret += "\t\t\t\t" + teacherName;
        }else if(subject.length() <= 22){
            ret += "\t\t\t" + teacherName;
        }else if(subject.length() <= 25){
            ret += "\t\t" + teacherName;
        }else{
            ret += "\t" + teacherName;
        }
        return ret;
    }
    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCurrentGrade() {
        return currentGrade;
    }

    public void setCurrentGrade(String currentGrade) {
        this.currentGrade = currentGrade;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
}
