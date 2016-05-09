/**
 * This class handles all relevant information 
 * that will be used by the login controller
 * and listener. 
 * 
 * @author ShawnWilliams
 */

package SAIN_Report;

import java.util.EventObject;

import Bags.Student;

/**
 * The Class LoginEvent.
 */
public class LoginEvent extends EventObject{
  
  /** The student. */
  private Student student;
  
  /**
   * Instantiates a new login event.
   *
   * @param arg0 the arg0
   */
  public LoginEvent(Object arg0) {
    super(arg0);
  }
  
  /**
   * Instantiates a new login event.
   *
   * @param source the source
   * @param stu the stu
   */
  public LoginEvent(Object source, Student stu){
    super(source);
    student = stu;
  }
  
  /**
   * Gets the student.
   *
   * @return the student
   */
  public Student getStudent(){
    return student;
  }

}
