public class Recursion {

  public static void main(String[] args) {
    solve(25);
  }

  public static int solve(int n) {
    if (n == 0) {
      return n;
    }

    System.out.println(n % 2);

    return solve(n / 2);
  }
}
