import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] board = new char[3][2];

        System.out.printf("no of rows: %d, no of cols: %d\n\n", board.length, board[0].length);
        // no of rows: 3, no of cols: 2

        System.out.println(Arrays.deepToString(board) + "\n");
        // [[, ], [, ], [, ]]

        board = new char[3][3];

        System.out.printf("no of rows: %d, no of cols: %d\n\n", board.length, board[0].length);
        // no of rows: 3, no of cols: 3

        board[0][0] = '-';
        board[0][1] = '-';
        board[0][2] = '-';

        System.out.println(Arrays.deepToString(board) + "\n");
        // [[-, -, -], [, , ], [, , ]]

        board = new char[][] {
            new char[]{'-', '-', '-'},
            new char[]{'-', '-', '-'},
            new char[]{'-', '-', '-'}
        };

        System.out.printf("no of rows: %d, no of cols: %d\n\n", board.length, board[0].length);
        // no of rows: 3, no of cols: 3

        System.out.println(Arrays.deepToString(board) + "\n");
        // [[-, -, -], [-, -, -], [-, -, -]]

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        // - - -
        // - - -
        // - - -

        System.out.println("Enter board elements:");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = sc.next().charAt(0);
            }
        }
        System.out.println();

        System.out.println(Arrays.deepToString(board) + "\n");

        System.out.println("TIC TAC TOE Board:");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
