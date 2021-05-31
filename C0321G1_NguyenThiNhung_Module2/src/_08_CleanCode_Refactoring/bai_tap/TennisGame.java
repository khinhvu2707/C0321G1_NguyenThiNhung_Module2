package _08_CleanCode_Refactoring.bai_tap;

public class TennisGame {
    public static String getScore(int scorePlayer1, int scorePlayer2) {
        String result = "";
        int temp = 0;
        if (scorePlayer1 == scorePlayer2) {
            result = getScore(scorePlayer1);
        } else if (scorePlayer1 >= 4 || scorePlayer2 >= 4) {
            int minusResult = scorePlayer1 - scorePlayer2;
            result = checkWin(minusResult);
        } else {
            result = getTempScore(scorePlayer1, scorePlayer2, result);
        }
        return result;
    }

    private static String getScore(int scorePlayer1) {
        String result;
        switch (scorePlayer1) {
            case 0:
                result = "Love-All";
                break;
            case 1:
                result = "Fifteen-All";
                break;
            case 2:
                result = "Thirty-All";
                break;
            case 3:
                result = "Forty-All";
                break;
            default:
                result = "Deuce";
                break;

        }
        return result;
    }

    private static String getTempScore(int scorePlayer1, int scorePlayer2, String result) {
        int temp;
        for (int i = 1; i < 3; i++) {
            if (i == 1) temp = scorePlayer1;
            else {
                result += "-";
                temp = scorePlayer2;
            }
            switch (temp) {
                case 0:
                    result += "Love";
                    break;
                case 1:
                    result += "Fifteen";
                    break;
                case 2:
                    result += "Thirty";
                    break;
                case 3:
                    result += "Forty";
                    break;
            }
        }
        return result;
    }

    private static String checkWin(int minusResult) {
        String result;
        if
        (minusResult > 0) {
            if (minusResult == 1) {
                result = "Advantage player1";
            } else {
                result = "Win for player1";
            }
        } else if (minusResult == -1) result = "Advantage player2";
               else result = "Win for player2";
        return result;
    }
}
