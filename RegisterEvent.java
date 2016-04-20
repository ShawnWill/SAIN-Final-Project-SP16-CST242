package SAIN_Report;

import java.util.EventObject;

public class RegisterEvent extends EventObject{

  private Person person;  
  
  public RegisterEvent(Object arg0) {
    super(arg0);
  }
  
  public RegisterEvent(Object source, Person per){
    super(source);
    person = per;
  }
  
  public Person getPerson(){
    return person;
  }

}
