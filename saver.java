/**
 * This class takes a student object and then
 * Writes it into a Binary file at the default
 * location. 
 * 
 * @author ShawnWilliams
 */

package StudentSaver_Loader;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import Bags.Student;

/**
 * The Class saver.
 */
public class saver{
  
  /**
   * Saver.
   *
   * @param student the student
   * @throws IOException Signals that an I/O exception has occurred.
   */
  public static void saver(Student student)throws IOException{
    
    Student stud = new Student();
    stud = student;
    
    try {
     FileOutputStream fos = new FileOutputStream("students.dat");
     ObjectOutputStream oos = new ObjectOutputStream(fos);
     oos.writeObject(stud);
     System.out.println(stud.toString());
     oos.flush();
     oos.reset();
     oos.close();
     fos.close();
    }catch (FileNotFoundException e) {
     System.out.println("File not found");
    }   
  }
}
