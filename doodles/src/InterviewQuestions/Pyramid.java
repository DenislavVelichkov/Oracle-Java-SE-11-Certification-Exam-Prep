import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Pyramid {
  private static Deque<Integer> digits = new ArrayDeque<>();

  public static void main(String[] args) {
    System.out.println("Please enter a number:");

    Scanner scan = new Scanner(System.in);
    int input = Integer.parseInt(scan.nextLine());

//   Load the digits in deque witch will serve as a storage, we start from 1,
//   because it is specifically required (1..N).

    for (int i = 1; i <= input; i++) {
      digits.push(i);
    }

//   Count how many rows do we have to print.
//   For cycle is terminated before i == n, because we have started counting from 1 digit on the
//   first row.

    int rows = 1;
    for (int digitsCountOnARoll = 1; digitsCountOnARoll < input; digitsCountOnARoll++) {
      rows++;
      input -= digitsCountOnARoll;
    }

    for (int i = 1; i <= rows; i++) {
//    Identify indentation
      int spacesCount = rows - i;
//    Prints required spaces on the left side of the pyramid, because the pyramid is symmetrical,
//    we don't need to print the right side indentation.
      printSpace(spacesCount);
//    Calculates how many digits we have to print, based on spaces count.
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