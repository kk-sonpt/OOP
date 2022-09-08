import java.util.Scanner;

public class TicTacToe {
  public static void main(String[] args) {
    System.out.println("Start game");
    boolean noWinner = true;
    Board board = new Board();
    int turn = 0; // 0 as X, 1 as Y

    while (noWinner) {
      Scanner scanner = new Scanner(System.in);
      if (board.isWinner() != "Empty") {
        System.out.println(board.isWinner() + " won!!");
        noWinner = false;
      } else {
        if (board.isFull()) {
          System.out.println("Draw match!");
          noWinner = false;
          break;
        }

        if (turn == 0)
          System.out.println("X turn");
        else
          System.out.println("Y turn");

        boolean validMove = true;

        while (validMove) {
          int xCell = scanner.nextInt();
          int yCell = scanner.nextInt();
          if (xCell < 0 || yCell < 0 || xCell > 2 || yCell > 2) {
            System.out.println("Out of board move, please try again");
          } else {
            if (board.tickCell(board.cells[xCell][yCell], turn))
              validMove = false;
          }
        }
        board.printBoard();
        turn = 1 - turn;
      }
    }
  }
}
