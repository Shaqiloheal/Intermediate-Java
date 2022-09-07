public class Methods {
    public static void main(String[] args) {
      String test1 = "Double";
      double test2 = 5.8;
  
      // Enter code below...
      boolean isTest1Double = Methods.isDouble(test1);
      boolean isTest2Double = Methods.isDouble(test2);
  
      System.out.println("test1 is double - " + isTest1Double);
      System.out.println("test2 is double - " + isTest2Double);    
    }
  
    public static <T> boolean isDouble (T object) {
      return object instanceof Double;
    }
  }