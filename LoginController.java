package SAIN_Report;

import Main_Screen.MainScreen;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class LoginController {
  private LoginWindowGui view;
  private Person model; 
  
  private static String password;
  private static String user;
  
  public LoginController(LoginWindowGui view){
    view.setLoginListner(new LoginListener(){

      @Override
      public void buttonClicked(LoginEvent le) {
        model = le.getPerson();
        model.setUserName(le.getPerson().getUserName());
        model.setPassword(le.getPerson().getPassword());
        System.out.println(le.getSource());     
        System.out.println(le.getPerson());
        
        Parent root;
        Stage stage = new Stage();

        if(RememberUserLogins.userMap.containsKey(getUser())){
          String storedPassword = RememberUserLogins.userMap.get(model.getUserName());      
           if(storedPassword.equals(getPass())){
             System.out.println("Login Scussfull!!!");
             MainScreen view = new MainScreen(stage);
             
           } else {
             System.out.println("Password incorrect");
           }
         } else {
          System.out.println("User not Registered, "
              + "Please Register now.");
        }
        
        System.out.println(RememberUserLogins.userMap);
        
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
