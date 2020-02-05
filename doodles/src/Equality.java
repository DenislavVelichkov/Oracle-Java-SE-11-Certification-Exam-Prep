class Buzz {
  String abc = "abc";
  int x = 5;
}

class Fuzz {
  String abc = "abc";
  int x = 5;
}

public class Equality {

  public static void main(String[] args) {

    Fuzz fuzz = new Fuzz();
    Fuzz fuzz2 = new Fuzz();
    Buzz buzz = new Buzz();
    Fuzz fuzz3 = fuzz;
    Object someObject = new Object();

    String foo = "abc";
    String foo1 = "abc";
    String bar = new String("abc");

    System.out.println(foo == bar);
    System.out.println(foo == foo1);
    System.out.println(fuzz == fuzz2);
    System.out.println(fuzz == fuzz3);
    System.out.println(fuzz.abc == fuzz2.abc);
    System.out.println(fuzz.getClass().equals(Object.class)); // cant have ==, only equals()
    System.out.println(someObject.getClass() == Object.class);
    System.out.println(fuzz.getClass() instanceof Object);
    System.out.println(fuzz.getClass() == someObject);
    System.out.println(fuzz == someObject);
    System.out.println(fuzz.abc == buzz.abc);
    //Inconvertible types; cannot cast 'Buzz' to 'Fuzz'
//    System.out.println((Fuzz) buzz == fuzz);
    System.out.println((double) fuzz.x == buzz.x);
  }

}
