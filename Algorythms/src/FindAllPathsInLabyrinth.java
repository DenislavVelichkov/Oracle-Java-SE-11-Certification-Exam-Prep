import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAllPathsInLabyrinth {
  static char[][] labyrinth;
  static List<String> path = new ArrayList<>();

  public static void main(String[] args) {
    readLabyrinth();
    solve(0, 0, "S");
  }

  static void readLabyrinth() {
    Scanner sc = new Scanner(System.in);

    int rows = Integer.parseInt(sc.nextLine());
    int cols = Integer.parseInt(sc.nextLine());

    labyrinth = new char[rows][cols];

    for (int row = 0; row < rows; row++) {
      String currentLine = sc.nextLine();

      for (int col = 0; col < cols; col++) {
        labyrinth[row][col] = currentLine.charAt(col);
      }

    }
  }

  static void solve(int row, int col, String direction) {
    if (isOutsideOfTheLabyrinth(row, col)) {
      return;
    }

    path.add(direction);

    if (isOnExit(row, col)) {
      printSolution();
    } else if (isObstacle(row, col)) {

//      marks a start point
      labyrinth[row][col] = 'x';

      solve(row + 1, col, "D");
      solve(row - 1, col, "U");
      solve(row, col + 1, "R");
      solve(row + 1, col - 1, "L");

//      unmark start point

      labyrinth[row][col] = '-';
    }

//    remove last index
    path.remove(path.size() - 1);
  }

  static void printSolution() {
    System.out.println(String.join(", ",path.subList(1, path.size())));
  }

  static boolean isOnExit(int row, int col) {
    return labyrinth[row][col] == 'e';
  }

  static boolean isObstacle(int row, int col) {
//    already visited
    if (labyrinth[row][col] == 'x') {
      return false;
    }
//    wall
    if (labyrinth[row][col] == '*') {
      return false;
    }

    return true;
  }

  static boolean isOutsideOfTheLabyrinth(int row, int col) {
    return row < 0 || row >= labyrinth.length || col < 0 || col >= labyrinth[row].length;
  }


}
