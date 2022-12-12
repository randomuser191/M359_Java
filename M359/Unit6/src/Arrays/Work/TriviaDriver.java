package Arrays.Work;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inp = new Scanner(System.in);
        TriviaGame g = new TriviaGame();
        int streak = 0;
        g.getData();
        Question[] q = g.getQuestions();
        int len = q.length;
        System.out.println("\nWelcome to Akshat's Trivia. What is your name?");
        String name = inp.nextLine();
        System.out.println("Ok " + name + ". Let's begin!\n");
        for(int i = 0; i < len; i++){
            int idx = (int)(Math.random() * q.length);
            System.out.println(q[idx]);
            System.out.println("Type A, B, C, or D below");
            String userC = inp.next();
            if(g.checkAnswer(userC.toUpperCase(), q[idx])){
                System.out.println("\nCorrect!");
                g.setPoints(g.getPoints() + q[idx].getPoints());
                g.setqCor(g.getqCor() + 1);
                streak++;
            }else{
                System.out.println("\nIncorrect. The correct answer was " + q[idx].getAnswer());
                streak = 0;
            }
            g.setqAns(g.getqAns() + 1);
            g.setStreak(streak);
            System.out.println("\nWould you like to continue? Y or N");
            userC = inp.next().toLowerCase();
            if(userC.equals("y")){
                System.out.println("\n\n" + g.getStats(false));
            }else if(userC.equals("n")){
                System.out.println("\n\n" + g.getStats(true));
                break;
            }else{
                System.out.println("Enter Y or N");
                userC = inp.next();
            }
            q = g.removeQ(q, idx);
        }
        System.out.println("\n Congratulations " + name + "! You completed the Trivia. Here's how you did: \n");
        System.out.println("\n" + g.getStats(true));
    }
}
