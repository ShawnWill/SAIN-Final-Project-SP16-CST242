package Main_Screen;

import Bags.Major;
import Bags.Student;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainScreen {
  
  private Label sName;
  private Label sMajor;
  private Label sGpa;
  private TextArea sname;
  private TextArea smajor;
  private TextArea sgpa;
  private String name;
  private String major;
  private double gpa;
  
  private Label reqTaken;
  private Label othTaken;
  private Label failed;
  private Label needed;
  private TextArea taken;
  private TextArea other;
  private TextArea fail;
  private TextArea need;
  
  private Label programRec;
  private Label minGpa;
  private Label totCred;
  private TextArea minimum;
  private TextArea total;
  private TextArea mingpa;
  private double minimumGPA; 
  
  private Stage s;
  private GridPane gp;
  
  public MainScreen(Stage stage){
   s = stage;
   s.setTitle("GENERATED SAIN REPORT");
   gp = new GridPane();
   
   name = new String(Student.getName());
   major = new String("CS");
   gpa = Student.getGpa();
   minimumGPA = Major.getMinGpa();
       
   sName = new Label("Students Name: ");
   sMajor = new Label("Studnets Major: ");
   sGpa = new Label("Students current GPA: ");
   sname = new TextArea(name);
   sname.setPrefSize(50, 30);
   smajor = new TextArea(major);
   smajor.setPrefSize(50, 30);
   sgpa = new TextArea(Double.toString(gpa));
   sgpa.setPrefSize(50, 30);
   
   reqTaken = new Label("Required Courses Taken");
   othTaken = new Label("Other Courses Taken");
   failed = new Label("Failed Courses");
   needed = new Label("Courses Needed for Major");
   taken = new TextArea();
   taken.setPrefWidth(50);
   other = new TextArea();
   other.setPrefWidth(50);
   fail = new TextArea();
   fail.setPrefWidth(50);
   need = new TextArea();
   need.setPrefWidth(50);
   
   programRec = new Label("Required Course Credits: ");
   minGpa = new Label("Minimum Course GPA: ");
   totCred = new Label("Total Credits Taken: ");
   minimum = new TextArea();
   minimum.setPrefSize(50, 30);
   total = new TextArea();
   total.setPrefSize(50, 30);
   mingpa = new TextArea();
   mingpa.setPrefSize(50, 30);
   
   gp.setAlignment(Pos.CENTER);
   gp.setHgap(10);
   gp.setVgap(10);
   gp.setPadding(new Insets(25, 25, 25, 25));
   
   gp.add(sName, 0, 0);
   gp.add(sMajor, 0, 1);
   gp.add(sGpa, 0, 2);
   gp.add(sname, 1, 0);
   gp.add(smajor, 1, 1);
   gp.add(sgpa, 1, 2);
   gp.add(reqTaken, 0, 3);
   gp.add(othTaken, 1, 3);
   gp.add(failed, 2, 3);
   gp.add(needed, 3, 3);
   gp.add(taken, 0, 4);
   gp.add(other, 1, 4);
   gp.add(fail, 2, 4);
   gp.add(need, 3, 4);
   gp.add(programRec, 0, 6);
   gp.add(minGpa, 0, 7);
   gp.add(totCred, 0, 8);
   gp.add(minimum, 1, 7);
   gp.add(total, 1, 8);

   s.setScene(new Scene(gp));   
   s.show();  
   }
}