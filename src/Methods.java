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

        calculateScore("Justin", 1500);
        calculateScore((2000));

        System.out.println("\n");
        calcFtInchesToCm(80, 0);
        calcFtInchesToCm(128);
        calcFtInchesToCm(5, 11.25);
        calcFtInchesToCm(0, 1);
        calcFtInchesToCm(0);
        calcFtInchesToCm(156);
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

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unknown player scored " + score + " points.");
        return score * 1000;
    }

    public static double calcFtInchesToCm(double feet, double inches) {
        if(feet >= 0 && inches >= 0 && inches < 12) {
            double cm = (feet * 12 + inches) * 2.54d;
            String result = "";
            if(feet > 0) result += feet + " feet ";
            if(inches > 0 || feet == 0) result += inches + " inches ";
            result += "is " + cm + " centimeters.";
            System.out.println(result);
            return cm;
        }
        else return -1;
    }

    public static double calcFtInchesToCm(double inches) {
        if(inches >= 0) {
            int feet = (int)(inches / 12);
            double remainder = inches % 12;
            return calcFtInchesToCm(feet, remainder);
        }
        else return -1;
    }
}
