/**
 * This class loads the student in from a 
 * binary file, saved at the default location
 * and then adds them to the Student bag. 
 * 
 * @author sbw73_000
 */

package StudentSaver_Loader;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import Bags.Student;
import Bags.studentBag;

/**
 * The Class loader.
 */
public class loader{
  
  /** The student. */
  private static Student student;
  
  /** The stud. */
  private static Student stud;
  
  /**
   * Loader.
   *
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws ClassNotFoundException the class not found exception
   */
  public static void loader()throws IOException, ClassNotFoundException{
   try {
     FileInputStream fis = new FileInputStream("students.dat");
     ObjectInputStream ois = new ObjectInputStream(fis);
     
     //a loop to continue reading the next line 
     //of a binary file for the next student
     while(true){
       try {
        stud = new Student();
        stud = (Student) ois.readObject();
        //student = (Student) stud;
        System.out.println(stud);
        studentBag.add(stud);
        
      }catch(EOFException e){
        break;
      }  
    }
      
      ois.close();
      fis.close();
    }catch(FileNotFoundException e) {
      System.out.println("File not found");
    } 
  }
}
