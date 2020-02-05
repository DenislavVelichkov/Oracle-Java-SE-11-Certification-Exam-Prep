import java.util.List;

public class SortingLambdas {
  public static void main(String[] args) {
/**
 *     22. Which of the following are true to sort the list?(Choose all that apply.)
 */
    int multiplier = 1;
    multiplier *= -1;
    List<Integer> list = List.of(99, 66, 77, 88);

//    list.sort((x, y) -> multiplier * y.compareTo(x));

   /* (x, y) -> multiplier * y.compareTo(x)
    x, y -> multiplier * y.compareTo(x)
    (x, y) -> return multiplier * y.compareTo(x) F.x, y -> return multiplier * y.compareTo(x)*/

  }
}



