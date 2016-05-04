package SAIN_Report;

import AdminView.adminScreen;
import Bags.Student;
import Main_Screen.MainScreen;
import UserLogin.RememberUserLogins;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class LoginController{
  private LoginWindowGui view;
  private Student model; 
  
  private static String password;
  private static String user;
  
  public LoginController(LoginWindowGui view){
    view.setLoginListner(new LoginListener(){
      
      @Override
      public void buttonClicked(LoginEvent le) {
        model = le.getStudent();
        model.setUserName(le.getStudent().getUserName());
        model.setPassword(le.getStudent().getPassword());
        System.out.println(le.getSource());     
        String uname = new String(LoginWindowGui.usernameField.getText());
        String pname = new String(LoginWindowGui.passwordField.getText());
        Parent root;
        Stage stage = new Stage();
        System.out.println(uname + " " + pname);
        if(RememberUserLogins.userMap.containsKey(getUser())){
          
          String storedPassword = RememberUserLogins.userMap.get(getUser());      
           if(storedPassword.equals(getPass())){
             
             if(uname.equals("admin") && pname.equals("pass")){
               
               System.out.println("You are an admin....\n" + 
                                  "....Launching admin page.");  
               adminScreen view = new adminScreen(stage);
               
             }else{ 
               
               System.out.println("Login Scussfull!!!");
               MainScreen view = new MainScreen(stage);            
             }            
           } else {
             
             System.out.println("Password incorrect");
           }
         } else {
           
          System.out.println("User not Registered, "
              + "Please Register now.");
        }
       }      
    });
  } 
  public static void setPass(String password2) {
    password = password2;
  }   
  public String getPass(){
    return password;
  }  
  public String getUser(){
    return user;
  }
  public static void setUser(String username) {
    user = username;
  } 
}