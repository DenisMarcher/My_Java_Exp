import java.util.Random;
import java.util.Scanner;

public class TicTacToe5x5 {

    static void start() {
        char[][] field = getEmptyField();

        drawField(field);

        while (true) {
            doPlayerMove(field);
            if (isWin(field, 'X')) {
                System.out.println("Congratulations!!! Your are winner!!!");
                break;
            }
            if (isDraw(field)) {
                System.out.println("This is draw. Try again.");
                break;
            }

            doAIMove(field);
            if (isWin(field, 'O')) {
                System.out.println("Sorry!!! You are loser :(");
                break;
            }
            if (isDraw(field)) {
                System.out.println("This is draw. Try again.");
                break;
            }
        }
    }

    static boolean isDraw(char[][] field) {
        for (int h = 0; h < field.length; h++) {
            for (int v = 0; v < field.length; v++) {
                if (isEmptyCell(field, h, v)) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isWin(char[][] field, char sign) {
        // Horizontal
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][0] == sign && field[i][1] == sign && field[i][2] == sign && field[i][3] == sign && field[i][4] == sign ) {
                    return true;
            }

            }
        }

        // Vertical
        for (int i = 0; i < field.length; i++) {
            if (field[0][i] == sign && field[1][i] == sign && field[2][i] == sign && field[3][i] == sign && field[4][i] == sign ) {
                return true;
            }
        }

        // Diagonals
        if (field[0][0] == sign && field[1][1] == sign && field[2][2] == sign && field[3][3] == sign && field[4][4] == sign) {
            return true;
        }
        if (field[0][4] == sign && field[1][3] == sign && field[2][2] == sign && field[3][1] == sign && field[4][0] == sign) {
            return true;
        }

        return false;
    }

    static void doAIMove(char[][] field) {
        Random random = new Random();
        int horizontal, vertical;

        do {
            horizontal = random.nextInt(field.length);
            vertical = random.nextInt(field.length);
        } while (isNotEmptyCell(field, horizontal, vertical));

        field[horizontal][vertical] = 'O';
        drawField(field);
    }

    static void doPlayerMove(char[][] field) {
        int horizontal, vertical;

        do {
            System.out.println("Your chance. Please enter coordinates...");
            horizontal = getCoordinate('H');
            vertical = getCoordinate('V');
        } while (isNotEmptyCell(field, horizontal, vertical));

        field[horizontal][vertical] = 'X';
        drawField(field);
    }

    static boolean isEmptyCell(char[][] field, int horizontal, int vertical) {
        return field[horizontal][vertical] == '-';
    }

    static boolean isNotEmptyCell(char[][] field, int horizontal, int vertical) {
        return !isEmptyCell(field, horizontal, vertical);
    }

    static int getCoordinate(char position) {
        Scanner scanner = new Scanner(System.in);
        int coordinate;

        do {
            System.out.printf("Please enter %s-coordinate [in range 1-5] ...%n", position);
            coordinate = scanner.nextInt() - 1;
        } while (coordinate < 0 || coordinate > 4);

        return coordinate;
    }

    static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
    }

    static char[][] getEmptyField() {
        return new char[][]{
                {'-', '-', '-','-', '-'},
                {'-', '-', '-','-', '-'},
                {'-', '-', '-','-', '-'},
                {'-', '-', '-','-', '-'},
                {'-', '-', '-','-', '-'}
        };
    }

}