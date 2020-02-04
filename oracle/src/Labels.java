public class Labels {

  public static void main(String[] args) {
    var x = 5;
    var j = 0;
    OUTER:
    for (var i = 0; i < 3; )
      INNER:
          do {
            i++;
            x++;
            if (x > 10) break INNER;
            x += 4;
            j++;
          } while (j <= 2);
    System.out.println(x);
  }
}