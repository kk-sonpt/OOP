public class Board {
  Cell[][] cells = new Cell[3][3];

  public Board() {
    for (int i = 0; i < 3; ++i) {
      for (int j = 0; j < 3; ++j) {
        cells[i][j] = new Cell(i, j);
      }
    }
  }

  // Return `Empty` if there is no winner yet, else `X`/`O` as the winner
  public String isWinner() {
    String ret = "Empty";

    for (int i = 0; i < 3; ++i) {
      if (cells[i][0].status == cells[i][1].status && cells[i][0].status == cells[i][2].status) {
        ret = cells[i][0].status.name();
        if (ret != "Empty")
          return ret;
      }
    }

    for (int j = 0; j < 3; ++j) {
      if (cells[0][j].status == cells[1][j].status && cells[0][j].status == cells[2][j].status) {
        ret = cells[0][j].status.name();
        if (ret != "Empty")
          return ret;
      }
    }

    if (cells[0][0].status == cells[1][1].status && cells[1][1].status == cells[2][2].status) {
      ret = cells[0][0].status.name();
      if (ret != "Empty")
        return ret;
    }

    if (cells[0][2].status == cells[1][1].status && cells[1][1].status == cells[2][0].status) {
      ret = cells[0][2].status.name();
      if (ret != "Empty")
        return ret;
    }

    return ret;
  }

  // Draw case: isWinner = false & isFull = true
  public boolean isFull() {
    boolean ret = true;
    for (int i = 0; i < 3; ++i) {
      for (int j = 0; j < 3; ++j)
        ret = cells[i][j].status == CellStatus.Empty ? false : ret;
    }
    return ret;
  }

  // Render board state
  public void printBoard() {
    for (int i = 0; i < 3; ++i) {
      for (int j = 0; j < 3; ++j) {
        System.out.print(
            "[ " + (cells[i][j].status.name() == "Empty" ? " " : cells[i][j].status.name()) + " ]");
        System.out.print(" ");
      }
      System.out.println();
    }
  }

  // Mark cell as X/O
  public boolean tickCell(Cell ticked, int player) {
    if (ticked.status != CellStatus.Empty) {
      System.out.println("Cell has been marked, please try again");
      return false;
    }
    cells[ticked.xCell][ticked.yCell].status = player == 0 ? CellStatus.X : CellStatus.O;
    return true;
  }
}
