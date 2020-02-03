package OracleExamQuestions;

public class Matrices {
  public static void main(String[] args) {
    //What would be the output ?
    int n[][] = {{1, 3}, {2, 4}};
    for (int i = n.length - 1; i >= 0; i--) {
      for (int y : n[i]) {
        System.out.print(y);
      }
    }

  }
}
