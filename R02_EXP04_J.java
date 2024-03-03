import java.util.HashSet;
  
public class ShortSet {
  public static void main(String[] args) {
    HashSet<Short> s = new HashSet<Short>();
    for (int i = 0; i < 10; i++) {
      s.add((short)i);
      // Remove a Short
      if (s.remove((short)i) == false) {
        System.err.println("Error removing " + i);
      }
    }
    System.out.println(s.size());
  }
}