class Solution {
    public boolean isValidSudoku(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        if (rows != 9 || cols != 9) return false;
        for (int i = 0; i< rows; i++) {
            if (anyDuplicate(board[i])) return false;
            char[] colArr = new char[rows];
            for (int j = 0; j< cols; j++) {
                colArr[j] = board[j][i];
            }
            if (anyDuplicate(colArr)) return false;
        }
        for (int i = 0; i<rows; i+=3) {
            for (int j =0; j<cols; j+=3) {
                if (!isValidSubArray(board, i, j)) return false;
            }
        }
        return true;
    }

    private boolean isValidSubArray(char[][] arr, int _i, int _j) {
        Set<Character> set = new HashSet<>();
        for (int i = _i; i< _i+3; i++) {
            for (int j = _j; j< _j+3; j++) {
                if (arr[i][j] != '.') {
                    if (set.contains(arr[i][j])) {
                        return false;
                    } else {
                        set.add(arr[i][j]);
                    }
                }
            }
        }
        return true;
    }

    private boolean anyDuplicate(char[] arr) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] != '.') {
                if (set.contains(arr[i])) {
                    return true;
                } else {
                    set.add(arr[i]);
                }
            }
        }
        return false;
    }
}