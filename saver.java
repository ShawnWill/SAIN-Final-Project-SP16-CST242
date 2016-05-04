package StudentSaver_Loader;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import Bags.Student;

public class saver{
  public static void saver(Student student){
    
    Student[] studentArray = new Student[2];
    studentArray[0] = student;   
    try {
      FileOutputStream fos = new FileOutputStream("students.dat", true);
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(studentArray);
      oos.flush();
      oos.close();
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
    } catch (IOException e) {
      System.out.println("Nope");
    }
  }
}
