package Arrays.Work;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaGame {
        private int streak;
        private int points;
        private int qAns;
        private int qCor;
        private Question[] questions;
        public TriviaGame(){
            questions = new Question[16];
            streak = 0;
            points = 0;
            qAns = 0;
            qCor = 0;
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
        public String getStats(boolean end){
            String str;
            if(!end) str = "**** Current Stats **** \n";
            else str = "**** Final Stats **** \n";

            str += "Answer Streak: " + streak + "\n";
            str += "Total Points: " + points + "\n";
            str += "Questions Answered: " + qAns + "\n";
            str += "Questions Answered Correctly: " + qCor + "\n";
            if(end) str+= "Percent Correct: " + ((double)(qCor)/qAns) * 100 + "%\n";
            return str;
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

    public int getqAns() {
        return qAns;
    }

    public void setqAns(int qAns) {
        this.qAns = qAns;
    }

    public int getqCor() {
        return qCor;
    }

    public void setqCor(int qCor) {
        this.qCor = qCor;
    }
}
