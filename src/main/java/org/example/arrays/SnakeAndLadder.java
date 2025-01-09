package org.example.arrays;


import java.util.*;

public class SnakeAndLadder {
    private static final int BOARD_SIZE = 100;
    private static final Map<Integer, Integer> snakesAndLadders = new HashMap<>();
    private static final List<String> players = new ArrayList<>();
    private static final Map<String, Integer> playerPositions = new HashMap<>();

    public static void main(String[] args) {
        setupGame();
        playGame();
    }

    private static void setupGame() {
        // Define snakes and ladders
        snakesAndLadders.put(99, 54);
        snakesAndLadders.put(70, 55);
        snakesAndLadders.put(52, 42);
        snakesAndLadders.put(25, 2);
        snakesAndLadders.put(95, 72);
        snakesAndLadders.put(6, 25);
        snakesAndLadders.put(11, 40);
        snakesAndLadders.put(60, 85);
        snakesAndLadders.put(46, 90);
        snakesAndLadders.put(17, 69);

        // Add players
        players.add("Player 1");
        players.add("Player 2");

        // Initialize player positions
        for (String player : players) {
            playerPositions.put(player, 1);
        }
    }

    private static void playGame() {
        Random dice = new Random();

        while (true) {
            for (String player : players) {
                int currentPosition = playerPositions.get(player);
                int diceRoll = dice.nextInt(6) + 1;

                System.out.println(player + " rolled a " + diceRoll);

                int newPosition = currentPosition + diceRoll;

                // Check if move is valid
                if (newPosition > BOARD_SIZE) {
                    System.out.println(player + " cannot move!");
                    continue;
                }

                // Check for snakes or ladders
                if (snakesAndLadders.containsKey(newPosition)) {
                    int finalPosition = snakesAndLadders.get(newPosition);
                    System.out.println(player + " encountered a " +
                            (finalPosition > newPosition ? "ladder" : "snake") +
                            " and moved to " + finalPosition);
                    newPosition = finalPosition;
                } else {
                    System.out.println(player + " moved to " + newPosition);
                }

                // Update position
                playerPositions.put(player, newPosition);

                // Check for win
                if (newPosition == BOARD_SIZE) {
                    System.out.println(player + " wins!");
                    return;
                }
            }
        }
    }
}

