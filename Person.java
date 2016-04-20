package SAIN_Report;

public class Person {
  
  private String UserName;
  private String Password;
  private String FName;
  private String LName;
  private String EMail;
  private String ID_No;
  
  public Person(String username, String password, String fName, String lName,
      String eMail, String id_no){
    super();
    this.UserName = username;
    this.Password = password;
    this.FName = fName;
    this.LName = lName;
    this.EMail = eMail;
    this.ID_No = id_no;
  }
  public String getUserName(){
    return UserName;
  }
  public void setUserName(String userName){
    UserName = userName;
  }
  public String getPassword(){
    return Password;
  }
  public void setPassword(String password){
    Password = password;
  }
  public String getFName(){
    return FName;
  }
  public void setFName(String fname){
    FName = fname;
  }
  public String getLName(){
    return LName;
  }
  public void setLName(String lname){
    LName = lname;
  }
  public String getEmail(){
    return EMail;
  }
  public void setEmail(String email){
    EMail = email;
  }
  public String getID_No(){
    return ID_No;
  }
  public void setID_No(String iD_No){
    ID_No = iD_No;
  }
  @Override
  public String toString(){
    return "Person [UserName=" + UserName + ", Password=" + Password + 
        ", Name=" + FName + " " + LName + ", ID_No=" + ID_No 
        + ", Email=" + EMail + "]";
  }
}