import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    checkAnswer(1, 2, answer(new int[]{1, 0}));
    checkAnswer(2, 2, answer(new int[]{1, 2, 1}));
    checkAnswer(3, 2, answer(new int[]{1, 3, 0, 1}));
    checkAnswer(4, 3, answer(new int[]{2, 0, 4, 3, 5, 2, 1}));
    checkAnswer(5, 5, answer(new int[]{1, 2, 5, 6, 3, 4, 2, 1}));
    checkAnswer(6, 5, answer(new int[]{1, 8, 3, 7, 3, 6, 4, 5, 2}));
    checkAnswer(7, 9, answer(new int[]{1, 8, 3, 7, 0, 6, 4, 5, 2}));
    checkAnswer(8, 3, answer(new int[]{2, 0, 4, 3, 5, 2, 1}));
    checkAnswer(9, 4, answer(new int[]{2, 3, 4, 6, 1, 7, 8, 0, 1, 10}));
  }

  private static int answer(int[] pirates) {
    List<Integer> path = new ArrayList<>();
    int breakPoint = 0;

    for (int i = 0; i < pirates.length; ) {

      if (path.contains(i)) {
        breakPoint = i;
        break;
      }

      path.add(i);
      i = pirates[i];
    }

    return path.size() - path.indexOf(breakPoint);
  }

  private static void checkAnswer(int testCase, int expected, int actual) {
    if (expected == actual) {
      System.out.println("OK [Test Case " + testCase + "]");
    } else {
      System.out.println("FAIL [Test Case " + testCase + "]: Expected [" + expected + "] But was [" + actual + "]");
    }
  }
}
