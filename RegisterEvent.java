package SAIN_Report;

import java.util.EventObject;
import Bags.Student;

public class RegisterEvent extends EventObject{

  private Student student;  
  
  public RegisterEvent(Object arg0) {
    super(arg0);
  }
  
  public RegisterEvent(Object source, Student stu){
    super(source);
    student = stu;
  }
  
  public Student getStudent(){
    return student;
  }

}
