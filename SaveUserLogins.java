/**
2 * This class will save a users login
 * details. This includes the username and
 * password. This class is only able to be 
 * accessed by an Admin user. It does this
 * though a binary file.
 * 
 * @author ShawnWilliams
 */

package UserLogin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javafx.util.Pair;

/**
 * The Class SaveUserLogins.
 */
public class SaveUserLogins {
  
  /** The User. */
  private static String User;
  
  /** The Pass. */
  private static String Pass;
  
  /** The properties. */
  static Properties properties;
  
  /** The user map. */
  public static HashMap<String, String> userMap = new HashMap<String,String>();

  /**
   * Save user logins.
   *
   * @param username the username
   * @param password the password
   */
  public static void SaveUserLogins(String username, String password){
    
    //places a new user into the userMap
    userMap.put(username, password);
    
    
    try{
      //saves the userMap to a binary file
      File login = new File("userLogin.dat");
      FileOutputStream fos = new FileOutputStream(login , true);
      PrintWriter pw = new PrintWriter(fos);

        for(Map.Entry<String,String> m : userMap.entrySet()){
          pw.println(m.getKey() + "=" + m.getValue());
      }

      pw.flush();
      pw.close();
      fos.close();
    }catch(Exception e){
      e.printStackTrace();
    }
    System.out.println(userMap);
  }
}
