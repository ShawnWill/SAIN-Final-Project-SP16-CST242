package StudentSaver_Loader;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

import Bags.Student;
import Bags.studentBag;

public class loader{
  private static Student student;
  public static void loader(){
   try {
     FileInputStream fis = new FileInputStream("students.dat");
     ObjectInputStream ois = new ObjectInputStream(fis);
     while(true){
       Student[] stu = null;
       int i = 0;
       try {
         stu = (Student[]) ois.readObject();
         studentBag.add(stu[i]);
       } catch (EOFException e) {
         break;
     }
       System.out.println(student);
       i++;
    }
  } catch (FileNotFoundException e) {
    System.out.println("File not found");
  } catch (ClassNotFoundException e) {
    System.out.println("File not found");
  } catch (IOException e) {
    e.printStackTrace();
  }
  System.out.println(student);
 }
}
