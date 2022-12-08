package Arrays.Work;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inp = new Scanner(System.in);
        TriviaGame g = new TriviaGame();
        g.getData();
        Question[] q = g.getQuestions();
        for(int i = 0; i < q.length; i++){
            System.out.println(q[i]);
            System.out.println("Type A, B, C, or D below");
            String userC = inp.next();
            if(g.checkAnswer(userC.toUpperCase(), q[i])){
                System.out.println("Correct");
            }else{
                System.out.println("Incorrect");
            };
            System.out.println("Would you like to continue? Y or N");
            userC = inp.next();
            if(userC.equals("y")){
                i++;
            }else if(userC.equals("n")){
                break;
            }else{
                System.out.println("Enter Y or N");
                userC = inp.next();
            }
        }
    }
}
