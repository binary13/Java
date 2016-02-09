/**
 * Created by justin on 2/8/2016.
 */
public class Methods {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if(gameOver) System.out.println(calcScore(score, levelCompleted, bonus));

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver) System.out.println(calcScore(score, levelCompleted, bonus));

        displayHighScorePosition("Justin", calculateHighScorePosition(1000));
        displayHighScorePosition("Clyde", calculateHighScorePosition(500));
        displayHighScorePosition("Sally", calculateHighScorePosition(100));
        displayHighScorePosition("Ted", calculateHighScorePosition(50));
    }

    public static String calcScore(int score, int level, int bonus) {
        int finalScore = score + (level * bonus) + 2000;
        return "Your final score was " + finalScore;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to reach position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        if(score >= 1000) return 1;
        if(score >= 500) return 2;
        if(score >= 100) return 3;
        else return 4;
    }
}
