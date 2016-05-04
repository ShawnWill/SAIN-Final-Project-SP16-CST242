package Bags;

import java.io.Serializable;

public class Student implements Serializable{
  
  private static String name;
  private String userName;
  private String password;
  private static String majorID;
  private static double gpa;
  private static double credits;
  private double grade;
  
  public Student(String name, String userName, String password, 
                 String majorID, double gpa) {
    super();
    this.name = name;
    this.userName = userName;
    this.password = password;
    this.majorID = majorID;
    this.gpa = gpa;
  }
  public static String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public static String getMajorID() {
    return majorID;
  }
  public void setMajorID(String majorID) {
    this.majorID = majorID;
  }
  public static double getGpa() {
    return gpa;
  }
  public void setGpa(double gpa) {
    this.gpa = gpa;
  }
  @Override
  public String toString() {
    return "Student [name=" + name + ", userName=" + userName + ", password=" + password
        + ", majorID=" + majorID + ", gpa=" + gpa + "]";
  }
  
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
  
  public double generateGPA(){
    gpa = (credits * grade)/ credits;
    return gpa;
  }
}
