/**
 * This class creates and gives values for
 * a student object. It creates an object
 * by setting values for all of the parameters 
 * that were deemed nesssassary to create a Student.
 * 
 * @author ShawnWilliams
 */

package Bags;

import java.io.Serializable;

/**
 * The Class Student.
 */
public class Student implements Serializable{
  
  /** The name. */
  private String name;
  
  /** The user name. */
  private String userName;
  
  /** The password. */
  private String password;
  
  /** The idno. */
  private String idno;
  
  /** The major id. */
  private static String majorID;
  
  /** The gpa. */
  private double gpa;
  
  /** The credits. */
  private static double credits;
  
  /** The get major. */
  public static Object getMajor;
  
  /** The grade. */
  private double grade;
  
  /** The major. */
  private Major major;
  
  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;
  
  /**
   * Instantiates a new student.
   *
   * @param userName the user name
   * @param password the password
   * @param name the name
   * @param idno the idno
   * @param majorID the major id
   * @param major the major
   * @param gpa the gpa
   */
  //generates a printable version of the student
  public Student(String Name, String userName, String password, 
                 String idno, String majorID, double gpa) {
    super();
    this.name = Name;
    this.userName = userName;
    this.password = password;
    this.majorID = majorID;
    this.idno = idno;
    this.gpa = gpa;
  }
  
  public Student() {
    // TODO Auto-generated constructor stub
  }

  /**
   * Gets the major.
   *
   * @return the major
   */
  public Major getMajor() {
    return major;
  }
  
  /**
   * Sets the major.
   *
   * @param major the new major
   */
  public void setMajor(Major major) {
    this.major = major;
  }
  
  /**
   * Gets the idno.
   *
   * @return the idno
   */
  public String getIdno() {
    return idno;
  }
  
  /**
   * Sets the idno.
   *
   * @param idno the new idno
   */
  public void setIdno(String idno) {
    this.idno = idno;
  }
  
  /**
   * Gets the name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }
  
  /**
   * Sets the name.
   *
   * @param name the new name
   */
  public void setName(String Name) {
    this.name = Name;
  }
  
  /**
   * Gets the user name.
   *
   * @return the user name
   */
  public String getUserName() {
    return userName;
  }
  
  /**
   * Sets the user name.
   *
   * @param userName the new user name
   */
  public void setUserName(String userName) {
    this.userName = userName;
  }
  
  /**
   * Gets the password.
   *
   * @return the password
   */
  public String getPassword() {
    return password;
  }
  
  /**
   * Sets the password.
   *
   * @param password the new password
   */
  public void setPassword(String password) {
    this.password = password;
  }
  
  /**
   * Gets the major id.
   *
   * @return the major id
   */
  public static String getMajorID() {
    return majorID;
  }
  
  /**
   * Sets the major id.
   *
   * @param majorID the new major id
   */
  public void setMajorID(String majorID) {
    this.majorID = majorID;
  }
  
  /**
   * Gets the gpa.
   *
   * @return the gpa
   */
  public double getGpa() {
    return gpa;
  }
  
  /**
   * Sets the gpa.
   *
   * @param gpa the new gpa
   */
  public void setGpa(double gpa) {
    this.gpa = gpa;
  }
  

  @Override
  public String toString() {
    return "Student [Name=" + name + ", userName=" + userName + 
        ", password=" + password + ", idno=" + idno
        + ", grade=" + grade + "]";
  }
  
  /**
   * Generage grade.
   *
   * @return the double
   */
  public double generageGrade(){
    int i = 0;
    if(Course.getGrade() == "A"){
      grade = 4;
      i = i + 4;
    }
    if(Course.getGrade() == "B"){
      grade = 3;
      i = i + 3;
    }
    if(Course.getGrade() == "C"){
      grade = 2;
      i = i + 2;
    }
    if (Course.getGrade() == "D"){
      grade = 1;
      i = i + 0;
    }else{
      grade = 0;
      i = i + 4;
    }
    grade = i;
    return grade;
  }
  
  /**
   * Generate gpa.
   *
   * @return the double
   */
  public double generateGPA(){
    gpa = (credits * grade)/ credits;
    return gpa;
  }
}
