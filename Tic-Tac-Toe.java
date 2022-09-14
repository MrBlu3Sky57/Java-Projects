class TicTacToe {
    static final int EMPTY = 0;
    static final int CROSS = 1;
    static final int CIRCLE = 2;

    public static int[][] createBoard(int length) {
        int[][] board = new int[length][length];
        for (int r = 0; r < length; r++) {
            for (int s = 0; s < length; s++) {
                board[r][s] = EMPTY;
            }
        }
        return board;
    }

    public static void drawCell(int value) {
        String c = "_";
        if (value == 1) {
            c = "X";
            System.out.printf("| %s "+ c);
        } else if (value == 2) {
            c = "O";
            System.out.printf("| %s "+ c);
        }
    }

    public static void drawBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                drawCell(board[i][j]);
            }
        }
    }

    public static int placeMove(int[][] board, int xCoordinate) {
        return 1;
    }
    public static void main(String[] args) {

    }
}
