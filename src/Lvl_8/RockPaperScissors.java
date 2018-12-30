package Lvl_8;

public class RockPaperScissors {
    public static String rps(String p1, String p2) {

        if(p1.equals(p2)) return "Draw!";
        int p = (p1 + p2).equals("scissorspaper") || (p1 + p2).equals("rockscissors") || (p1 + p2).equals("paperrock") ? 1 : 2;
        return "Player " + p + " won!";


/*
        String output = "";
        boolean[][] key = {
                {false, true, false},
                {false, false, true},
                {true, false, false}
        };

        boolean playerP1Wins = key[stringToNum(p1)][stringToNum(p2)];
        if (p1.equals(p2)) output = "Draw!";
        else if (playerP1Wins) output = "Player 1 won!";
        else if (!playerP1Wins)output = "Player 2 won!";
        return output;
    }
    public static int stringToNum(String p1){
        int paper = 0;
        int rock = 1;
        int scissors = 2;
        int output = 0;
        switch (p1) {
            case "paper":
                output = paper;
                break;
            case "scissors":
                output = scissors;
                break;
            case "rock":
                output = rock;
                break;
        }
        return output;*/
    }
}

