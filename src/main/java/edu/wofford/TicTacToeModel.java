package edu.wofford;


public class TicTacToeModel {

    public boolean playerX = true;

    public enum Mark { EMPTY, XMARK, OMARK };
    public enum Result { XWIN, OWIN, TIE, NONE };

    private Mark[][] board;

    public TicTacToeModel() {
        board = new Mark [3][3];
        for (int row = 0; row < board.length; row++){
            for (int col = 0; col < board.length; col++){
                board[row][col] = Mark.EMPTY;
            }
        }
    }

    public boolean setMarkAt(int row, int col) {
        if(row >= 0 && row<= 2 && col >= 0 && col<= 2 && board[row][col] == Mark.EMPTY){
           if(playerX){
               board[row][col] = Mark.XMARK;
               playerX = false;
           }
           else{
               board[row][col] = Mark.OMARK;
               playerX = true;
           }
           return true;
        }
        else{
            return false;
        }
    }
    
    public Mark getMarkAt(int row, int col) {
        return board [row][col];
    }

    public Result getResult() {
        return Result.NONE;
    }

    public String toString() {
        return "";
    }

}