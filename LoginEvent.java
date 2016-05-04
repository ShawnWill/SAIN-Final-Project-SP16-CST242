package SAIN_Report;

import java.util.EventObject;

import Bags.Student;

public class LoginEvent extends EventObject{
  
  private Student student;
  
  public LoginEvent(Object arg0) {
    super(arg0);
  }
  
  public LoginEvent(Object source, Student stu){
    super(source);
    student = stu;
  }
  
  public Student getStudent(){
    return student;
  }

}
