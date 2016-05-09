/**
 * This is the login screen that all users, 
 * Students and admins, will see upon program start up.
 * It allows the user to input there specific username
 * and password. Then it will bring them to the proper
 * view for the user type. Admins to the adminScreen class
 * and students to the WhatIf class, then to the mainSceen 
 * class. 
 * 
 * @author ShawnWilliams
 */

package SAIN_Report;

import Bags.Student;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * The Class LoginWindowGui.
 */
public class LoginWindowGui {
  
  /** The login. */
  private Button login;
  
  /** The username field. */
  public static TextArea usernameField;
  
  /** The user. */
  private Label user;
  
  /** The password field. */
  public static PasswordField passwordField;
  
  /** The pass. */
  private Label pass;
  
  /** The s. */
  private Stage s;
  
  /** The login listener. */
  private LoginListener loginListener;

  /** The gp. */
  private GridPane gp;
  
  /** The username. */
  private String username;
  
  /** The password. */
  private String password;
  
  /**
   * Instantiates a new login window gui.
   *
   * @param stage the stage
   */
  public LoginWindowGui(Stage stage){
    s = stage;
    s.setTitle("SAIN Login Screne");
    
    login = new Button("Login");
    usernameField = new TextArea();
    usernameField.setPrefSize(150, 30);
    user = new Label("Username: ");
    passwordField = new PasswordField();
    passwordField.setPrefSize(150, 30);
    pass = new Label("Password: ");
    
    
    //gets all relevant information from the Gui and
    //send it to the proper places for the login process.
    login.setOnAction(e -> {
      username = usernameField.getText();
      password = passwordField.getText();
      
      LoginController.setPass(password);
      LoginController.setUser(username);
      LoginEvent le = new LoginEvent(this, new Student(username, password, null, null, null, 0));
      
      if(loginListener != null){
        loginListener.buttonClicked(le);
      }
    });
        
    gp = new GridPane();
    gp.setAlignment(Pos.CENTER);
    gp.setHgap(10);
    gp.setVgap(10);
    gp.setPadding(new Insets(25, 25, 25, 25));
    
    gp.add(login, 2, 1);
    gp.add(usernameField, 1, 0);
    gp.add(user, 0, 0);
    gp.add(passwordField, 1, 1);
    gp.add(pass, 0, 1);
    
    s.setScene(new Scene(gp));
    s.show();
  }
  
  /**
   * Sets the login listener.
   *
   * @param listener the new login listener
   */
  public void setLoginListner(LoginListener listener){
    loginListener = listener;
  }
}