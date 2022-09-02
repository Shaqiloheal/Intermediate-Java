package Input_And_Output;

import java.io.*;

public class FileOutputStream {
  public static void main(String[] args) throws IOException {
    
    // Pass file path/name directly to FileOutputStream
    FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
    // Declare statement
    String outputText = "I am writing to file for the first time.";
    // Converts text to bytes
    fileOutputStream.write(outputText.getBytes());
    // Closes the file
    fileOutputStream.close();

  }

}