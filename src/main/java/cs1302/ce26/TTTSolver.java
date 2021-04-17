package cs1302.ce26;

import java.util.Scanner;

/**
 * A Tic-Tac-Toe Solver class.
 */
public class TTTSolver {

    /**
     * The entry point for the program.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an initial board state " +
                           "using 9 consecutive characters. Valid "  +
                           "characters are X, O, and -.");
        String board = promptBoard(input);
        printAllBoards(board);
    } // main

    /**
     * Prompt the user for a valid board configuration.
     * @param input an input scanner
     * @return the board configuration
     */
    public static String promptBoard(Scanner input) {
        String board = input.nextLine();
        while (!TTTUtility.validGame(board)) {
            System.out.println("Invalid board. Try again.");
            board = input.nextLine();
        } // while
        return board;
    } // promptBoard

    /**
     * Given an initial board state, this method prints
     * all board states that can be reached via valid
     * sequence of moves by each player. Therefore, the
     * printout includes both intermediate board states
     * as well as completed board states.
     *
     * @param board the game board
     */
    public static void printAllBoards(String board) {
        System.out.println(board);
    } // printAllBoards

} // TTTSolver
