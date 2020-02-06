import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Pyramid {
 private static Deque<Integer> digits = new ArrayDeque<>();

  public static void main(String[] args) {
    System.out.println("Please enter a number:");

    Scanner scan = new Scanner(System.in);
    int n = Integer.parseInt(scan.nextLine());

//   Load the digits in deque witch will serve as a storage, we start from 1,
//   because it is specifically required (1..N).
    for (int i = 1; i <= n; i++) {
      digits.push(i);
    }

//   Divide n by 2, so we can determine how many rows the pyramid should have.
    int rows = n / 2;

    for (int i = 0; i < rows; i++) {
//    Identify indentation
      int spacesCount = rows - 1 - i;
//    Prints required spaces. We need the pyramid's side A, because we expect side B to be symmetrical.
      printSpace(spacesCount);
//    Because we devided by 2 to find pyramid's rows,
//    now we align the digits as a columns and we are sure,
//    that we are going to have symmetrical distribution of rows and columns always.
//    Prints digits.
      printDigits(rows - spacesCount);

      System.out.println();
    }

  }

  public static void printSpace(int spacesCount) {
    for (int i = 0; i < spacesCount; i++) {
      System.out.print(" ");
    }
  }

  public static void printDigits(int count) {
    while (count-- > 0 && digits.size() != 0) {
      System.out.print(Pyramid.digits.removeLast() + " ");
    }
  }
}
