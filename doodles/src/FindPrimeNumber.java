public class FindPrimeNumber {
  static int range = 10000000;

  public static void main(String[] args) {
    System.out.println(2);

    for (int i = 3; i <= range; i++) {

      if (isPrime(i)) {
        System.out.println(i);
      }
    }
  }

  static boolean isPrime(int n) {
    if (n % 2 == 0) return false;

    for (int i = 3; i * i <= n; i += 2) {
      if (n % i == 0) return false;
    }

    return true;
  }
}
