package Launch;

import SAIN_Report.LoginController;
import SAIN_Report.LoginWindowGui;
import StudentSaver_Loader.loader;
import UserLogin.RememberUserLogins;
import javafx.application.Application;
import javafx.stage.Stage;

public class LaunchSTAINReport extends Application{
  public static void main(String[] args) {
    RememberUserLogins.RememberUserLogins();
   // loader.loader();
    launch(args);
  }
  
  public void start(Stage primaryStage){
    LoginWindowGui view = new LoginWindowGui(primaryStage);
    LoginController lcont = new LoginController(view);
  }
}