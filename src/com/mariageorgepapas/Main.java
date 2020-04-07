package com.mariageorgepapas;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted,bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);


        int highScorePosition = calculateHighScorePosition(1500);   // we could have written the name and
        displayHighScorePosition("Lionel", highScorePosition);       // score as variables as above
                                                                                // String playerName = "Lionel";
        highScorePosition = calculateHighScorePosition(900);        // int playerScore = 1500;
        displayHighScorePosition("Maria", highScorePosition);        // and have as the parameters the names
                                                                                // of the variables playerName and
        highScorePosition = calculateHighScorePosition(400);        // playerScore
        displayHighScorePosition("Nadia", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Orpheus", highScorePosition);

    }

    // Create a method called displayHighScorePosition
    // It should have a player's name as a parameter, and a 2nd parameter as a position in the high score table. You
    // should display the player's name along with a message like " managed to get into position " and the position
    // they got and a further message " on the high score table".
    //
    // Create a 2nd method called calculateHighScorePosition
    // It should be sent one argument only, the player score, it should return an int, the return data should be:
    // 1 if the score is >= 1000
    // 2 if the score is >= 500 and < 1000
    // 3 if the score is >= 100 and < 500
    // 4 in all other cases
    // call both methods and display the results of the following: a score of 1500, 900, 400, and 50

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {

    //    if (playerScore >=1000) {
    //        return 1;
    //    } else if (playerScore>=500) {      // removed "&& playerScore<1000" because it is always
    //        return 2;                       // true from if statement
    //    } else if (playerScore>=100) {      // removed "&& playerScore<500" because it is always
    //        return 3;                       // true from if statement
    //    }

    //    return 4;

        // different way to calculate the high score position without multiple return statements
        int position = 4;             // assuming position 4 will be returned

        if (playerScore >=1000) {
            position = 1;
        } else if (playerScore>=500) {
            position = 2 ;
        } else if (playerScore>=100) {
            position = 3;
        }
        return position;
    }
    
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore +=2000;
            return finalScore;
        }

        return  -1;

    }
}