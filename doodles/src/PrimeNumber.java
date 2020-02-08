public class PrimeNumber {
  static int range = 100;

  public static void main(String[] args) {

    for (int i = 2; i <= range; i++) {
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
