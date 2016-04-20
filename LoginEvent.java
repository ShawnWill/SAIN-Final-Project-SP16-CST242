package SAIN_Report;

import java.util.EventObject;

public class LoginEvent extends EventObject{
  
  private Person person;
  
  public LoginEvent(Object arg0) {
    super(arg0);
  }
  
  public LoginEvent(Object source, Person per){
    super(source);
    person = per;
  }
  
  public Person getPerson(){
    return person;
  }

}
