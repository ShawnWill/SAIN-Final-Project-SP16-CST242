/**
 * The Sain Report program generates and displays a genererated
 * summary of a Students academic progress. It does this through
 * a JavaFX user interface. 
 * 
 * @author ShawnWilliams
 * @version 1.0
 * @since 2016-5-8
 */

package Launch;

import java.io.IOException;
import Bags.courseBagCS;
import Bags.courseBagIT;
import Bags.majorBag;
import Bags.studentBag;
import SAIN_Report.LoginController;
import SAIN_Report.LoginWindowGui;
import StudentSaver_Loader.loader;
import UserLogin.RememberUserLogins;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * This class consists of the Main method, launching the
 * Sain Report itself. This will then allow a user to enter
 * login information or an Admin to utilize their specific 
 * and special functions.
 * 
 * It also contains the Start method, which contains the 
 * controller and views for the project.
 * 
 * @author ShawnWilliams
 */

public class LaunchSTAINReport extends Application{
  
  /**
   * The main method.
   *
   * @param args the arguments
   */
  public static void main(String[] args) {
    RememberUserLogins.RememberUserLogins();
    studentBag.bag();
    courseBagCS.setEng();
    courseBagCS.setMat();
    courseBagCS.setCST();
    courseBagCS.setSci();
    courseBagIT.setEng();
    courseBagIT.setMat();
    courseBagIT.setCST();
    majorBag.setBag();

    try {
      loader.loader();
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    launch(args);
  }
  
  //sets the view and the controller
  public void start(Stage primaryStage){
    LoginWindowGui view = new LoginWindowGui(primaryStage);
    LoginController lcont = new LoginController(view);
  }
}