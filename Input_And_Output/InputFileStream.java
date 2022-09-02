package Input_And_Output;

import java.io.*;

public class InputFileStream {
  public static void main(String[] args) throws IOException {
    // file path variable
    String path = "/home/ccuser/workspace/java-input-and-output-file-input-stream/input.txt";

    // declare FileInputStream object
    FileInputStream inputFile = new FileInputStream(path);

    // counter variable to loop through the file
    int i = 0;

    // while loop to access each character
    while((i = inputFile.read()) != -1) {
      // printing each character as it's reached
      System.out.print((char)i);

    }
    // closing inputFile object
    inputFile.close();

  }
  
}