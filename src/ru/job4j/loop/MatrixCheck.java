package ru.job4j.loop;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            if (board[row][index] != 'X') {
                result = false;
                break;
            }
        }
    return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            if (board[index][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int index = 0; index < board.length; index++) {
            result[index] = board[index][index];
        }
        return result;
    }

        public static boolean isWin(char[][] board) {
        boolean result = false;
            for (int index = 0; index < board.length; index++) {
                if (board[index][index] == 'X') {
                    if (monoHorizontal(board, index) || monoVertical(board, index)) {
                        result = true;
                        break;
                    }
                }
            }
        return result;
        }

        public static boolean isWinDiagonal(char[][]board) {
        boolean result = false;
            char[] oneDim = extractDiagonal(board);
            for (int index = 0; index < board.length; index++) {
                if (oneDim[index] == 'X') {
                  if (monoVertical(board, index) || monoHorizontal(board, index)) {
                        result = true;
                        break;
                    }
                }
            }
            return result;
        }
    }

