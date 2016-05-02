package SAIN_Report;

import Bags.Student;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RegisterController {
  private LoginWindowGui view;
  private Student model; 
  private GridPane gp;
  private Button Register;
  private TextField passwordFeild;
  private TextField usernameFeild;
  private TextField name;
  private Label Name;
  private TextField lname;
  private Label LastName;
  private TextField email;
  private Label EMail;
  private TextField idNo;
  private Label IDNum;
  private Label user;
  private Label pass;
  
  public RegisterController(LoginWindowGui view){
    view.setRegisterListener(new RegisterListener(){

      @Override
      public void buttonClicked(RegisterEvent re){
        model = re.getStudent();
        System.out.println(re.getSource());
        
        Parent root;
        Stage stage = new Stage();
        stage.setTitle("Register New User: Set Username");
        gp = new GridPane();
        Register = new Button("Register");
        passwordFeild = new TextField();
        pass = new Label("Password: ");
        user = new Label("Username: ");
        usernameFeild = new TextField();
        name = new TextField();
        Name = new Label("Name: ");
       // lname = new TextField();
       // LastName = new Label("Last Name: ");
        email = new TextField();
        EMail = new Label("Email Address");
        idNo = new TextField();
        IDNum = new Label("ID Number: ");
        
        Register.setOnMouseClicked(new EventHandler<MouseEvent>(){

          @Override
          public void handle(MouseEvent event) {
            SaveUserLogins.SaveUserLogins(usernameFeild.getText(),
                passwordFeild.getText());
            model.setUserName(usernameFeild.getText());
            model.setPassword(passwordFeild.getText());
            model.setName(name.getText());
            model.setMajorID(re.getStudent().getMajorID());
            model.setGpa(re.getStudent().getGpa());
            System.out.println("New User Added!!!");
            System.out.println(re.getStudent());
            stage.close();
          }         
        });
        
        gp.setAlignment(Pos.CENTER);
        gp.setHgap(10);
        gp.setVgap(10);
        gp.setPadding(new Insets(25, 25, 25, 25));
        gp.add(Register, 2, 6);
        gp.add(usernameFeild, 1, 0);
        gp.add(user, 0, 0);
        gp.add(passwordFeild, 1, 1);
        gp.add(pass, 0, 1);
        gp.add(Name, 0, 2);
        gp.add(name, 1, 2);
      //  gp.add(LastName, 0, 3);
      //  gp.add(lname, 1, 3);
        gp.add(email, 1, 4);
        gp.add(EMail, 0, 4);
        gp.add(idNo, 1, 5);
        gp.add(IDNum, 0, 5);
        
        stage.setScene(new Scene(gp));
        stage.show();
      }
      
    });
  }
}