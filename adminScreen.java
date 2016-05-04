package AdminView;

import java.io.Serializable;

import Bags.Student;
import Bags.studentBag;
import StudentSaver_Loader.saver;
import UserLogin.SaveUserLogins;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class adminScreen implements Serializable{
  
  private Stage s;
  private GridPane gp;
  private Button register; 
  private TextField passwordFeild;
  private Label Password;
  private TextField usernameFeild;
  private Label Username;
  private TextField nameField;
  private Label Name;  
  private TextField idNoField;
  private Label IDNum;
  private TextField majorIDField;
  private Label major;
  private TextField GPAField;
  private Label gpa;
  
  private String username;
  private String password;
  private String name;
  private String idno;
  private String majorid;
  private String gpa_s;
  
  private Student student;
 
  public adminScreen(Stage stage){
       
    gp = new GridPane();
    s = stage;
    s.setTitle("Admin");
    
    register = new Button("register");
    passwordFeild = new TextField();
    Password = new Label("Password: ");
    usernameFeild = new TextField();
    Username = new Label("Username: ");
    nameField = new TextField();
    Name = new Label("Full Name: ");
    idNoField = new TextField();
    IDNum = new Label("Student ID number: ");
    majorIDField = new TextField();
    major = new Label("Major ID Number: ");
    GPAField = new TextField();
    gpa = new Label("Student GPA: ");
    
    register.setOnMouseClicked(new EventHandler<MouseEvent>(){

      @Override
      public void handle(MouseEvent event) {
        username = usernameFeild.getText();
        password = passwordFeild.getText();
        name = nameField.getText();
        idno = idNoField.getText();
        majorid = majorIDField.getText();
        gpa_s = GPAField.getText();   
        
        SaveUserLogins.SaveUserLogins(username, password);
        student = new Student(name, username, password, idno, Double.parseDouble(gpa_s));
        studentBag.add(student);
        s.close();
      }     
    });
    
    gp.setAlignment(Pos.CENTER);
    gp.setHgap(10);
    gp.setVgap(10);
    gp.setPadding(new Insets(25, 25, 25, 25));
    
    gp.add(Username, 0, 0);
    gp.add(usernameFeild, 0, 1);
    gp.add(Password, 1, 0);
    gp.add(passwordFeild, 1, 1);
    gp.add(Name, 2, 0);
    gp.add(nameField, 2, 1);
    gp.add(IDNum, 3, 0);
    gp.add(idNoField, 3, 1);
    gp.add(major, 4, 0);
    gp.add(majorIDField, 4, 1);
    gp.add(gpa, 5, 0);
    gp.add(GPAField, 5, 1);
    gp.add(register, 7, 3);
    
    s.setScene(new Scene(gp)); 
    s.show();
  }
}
