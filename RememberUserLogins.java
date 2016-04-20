package SAIN_Report;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class RememberUserLogins {
  static HashMap<String, String> userMap = new HashMap<String,String>();
  
  public static void RememberUserLogins(){
    
    Properties properties = new Properties();
        
    try {
      properties.load(new FileInputStream("userLogin.properties"));
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    for (String key : properties.stringPropertyNames()) {
       userMap.put(key, properties.get(key).toString());
    }
    userMap.put("admin", "pass");
    System.out.println(userMap);
  }
  
  public static void addMultyUser(String username, String password){
    userMap.put(username, password);
  }
}