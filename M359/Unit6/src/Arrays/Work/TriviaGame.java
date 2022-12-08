package Arrays.Work;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaGame {
        private int streak = 0;
        private int points = 0;
        private Question[] questions;
        public TriviaGame(){
            questions = new Question[16];
        }
        public void getData() throws FileNotFoundException {
            File qFile = new File("Unit6/src/Arrays/Work/TriviaQuestions.txt");
            Scanner qf = new Scanner(qFile);
            for(int i = 0; i <  questions.length; i++){
                int p = 100 * (int)(Math.random() * 15 + 1);
                String question = qf.nextLine();
                String ans1 = qf.nextLine();
                String ans2 = qf.nextLine();
                String ans3 = qf.nextLine();
                String ans4 = qf.nextLine();
                String[] choices = {ans1, ans2, ans3, ans4};
                String ans = qf.nextLine();
                Question q = new Question(question, ans, p, choices);
                questions[i] = q;
            }
        }
    public boolean checkAnswer(String ans, Question q){
        return (ans.equals(q.getAnswer()));
    }

    public int getStreak() {
        return streak;
    }

    public void setStreak(int streak) {
        this.streak = streak;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }
}
