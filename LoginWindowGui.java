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

public class LoginWindowGui {
  
  private Button login;
  public static TextArea usernameField;
  private Label user;
  public static PasswordField passwordField;
  private Label pass;
  private Stage s;
  private LoginListener loginListener;

  private GridPane gp;
  
  private String username;
  private String password;
  
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
    
    login.setOnAction(e -> {
      username = usernameField.getText();
      password = passwordField.getText();
      
      LoginController.setPass(password);
      LoginController.setUser(username);
      LoginEvent le = new LoginEvent(this, new Student(null, username, password, null, 0));
      
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
  
  public void setLoginListner(LoginListener listener){
    loginListener = listener;
  }
}