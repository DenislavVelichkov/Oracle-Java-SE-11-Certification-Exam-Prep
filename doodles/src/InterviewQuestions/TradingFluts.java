import java.util.*;
import java.util.stream.Collectors;

public class TradingFluts {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    List<Integer> boxesBought = new ArrayList<>();

    String input = scan.nextLine();
    int schuurs = Integer.parseInt(input);
    int boxesCount;
    boolean isUniquelyDetermined;
    int maximumProfit = 0;

    while (schuurs != 0) {
      if (input.equals("0")) { break; }

      isUniquelyDetermined = false;
      System.out.println("schuurs " + input);
      String[] pile = input.split("\\s+");


      Deque<Integer> flutsPrices = Arrays.stream(pile)
                                         .map((Integer::parseInt))
                                         .collect(Collectors.toCollection(ArrayDeque::new));
      boxesCount = flutsPrices.pop();

      while (boxesCount-- != 0) {
        int currentBoxPrice = flutsPrices.pop();

        if (currentBoxPrice > 10) {
          if (currentBoxPrice - 10 > flutsPrices.peek()) {
            isUniquelyDetermined = true;
            break;
          }
          maximumProfit -= currentBoxPrice - 10;
          boxesBought.add(currentBoxPrice);
        } else if (currentBoxPrice == 10) {
          boxesBought.add(currentBoxPrice);
        } else {
          maximumProfit += currentBoxPrice;
          boxesBought.add(currentBoxPrice);
        }
      }

      if (isUniquelyDetermined) {
        System.out.println("Maximum profit is " + maximumProfit + ".");
        System.out.print("Number of fluts to buy:");
        System.out.println(" " + boxesBought.size());
      } else if (!isUniquelyDetermined && schuurs-- == 0) {
        System.out.println("Maximum profit is " + maximumProfit + ".");
        System.out.print("Number of fluts to buy:");
        boxesBought.stream()
                   .sorted(Integer::compare)
                   .collect(Collectors.toCollection(LinkedList::new));
        System.out.println(" " + String.join(" ", boxesBought.toString().substring(0, 11)));
        break;
      }

      input = scan.nextLine();
    }

  }
}
