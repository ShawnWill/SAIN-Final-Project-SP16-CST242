/**
 * This class contains all students that can and will be saved into 
 * the program. It contains all the methods for searching for a 
 * specific student and return his/her specific data. This data can 
 * contain Name, ID number and GPA. 
 *
 * @author ShawnWilliams
 *
 */

package Bags;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

import AdminView.popup;
import StudentSaver_Loader.saver;
import javafx.stage.Stage;


/**
 * The Class studentBag.
 */
public class studentBag{
  
  /** The maxsize. */
  private static int maxsize = 2;
  
  /** The count. */
  private static int count = 0;
  
  /** The stu. */
  private static Object stu;
  
  private static Student student = new Student();
  
  /** The name. */
  public static String name;
  
  public static ArrayList<Student> studentList = new ArrayList<>();;
  
  /** The a. */
  public static Student[] a = new Student[maxsize];
  
  /** The b. */
  Student[] b;
  
  /**
   * Initializes the student bag.
   */
  public static void bag(){
    a = new Student[maxsize];
  }
  
  /**
   * Bag string.
   *
   * @return the string
   */
  public String bagString() {
    return Arrays.toString(a);
  }
  
  //Adds a student to the bag, and searched
  /**
   * Adds a student to the bag, and searched
   * @param stud 
   */
  public static void add(Student stud) {
    try {
      //stu = stud;
      a[count] = stud;
      
      studentList.add(stud);
      
      //saver.saver(a[count]);
      count++;
    } catch (ArrayIndexOutOfBoundsException n) {
      System.out.println("Array is full, element will not be added");
      System.out.println("Array will now be expanded. Please try again.");
      maxsize++;
    } catch (NullPointerException e){
      e.printStackTrace();
    } //catch (IOException e) {
     // e.printStackTrace();
    //}
  }
  
  /**
   * Removes a student if needed from the bag.
   *
   * @param b 
   */
  public void remove(Student b) {
    for (int i = 0; i < maxsize; i++) {
      if (contains(b)) {
        a[i] = a[count - 1];
      }
    }
  }
  
  /**
   * Contains.
   * Checks for repeat items in the bag
   * @param b the b
   * @return true, if successful
   */
  public static boolean contains(Student b) {
    int tf = 0;
    for (int i = 0; i < maxsize; i++) {
      if (a[i] == b) tf = 1;
    }
    if (tf == 1) return true;
    else return false;
  }
  
 
  /**
   * Search by id.
   * Searches a student by ID number
   * and returns that student to the asking
   *
   * @param id the id
   * @return the student
   */
  //class.
  public static Student searchID(String id){
    System.out.println("Searching bag for student: " + id);  
    for(int j = 0; j < maxsize; j++){
      Student stu2 = a[j];
      String idNo = stu2.getIdno();
      if(idNo.equals(id)){
        System.out.println(stu2);
        Stage stage = new Stage();
        popup.getStu(stu2);
        popup view = new popup(stage);
        return stu2;
      }else{
        System.out.println("No match");
      }break;
    }
    return null;
  }

  /**
   * Gets the student name.
   *
   * @param username the username
   * @return the student name
   */
  public static String getStudentName(String username){
    System.out.println("Getting Students name....");
    for(int k = 0; k < maxsize; k++){
      Student stu3 = a[k];
      String uname = stu3.getUserName();
      if(uname.equals(username)){
        name = stu3.getName();
      }
    }
    return name;
  }
}
