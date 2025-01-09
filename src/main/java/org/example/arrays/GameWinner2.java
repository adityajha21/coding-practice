package org.example.arrays;


/*This problem typically involves determining the winner in a game where two players, Alice (A) and Bob (B),
alternately remove a piece from a string colors. The rule is
that a piece can be removed only if it has the same color on both sides.*/

public class GameWinner2 {
    public static void main(String[] args) {
       String colours = "ABBBBBBBAAA";

        if(winnerOfGame(colours)) System.out.println("Alice won the Game");
        else System.out.println("Bob won the Game");
    }

    private static boolean winnerOfGame(String colours) {
        int alice = 0;
        int bob = 0;
        for(int i=1; i<colours.length()-1; i++) {
            if(colours.charAt(i-1) == colours.charAt(i) && colours.charAt(i) == colours.charAt(i+1)) {
                if(colours.charAt(i) == 'A')
                    alice++;
                else bob++;
            }

        }
        return alice > bob;

    }
}
