package Launch;

import SAIN_Report.LoginController;
import SAIN_Report.LoginWindowGui;
import SAIN_Report.RegisterController;
import SAIN_Report.RememberUserLogins;
import javafx.application.Application;
import javafx.stage.Stage;

public class LaunchSTAINReport extends Application{
  public static void main(String[] args) {
    RememberUserLogins.RememberUserLogins();
    launch(args);
  }
  
  public void start(Stage primaryStage){
    LoginWindowGui view = new LoginWindowGui(primaryStage);
    LoginController lcont = new LoginController(view);
    RegisterController rcont = new RegisterController(view);
  }
}