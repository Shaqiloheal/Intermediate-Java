package Input_And_Output;

import java.io.IOException;

public class IOExceptions {
  public static void main(String[] args){
    String path = "/home/ccuser/workspace/java-input-and-output-file-input-stream/input.txt";
    try {
      FileInputStream inputFile = new FileInputStream(path);
      int i = 0;    
      while((i = inputFile.read()) != -1) {    
        System.out.print((char)i);    
      }    
      inputFile.close();
    } catch (IOException e) {
      System.out.println("There has been an IO exception!");
      System.out.println(e);
    }
  }
}