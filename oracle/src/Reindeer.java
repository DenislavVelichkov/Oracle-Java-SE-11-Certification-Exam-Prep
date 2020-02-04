class Deer {

  public Deer() {
    System.out.print("Deer");
  }

  public Deer(int age) {
    System.out.print("DeerAge");
  }

  protected boolean hasHorns() {
    return false;
  }
}

public class Reindeer extends Deer {

  public Reindeer(int age) {
    System.out.print("Reindeer");
  }

  public boolean hasHorns() {
    return true;
  }

  public static void main(String[] args) {
    Deer deer = new Reindeer(5);
    System.out.println("," + deer.hasHorns());
  }
}