import java.util.Random;
import java.util.Scanner;

public class myTicTacToe {
    static void start(){
        char field [][] = giveEmptyField();
        while (true) {
            drawMap(field);
            System.out.println();
            doFirstPlayerMove(field);
            if (checkWin(field,'X')){
                System.out.println("Congrats,the first player won");
                break;
            }
            if (checkDraw(field)){
                System.out.println("Draw!");
                break;
            }
            System.out.println();
            doBotPlayerMove(field);
            if (checkWin(field,'0')){
                System.out.println("Second player won, congrats");
                break;
            }
            if (checkDraw(field)){
                System.out.println("Draw!");
                break;
            }
        }


    }
    static boolean checkDraw(char[][]field){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == '-') return false;
            }
        }
        return true;
    }


    static boolean checkWin(char[][] field,char symbol){
        //Horizontal
        if (field[0][0] == symbol && field[0][1] == symbol && field[0][2]== symbol) return true;
        if (field[1][0] == symbol && field[1][1] == symbol && field[1][2]== symbol) return true;
        if (field[2][0] == symbol && field[2][1] == symbol && field[2][2]== symbol) return true;
        //Vertical
        if (field[0][0] == symbol && field[1][0] == symbol && field[2][0]== symbol) return true;
        if (field[0][1] == symbol && field[1][1] == symbol && field[2][1]== symbol) return true;
        if (field[0][2] == symbol && field[1][2] == symbol && field[2][2]== symbol) return true;
        //Diagonal
        if (field[0][0] == symbol && field[1][1] == symbol && field[2][2]== symbol) return true;
        if (field[0][2] == symbol && field[1][1] == symbol && field[2][0]== symbol) return true;
        return false;
    }

    static int getCoordinate(char pos){
        int coordinate ;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please, enter the " +pos +" coordinate");
            coordinate = scanner.nextInt()-1;
        }while (coordinate <0 || coordinate >=3);
        return coordinate;
    }

    static void drawMap(char[][] field){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    static char [][] giveEmptyField(){
        return new char[][]{
                {'-','-','-'},
                {'-','-','-'},
                {'-','-','-'}
        };
    }

    static void doFirstPlayerMove(char[][] field){
        int horizontal,vertical;

        do {
            System.out.println("First player chance");
            System.out.println("Please enter the coordinates,(from 1 to 3)");
            horizontal = getCoordinate('H');
            vertical = getCoordinate('V');
        }while (field[horizontal][vertical] != '-');
        field[horizontal][vertical] = 'X';
        drawMap(field);
    }

    static void doBotPlayerMove(char[][] field){
        Random r= new Random();
        int horizontal;
        int vertical;


        do {
            horizontal = r.nextInt(field.length);
            vertical = r.nextInt(field.length);
        }while (field[horizontal][vertical] != '-');
        field[horizontal][vertical] = '0';
        drawMap(field);
    }

}
