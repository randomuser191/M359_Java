package Arrays.Work;

public class Question {
    private String question;
    private String answer;
    private String[] choices;
    private int points;

    public Question(String q, String a, int p, String[] ch){
        question = q;
        answer = a;
        points = p;
        choices = ch;
    }
    public String toString(){
        String str = question + " " + points + " points\n";
        for(int i = 0; i < choices.length; i++){
            str += choices[i] + "\n";
        }
        return str;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String[] getChoices() {
        return choices;
    }

    public void setChoices(String[] choices) {
        this.choices = choices;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
