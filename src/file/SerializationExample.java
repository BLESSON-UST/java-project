package file;

import java.io.*;

public class SerializationExample {
   public static void main(String[] args) {
      Employee emp = new Employee();
      emp.name = "Blesson";
      emp.address = "Kottayam";
      emp.SSN = 123456789;
      emp.number = 245045;

      try {
         FileOutputStream fileOut = new FileOutputStream("employee.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(emp);
         out.close();
         fileOut.close();
         System.out.println("Serialized data is saved in employee.ser");
      } catch (IOException i) {
         i.printStackTrace();
      }
   }
}

class Employee implements java.io.Serializable {
   public String name;
   public String address;
   public transient int SSN;
   public int number;
}
