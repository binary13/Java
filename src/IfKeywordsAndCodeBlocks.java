/**
 * Created by justin on 2/7/2016.
 */
public class IfKeywordsAndCodeBlocks {

    public static void main(String[] args){

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        System.out.println(displayScore(gameOver, score, levelCompleted, bonus));

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println(displayScore(gameOver, score, levelCompleted, bonus));
    }

    public static String displayScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return "Your final score was " + finalScore;
        }
        else return("Error! Game not over!");
    }
}
