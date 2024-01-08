package org.example;

import java.util.Arrays;

public class TwoDarrays {
    public static void main(String[] args) {
        char[][] board = new char[3][3];

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                board[i][j] = '-';
            }
        }

        board[0][0] = '1';
        board[1][0] = '1';
        board[2][0] = '1';

        char[][] boardTwo = {{'1','1','1'}, {'2','2','2'} };


        System.out.println(Arrays.deepToString(board));
        System.out.println(Arrays.deepToString(boardTwo));
    }
}
