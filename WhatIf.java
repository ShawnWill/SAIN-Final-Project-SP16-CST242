/**
 * This class lets a student using the program
 * to choose their major. This allows a student to
 * have more freedom with what they wish to do
 * and see how it affects them.
 * 
 * @author ShawnWillaims
 */

package WhatIf;

import Bags.Student;
import Main_Screen.MainScreen;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * The Class WhatIf.
 */
public class WhatIf {
  
  /** The major choise. */
  private ComboBox<String> majorChoise;
  
  /** The submit. */
  private Button submit;
  
  /** The s. */
  private Stage s;
  
  /** The gp. */
  private GridPane gp;
  
  /** The c1. */
  private String c1;
  
  /** The c2. */
  private String c2;
  
  /** The stu. */
  private Student stu;

  /**
   * Instantiates a new what if.
   *
   * @param stage the stage
   */
  public WhatIf(Stage stage){
    s = stage;
    s.setTitle("What-If Analysis");
    
    majorChoise = new ComboBox<String>();
    c1 = new String("Computer Science (5101)");
    c2 = new String("Information Technology (5104)"); 
    majorChoise.getItems().addAll(c1 , c2);
    
    stu = new Student(null, null, null, null, null, 0);
    
    submit = new Button("Submit");
    
    //Handles the whatif input
    submit.setOnMouseClicked(new EventHandler<MouseEvent>(){
      @Override
      public void handle(MouseEvent arg0) {
        String value = new String(majorChoise.getValue());
        System.out.println(value);
        
        //selects the major the user wants to display
        if(value.equals(c1)){
          stu.setMajorID("5101");
          MainScreen.getStu(stu);
          MainScreen view = new MainScreen(stage);
        } else {
          stu.setMajorID("5104");
          MainScreen.getStu(stu);
          MainScreen view = new MainScreen(stage);
        }
      }    
    });
    
    gp = new GridPane();
    gp.setAlignment(Pos.CENTER);
    gp.setHgap(10);
    gp.setVgap(10);
    gp.setPadding(new Insets(25, 25, 25, 25));
    gp.add(majorChoise, 0, 0);
    gp.add(submit, 1, 0);
    
    s.setScene(new Scene(gp));
    s.show();
  }
}
