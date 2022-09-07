import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Main {
  public static void main(String[] args) {
    Queue<String> line = new LinkedList<>(); // Empty LinkedList
    line.add("Mike"); // ["Mike"]
    line.add("Isabel"); // ["Mike", "Isabel"]
    line.add("Jenny"); // ["Mike", "Isabel", "Jenny"]

    for(String name: line) {
      System.out.println(name); // Iterate each name of the queue
    }

    processAlphabetically(line); // Calls the Alphabetical Linked List
    // Processing: Isabel
    // Processing: Jenny
    // Processing: Mike

  }
  public static void processAlphabetically(Queue<String> queue) {

    Queue<String> alphabeticalQueue = new PriorityQueue<>(); // Initalize Priority Queue

    for (String name: queue) {
      alphabeticalQueue.offer(name); // For loop that iterates all elements of the queue
    }
    while (alphabeticalQueue.peek() != null) {
      String headElement = alphabeticalQueue.poll(); // While loop that Iterates the head element of the queue and removes it
      System.out.println("Processing: " + headElement); // prints processing message of the head element removed from the queue
    }

  }
  
}