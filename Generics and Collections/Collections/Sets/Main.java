import java.util.Set;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {

  //Set<String> stringSet = new HashSet<>(); - Unordered Empty Set
    Set<String> stringSet = new TreeSet<>(); // Empty Set thats Ordered
    stringSet.add("Hello"); // true - "Hello"
    stringSet.add("World"); // true - "Hello", "World" (Ordered)
    stringSet.add("Hello"); // false - "Hello", "World" (no change but ordered)

    for (String element: stringSet) {
      System.out.println(element); 
    } // Prints "Hello", "World"

  }
}