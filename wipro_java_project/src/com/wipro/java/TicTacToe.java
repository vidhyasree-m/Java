package com.wipro.java;

/*
 * creating a tic tac toe game using java core
 */
import java.util.Scanner;

public class TicTacToe { 
	
	//creating a 2D array 
    private char[][] board;
    private char currentPlayer;

    //constructor
    public TicTacToe() {
    	//3x3 matrix array
        board = new char[3][3];
        currentPlayer = 'X'; // X always goes first
        initializeBoard();
    }

    //initialize the game and place all empty places with hypen
    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }
   
    //This loop creates a pattern for better visualization 
    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print("|"); // for each column print slash
            }
            System.out.println();
            if (i < 2) System.out.println("-----"); //for each row except last one print hypens
        }
    }
    //for switching players here used trinary operator
    public void changePlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    //checking if the board is full or not
    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

     
    public boolean checkWinCondition() {
        // check rows, columns
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[i][0], board[i][1], board[i][2]) || 
                checkRowCol(board[0][i], board[1][i], board[2][i])) {
                return true;
            }
        }
        //check diagonal
        return checkRowCol(board[0][0], board[1][1], board[2][2]) || 
               checkRowCol(board[0][2], board[1][1], board[2][0]);
    }
    
    //check row, column for win
    private boolean checkRowCol(char c1, char c2, char c3) {
        return (c1 != '-' && c1 == c2 && c1 == c3);
    }

    public static void main(String[] args) {
    	//object creation
        TicTacToe game = new TicTacToe();
        Scanner sc = new Scanner(System.in);
        int row, col;

        while (true) {
            game.printBoard();
            System.out.println("Player " + game.currentPlayer + ", enter your move row and column (move): ");
            row = sc.nextInt();
            col = sc.nextInt();
            //checks whether the move is valid or invalid
            if (row < 0 || row >= 3 || col < 0 || col >= 3 || game.board[row][col] != '-') {
                System.out.println("Invalid Move. Try again.");
                continue;
            }
            //The current player symbol is placed in the selected row and column
            game.board[row][col] = game.currentPlayer;

            if (game.checkWinCondition()) {
                game.printBoard();
                System.out.println("Player " + game.currentPlayer + " wins!");
                break;
            }

            if (game.isBoardFull()) {
                game.printBoard();
                System.out.println("The game is a draw!");
                break;
            }
            //switch player
            game.changePlayer();
        }

        sc.close();
    }
}


