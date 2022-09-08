enum CellStatus {
  Empty, X, O
}


public class Cell {
  int xCell;
  int yCell;
  CellStatus status;

  public Cell(int x, int y) {
    if (x < 0 || x > 2 || y < 0 || y > 2) {
      System.out.println("Wrong input format");
    } else {
      xCell = x;
      yCell = y;
      status = CellStatus.Empty;
    }
  }

}
