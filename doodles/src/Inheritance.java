import java.util.ArrayList;

interface CanSwim {
}

class Amphibian implements CanSwim {
}

abstract class Tadpole extends Amphibian {
}

public class Inheritance {

  public static void main(String[] args) {
    var tadpoles = new ArrayList<Tadpole>();

    for (Amphibian amphibian : tadpoles) {
      CanSwim tadpole = amphibian;
    }

  }
}
