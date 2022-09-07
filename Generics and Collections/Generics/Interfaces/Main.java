public class Main {
    public static void main(String[] args) {
      int myNumber = 24;
      String bookName = "Hello Book!";
      
      // Int type Container and initialized with myNumber
      Retriever<Integer> containerRetriever = new Container<>(myNumber);
      // String type implementation initialized with bookName
      Retriever<String> bookRetriever = new Book(bookName);
      // Call to print result of containerRetriever
      System.out.println(containerRetriever.retrieveData());
      // Call to print result of bookRetriever
      System.out.println(bookRetriever.retrieveData());
  
    }
  }