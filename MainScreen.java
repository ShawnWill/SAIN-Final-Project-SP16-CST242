/**
 * This class is the main view for a student. 
 * It displays all relevant information to 
 * said student. This is done through a JavaFx GUI. 
 * It takes in all of the classes a student could have
 * or will take and there grades.
 * 
 * @author ShawnWilliams
 */


package Main_Screen;

import Bags.Major;
import Bags.Student;
import Bags.courseBagCS;
import Bags.majorBag;
import Bags.studentBag;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * The Class MainScreen.
 */
public class MainScreen {
  
  /** The s name. */
  private Label sName;
  
  /** The s major. */
  private Label sMajor;
  
  /** The s gpa. */
  private Label sGpa;
  
  /** The sname. */
  private TextArea sname;
  
  /** The smajor. */
  private TextArea smajor;
  
  /** The sgpa. */
  private TextArea sgpa;
  
  /** The min cred. */
  private double minCred;
  
  /** The name. */
  private String name;
  
  /** The major id. */
  private String majorId;
  
  /** The gpa. */
  private double gpa;
  
  /** The major. */
  private Major major;
  
  /** The set. */
  private Major set;
  
  /** The title. */
  private String title;
  
  /** The eng. */
  private String[] eng;
  
  /** The student. */
  private static Student student;
  
  /** The txt. */
  private StringBuilder txt;
  
  /** The user. */
  private static String user;
  
  /** The req taken. */
  private Label reqTaken;
  
  /** The oth taken. */
  private Label othTaken;
  
  /** The failed. */
  private Label failed;
  
  /** The taken. */
  private TextArea taken;
  
  /** The other. */
  private TextArea other;
  
  /** The fail. */
  private TextArea fail;
  
  /** The program rec. */
  private Label programRec;
  
  /** The min gpa. */
  private Label minGpa;
  
  /** The tot cred. */
  private Label totCred;
  
  /** The minimum. */
  private TextArea minimum;
  
  /** The total. */
  private TextArea total;
  
  /** The mingpa. */
  private TextArea mingpa;
  
  /** The cred tot. */
  private TextArea credTot;
  
  /** The minimum gpa. */
  private double minimumGPA; 
  
  /** The s. */
  private Stage s;
  
  /** The gp. */
  private GridPane gp;
  
  /**
   * Instantiates a new main screen.
   * This method does all of the major calculations
   * and displaying them for the sain report.
   *
   * @param stage the stage
   */
  public MainScreen(Stage stage){
   s = stage;
   s.setTitle("GENERATED SAIN REPORT");
   gp = new GridPane();
   
   Student[] studen = new Student[1];
   studen = studentBag.a;
   
   Student stude = new Student();
   stude = studen[0];
   
   name = stude.getName();
   majorId = stude.getMajorID();
   gpa = stude.getGpa();
   set = new Major();
   
   if(Student.getMajorID().equals("5101")){   
     set = majorBag.getMajor(majorId);   
     minimumGPA = Major.getMinGpa();
     title = set.getTitle();
     minCred = set.getCreditsNeeded();
   } else if(Student.getMajorID().equals("5104")) {
     set = majorBag.getMajor("5104");
     minCred = set.getCreditsNeeded();
     minimumGPA = Major.getMinGpa();
     title = set.getTitle();
   }
   
   sName = new Label("Students Name: ");
   sMajor = new Label("Studnets Major: ");
   sGpa = new Label("Students current GPA: ");
   sname = new TextArea(name);
   sname.setPrefSize(50, 30);
   smajor = new TextArea(title);
   smajor.setPrefSize(50, 30);
   sgpa = new TextArea(Double.toString(gpa));
   sgpa.setPrefSize(50, 30);
   
   reqTaken = new Label("Courses Taken");
   othTaken = new Label("Other Courses Taken");
   failed = new Label("Failed Courses");
   taken = new TextArea();
   
   int i = 0;
   while(i <= 1){
     taken.appendText(set.getEngCourse()[i].toString() + "\n");
     if(Student.getMajorID().equals("5101")){
       taken.appendText(set.getCstCourse()[i].toString() + "\n");
     }
     taken.appendText(set.getMatCourse()[i].toString() + "\n");
     if(Student.getMajorID().equals("5101")){
       taken.appendText(set.getSciCourse()[i].toString() + "\n");
     }
     i++;
   }   
   
   taken.setPrefWidth(50); 
   other = new TextArea();
   other.setPrefWidth(50);
   fail = new TextArea();
   fail.setPrefWidth(50);
   
   programRec = new Label("Required Course Credits: ");
   minGpa = new Label("Minimum Course GPA: ");
   totCred = new Label("Total Credits Taken: ");
   minimum = new TextArea(Double.toString(minimumGPA));
   minimum.setPrefSize(50, 30);
   total = new TextArea("26");
   total.setPrefSize(50, 30);
   mingpa = new TextArea(Double.toString(minimumGPA));
   mingpa.setPrefSize(50, 30);
   credTot = new TextArea(Double.toString(minCred));
   credTot.setPrefSize(50, 30);
   
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
   gp.add(taken, 0, 4);
   gp.add(other, 1, 4);
   gp.add(fail, 2, 4);
   gp.add(programRec, 0, 6);
   gp.add(credTot, 1, 6);
   gp.add(minGpa, 0, 7);
   gp.add(totCred, 0, 8);
   gp.add(minimum, 1, 7);
   gp.add(total, 1, 8);

   s.setScene(new Scene(gp));   
   s.show();  
   }
  
  /**
   * Gets the stu.
   *
   * @param stu the stu
   * @return the stu
   */
  public static void getStu(Student stu){
    student = stu;
  }
  
  /**
   * Gets the username.
   *
   * @param username the username
   * @return the username
   */
  public static void getUsername(String username){
    user = username;
  }
}