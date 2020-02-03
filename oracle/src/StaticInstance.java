class Foo {
  int x = 5;
}

public class StaticInstance {

  public static void main(String[] args) {
    Foo foo = new Foo();
    Foo bar = kindOfAnInstance(10);

    System.out.println(foo == bar);
    System.out.println(foo.x == bar.x);
    System.out.println(foo.x);
    System.out.println(bar.x);
  }

  public static Foo kindOfAnInstance(int n) {
    Foo z = new Foo();
    z.x = n / 2 + 1;
    z = new Foo();

    return z;
  }
}
