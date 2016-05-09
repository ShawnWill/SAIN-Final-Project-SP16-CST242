/**
 * This class is an additional popup
 * that appears when an admin searches
 * for a student by their ID Number. Displaying
 * it for the admin to view. 
 * 
 * @author ShawnWilliams
 */

package AdminView;

import Bags.Student;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * The Class popup.
 */
public class popup {
  
  /** The name. */
  private TextArea name;
  
  /** The major id. */
  private TextArea majorId;
  
  /** The gpa. */
  private TextArea gpa;
  
  /** The name. */
  private Label NAME;
  
  /** The majorid. */
  private Label MAJORID;
  
  /** The gpa. */
  private Label GPA;
  
  /** The student. */
  private static Student student;
  
  /** The s. */
  private Stage s;
  
  /** The gp. */
  private GridPane gp;
  
  /**
   * Instantiates a new popup.
   *
   * @param stage the stage
   */
  public popup(Stage stage) {
    gp = new GridPane();
    s = stage;
    
    name = new TextArea();
    majorId = new TextArea();
    gpa = new TextArea();
    
    NAME = new Label("Student Name: ");
    MAJORID = new Label("Student Major: ");
    GPA = new Label("Student GPA: ");
    
    name.setText(student.getName());
    name.setPrefSize(75, 40);
    majorId.setText(student.getMajorID());
    majorId.setPrefSize(75, 40);
    gpa.setText(Double.toString(student.getGpa()));
    gpa.setPrefSize(75, 40);
    
    gp.setAlignment(Pos.CENTER);
    gp.setHgap(10);
    gp.setVgap(10);
    gp.setPadding(new Insets(25, 25, 25, 25));
    
    gp.add(NAME, 0, 1);
    gp.add(name, 0, 0);
    gp.add(majorId, 1, 0);
    gp.add(MAJORID, 1, 1);
    gp.add(gpa, 0, 2);
    gp.add(GPA, 1, 2);
    
    s.setScene(new Scene(gp));   
    s.show(); 
  }
  
  /**
   * Gets the stu.
   *
   * @param stu2 the stu2
   * @return the stu
   */
  public static void getStu(Student stu2){
    student = stu2;
  }
}