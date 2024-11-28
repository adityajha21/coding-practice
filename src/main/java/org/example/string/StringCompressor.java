package org.example.string;

public class StringCompressor {
    public static void main(String[] args) {
        String input = "aaaaabbbcc";
        System.out.println(compressString(input));
    }

    public static String compressString(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(count).append(input.charAt(i - 1));
                count = 1;
            }
        }

        // Append the last set of character and count
        compressed.append(count).append(input.charAt(input.length() - 1));

        return compressed.toString();
    }
}
