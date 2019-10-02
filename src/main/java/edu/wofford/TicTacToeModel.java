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
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                if (board[i][0] == Mark.XMARK) {
                    return Result.XWIN;
                }
                else if (board[i][0] == Mark.OMARK) {
                    return Result.OWIN;
                }
            }
            else if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                if (board[0][i] == Mark.XMARK) {
                    return Result.XWIN;
                }
                else {
                    return Result.OWIN;
                }
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            if (board[0][0] == Mark.XMARK) {
                return Result.XWIN;
            }
            else {
                return Result.OWIN;
            }
        }
        else if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            if (board[0][2] == Mark.XMARK) {
                return Result.XWIN;
            }
            else{
                return Result.OWIN;
            }
        }
        else{
            for (int row = 0; row < board.length; row++) {
                for (int col = 0; col < board.length; col++) {
                    if (board[row][col] == Mark.EMPTY) {
                        return Result.NONE;
                    }
                }
            }

            return Result.TIE;
        }
    }

    public String toString() {
        //if board[][] is x add "x" or "o" or " " + "|" etc
        String boardString = " ";

        for (int row = 0; row < 1; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == Mark.XMARK && board[row][col] != board[row][2]) {
                    boardString = "x" + "|";
                } else if (board[row][col] == Mark.XMARK && board[row][col] == board[row][2]) {
                    boardString = "x" + "\n";
                } else if (board[row][col] == Mark.OMARK && board[row][col] != board[row][2]) {
                    boardString = "o" + "|";
                } else if (board[row][col] == Mark.OMARK && board[row][col] == board[row][2]) {
                    boardString = "o" + "\n";
                } else if (board[row][col] == Mark.EMPTY && board[row][col] != board[row][2]) {
                    boardString = " " + "|";
                } else {
                    boardString = " " + "\n";
                }
            }
        }

        boardString = boardString + "-----";

        for (int row = 1; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == Mark.XMARK && board[row][col] != board[row][2]) {
                    boardString = "x" + "|";
                } else if (board[row][col] == Mark.XMARK && board[row][col] == board[row][2]) {
                    boardString = "x" + "\n";
                } else if (board[row][col] == Mark.OMARK && board[row][col] != board[row][2]) {
                    boardString = "o" + "|";
                } else if (board[row][col] == Mark.OMARK && board[row][col] == board[row][2]) {
                    boardString = "o" + "\n";
                } else if (board[row][col] == Mark.EMPTY && board[row][col] != board[row][2]) {
                    boardString = " " + "|";
                } else {
                    boardString = " " + "\n";
                }
            }
        }

        boardString = boardString + "-----";

        for (int row = 2; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == Mark.XMARK && board[row][col] != board[row][2]) {
                    boardString = "x" + "|";
                } else if (board[row][col] == Mark.XMARK && board[row][col] == board[row][2]) {
                    boardString = "x" + "\n";
                } else if (board[row][col] == Mark.OMARK && board[row][col] != board[row][2]) {
                    boardString = "o" + "|";
                } else if (board[row][col] == Mark.OMARK && board[row][col] == board[row][2]) {
                    boardString = "o" + "\n";
                } else if (board[row][col] == Mark.EMPTY && board[row][col] != board[row][2]) {
                    boardString = " " + "|";
                } else {
                    boardString = " " + "\n";
                }
            }
        }
        return boardString;
    }

}