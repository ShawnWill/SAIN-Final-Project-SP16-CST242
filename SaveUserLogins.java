package SAIN_Report;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import javafx.util.Pair;

public class SaveUserLogins {
  private static String User;
  private static String Pass;
  public static HashMap<String, String> userMap = new HashMap<String,String>();

  public static void SaveUserLogins(String username, String password){
    
    userMap.put(username, password); 
    
    Properties properties = new Properties();

    for (HashMap.Entry<String,String> entry : userMap.entrySet()) {
        properties.put(entry.getKey(), entry.getValue());
    }

    try {
      properties.store(new FileOutputStream("userLogin.properties"), null);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }  
    
    System.out.println(userMap);
  }
}
