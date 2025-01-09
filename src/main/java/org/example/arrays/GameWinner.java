package org.example.arrays;
/*The "Game Winner" problem on HackerRank involves determining the winner between two players, Wendy and Bob,
based on a given string of colors. Each character in the string represents a color: 'w' for white
and 'b' for black. The players take turns removing their respective colors from the string,
with Wendy removing 'w' and Bob removing 'b'. The game continues until a player cannot make a move,
resulting in their loss.

Problem Statement:

Given a string colors consisting of characters 'w' and 'b', determine the winner if both players play optimally.*/
public class GameWinner {
    public static void main(String[] args) {
        String colours ="wwwbbbwwwb";
        System.out.println(gameWinner(colours));
    }

    private static String gameWinner(String colours) {
        int bobMoves = 0;
        int wendyMoves = 0;
        int count = 1;
        for(int i=1; i<colours.length(); i++){
            if(colours.charAt(i) == colours.charAt(i-1)) {
                count++;
            } else {
                if(count >=3) {
                    if(colours.charAt(i-1) == 'w') {
                        wendyMoves = wendyMoves + (count-2);
                    } else {
                        bobMoves = bobMoves + (count-2);
                    }
                }
                count = 1;
            }
        }
        // Check the last sequence
        if (count >= 3) {
            if (colours.charAt(colours.length() - 1) == 'w') {
                wendyMoves += (count - 2);
            } else {
                bobMoves += (count - 2);
            }
        }
        return wendyMoves > bobMoves ? "windy" : "bob";
    }
}
