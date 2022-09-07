import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    List<Integer> myInts = new ArrayList<>(); // Initializes Empty ArrayList

    myInts.add(9); // -> 9 <-
    myInts.add(13); // -> 9, 13 <-
    myInts.add(2); // -> 9, 13, 2 <-
    myInts.add(1); // -> 9, 13, 2, 1 <-
    myInts.add(11); // -> 9, 13, 2, 1, 11 <-
    myInts.add(39); // -> 9, 13, 2, 1, 11, 39 <-
    myInts.add(78); // -> 9, 13, 2, 1, 11, 39, 78 <-
    myInts.add(4); // -> 9, 13, 2, 1, 11, 39, 78, 4 <-

    Deque<Integer> result = separateInts(myInts);
    for(Integer i: result) {
      System.out.println(i);
    }
  }
  public static Deque<Integer> separateInts(List<Integer> integers) {

    Deque<Integer> separatedDeque = new ArrayDeque<>(); // Initialize Empty ArrayDeque

    //for enhanced loop iterates the integers that are even or odd
    for (Integer myInt: integers) {
      if (myInt % 2 == 0) {
        separatedDeque.addFirst(myInt); // adds even element to the front of the Deque
      } else {
        separatedDeque.addLast(myInt); // adds odd element to the end of the Deque
      }
  
    }
    return separatedDeque; // returns the -> even, odd <- deque
    // Result: -> 4, 78, 2, 9, 13, 1, 11, 39 <-
  }
}