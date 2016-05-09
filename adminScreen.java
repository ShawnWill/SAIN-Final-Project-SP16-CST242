/**
 * The admin view is the main hub for all 
 * of an admins needs and uses. The username
 * for an admin is "admin", while the password
 * is "pass". 
 * 
 * The admins are able to search for a student by ID 
 * number, this will then display the proper information
 * as well as being able to add a new student to the 
 * program. 
 * 
 * @author ShawnWilliams
 */

package AdminView;

import java.io.IOException;

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
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class adminScreen{
  
  /** The s. */
  private Stage s;
  
  /** The gp. */
  private GridPane gp;
  
  /** The gp2. */
  private GridPane gp2;
  
  /** The tp. */
  private TabPane tp;
  
  /** The register. */
  private Button register; 
  
  /** The password feild. */
  private TextField passwordFeild;
  
  /** The Password. */
  private Label Password;
  
  /** The username feild. */
  private TextField usernameFeild;
  
  /** The Username. */
  private Label Username;
  
  /** The name field. */
  private TextField nameField;
  
  /** The Name. */
  private Label Name;  
  
  /** The id no field. */
  private TextField idNoField;
  
  /** The ID num. */
  private Label IDNum;
  
  /** The major id field. */
  private TextField majorIDField;
  
  /** The major. */
  private Label major;
  
  /** The GPA field. */
  private TextField GPAField;
  
  /** The gpa. */
  private Label gpa;

  /** The username. */
  private String username;
  
  /** The password. */
  private String password;
  
  /** The name. */
  private String name;
  
  /** The idno. */
  private String idno;
  
  /** The majorid. */
  private String majorid;
  
  /** The gpa_s. */
  private String gpa_s;
  
  /** The search. */
  private Button search;
  
  /** The stu search. */
  private Label stuSearch;
  
  /** The stu search2. */
  private Label stuSearch2;
  
  /** The idnum. */
  private TextField idnum;
  
  /** The idnum2. */
  private String idnum2;
  
  /** The student. */
  private Student student;
  
  /** The stu2. */
  private static Student stu2;
 
  /**
   * Instantiates a new admin screen.
   *
   * @param stage the stage
   */
  public adminScreen(Stage stage){
       
    gp = new GridPane();
    gp2 = new GridPane();
    tp = new TabPane();
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
    
    
    //Handles the button click for the register button
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
        student = new Student(name, username, password, idno, majorid, Double.parseDouble(gpa_s));
        studentBag.add(student);
        //studentBag.save();
       // System.out.println(student);
        try {
          saver.saver(student);
          System.out.println(student.toString());
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
        System.out.println(student.toString());
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
    
    search = new Button("Search");
    stuSearch = new Label("Search for student");
    stuSearch2 = new Label("by Id number: ");
    idnum = new TextField();
    
    
    //Handles the button click for the search button
    search.setOnMouseClicked(new EventHandler<MouseEvent>(){

      @Override
      public void handle(MouseEvent event) {
        idnum2 = idnum.getText();
        studentBag.searchID(idnum2);
        popup view = new popup(stage);
        popup.getStu(stu2);
      }
    });
    
    gp2.setAlignment(Pos.CENTER);
    gp2.setHgap(10);
    gp2.setVgap(10);
    gp2.setPadding(new Insets(25, 25, 25, 25));
    
    gp2.add(stuSearch, 1, 1);
    gp2.add(stuSearch2, 1, 2);
    gp2.add(idnum, 2, 2);
    gp2.add(search, 3, 2);
    
    Tab add = new Tab("Add Student");
    add.setContent(gp);
    Tab search = new Tab("Search Students");
    search.setContent(gp2);
    
    tp.getTabs().add(add);
    tp.getTabs().add(search);
    s.setScene(new Scene(tp)); 
    s.show();
  }
}
