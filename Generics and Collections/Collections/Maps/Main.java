import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    List<Integer> myInts = new ArrayList<>();
    Random random = new Random();

    for(int i =0; i < 20; i++) {
      myInts.add(random.nextInt(5));
    }

    Map<Integer, Integer> intCount = countNumbers(myInts);
    for(Map.Entry<Integer, Integer> entry: intCount.entrySet()) {
      System.out.println("Integer: "+ entry.getKey()+" appears: "+ entry.getValue());
    }
  }

  public static Map<Integer, Integer> countNumbers(List<Integer> list) {
    Map<Integer, Integer> intCount = new TreeMap<>();
    for(Integer i: list) {
      Integer currentCount = intCount.get(i);
      
      if (currentCount != null) {
        int newCount = currentCount + 1;
        intCount.put(i, newCount);
      } else {
        intCount.put(i, 1);
      }
    }
    return intCount;
  }
}