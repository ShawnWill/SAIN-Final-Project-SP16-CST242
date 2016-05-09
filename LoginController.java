/**
 * This is the controller for the login screen.
 * It is what directs a user to the proper view for them
 * and it will be the class that actually takes in the 
 * information from the user and processes it. 
 * 
 * @author ShawnWilliams
 */

package SAIN_Report;

import AdminView.adminScreen;
import Bags.Student;
import Main_Screen.MainScreen;
import UserLogin.RememberUserLogins;
import WhatIf.WhatIf;
import javafx.scene.Parent;
import javafx.stage.Stage;

// TODO: Auto-generated Javadoc
/**
 * The Class LoginController.
 */
public class LoginController{
  
  /** The view. */
  private LoginWindowGui view;
  
  /** The model. */
  private Student model; 
  
  /** The password. */
  private static String password;
  
  /** The user. */
  private static String user;
  
  /**
   * Instantiates a new login controller.
   *
   * @param view the view
   */
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
        
        //searchs the userMap and compares that with the user
        //entered input on the login screen.
        if(RememberUserLogins.userMap.containsKey(getUser())){  
          String storedPassword = RememberUserLogins.userMap.get(getUser());      
            if(storedPassword.equals(getPass())){
              //checks if a user is an admin
              if(uname.equals("admin") && pname.equals("pass")){
               
                System.out.println("You are an admin....\n" + 
                                   "....Launching admin page.");  
                adminScreen view = new adminScreen(stage);
               
              } else { 
                //if user is nto an admin the whatif screen launches
                System.out.println("Login Scussfull!!!");
                MainScreen.getUsername(uname);
                WhatIf view = new WhatIf(stage);            
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
  
  /**
   * Sets the pass.
   *
   * @param password2 the new pass
   */
  public static void setPass(String password2) {
    password = password2;
  }   
  
  /**
   * Gets the pass.
   *
   * @return the pass
   */
  public String getPass(){
    return password;
  }  
  
  /**
   * Gets the user.
   *
   * @return the user
   */
  public String getUser(){
    return user;
  }
  
  /**
   * Sets the user.
   *
   * @param username the new user
   */
  public static void setUser(String username) {
    user = username;
  } 
}