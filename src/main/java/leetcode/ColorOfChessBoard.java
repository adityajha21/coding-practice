package leetcode;

public class ColorOfChessBoard {
    public static void main(String[] args) {
        String str = "a2";
        boolean isWhite = squareIsWhite(str);
        if(isWhite) {
            System.out.println("White box");
        } else System.out.println("Black Box");
    }

    private static boolean squareIsWhite(String str) {
        char column = str.charAt(0);
        char row = str.charAt(1);

        //converts the column letter to an index from 1 to 8.
        int columnIndex = column - 'a' + 1;

        // converts the row character to its integer equivalent.
        int rowIndex = row - '0';

        // Calculate the sum of column index and row index
        int sum = columnIndex + rowIndex;

        // If the sum is even, the square is white; otherwise, it's black
        return sum % 2 != 0;
    }
}
