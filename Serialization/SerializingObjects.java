package Serialization;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SerializingObjects implements Serializable {
  private String make;
  private int year;
  private static final long serialVersionUID = 1L;

  // Car constructor
  public Car(String make, int year) {
    this.make = make;
    this.year = year;
  }

  public static void main(String[] args) throws FileNotFoundException, IOException {
    // Car objects
    Car toyota = new Car("Toyota", 2021);
    Car honda = new Car("Honda", 2020);

    //  FileOutputStream objects
    FileOutputStream fileOutputStream = new FileOutputStream("cars.txt");
    ObjectOutputStream objectOutputStream =  new ObjectOutputStream(fileOutputStream);

    // Serializing Car objects to cars.txt file
    objectOutputStream.writeObject(toyota);
    objectOutputStream.writeObject(honda);
  }
}