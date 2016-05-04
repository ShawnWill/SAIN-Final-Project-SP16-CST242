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

public class SaveUserLogins {
  private static String User;
  private static String Pass;
  static Properties properties;
  public static HashMap<String, String> userMap = new HashMap<String,String>();

  public static void SaveUserLogins(String username, String password){
    
    userMap.put(username, password);
    
    try{
      File login = new File("userLogin.dat");
      FileOutputStream fos = new FileOutputStream(login , true);
      PrintWriter pw = new PrintWriter(fos);

        for(Map.Entry<String,String> m :userMap.entrySet()){
          pw.println(m.getKey()+"="+m.getValue());
        }

        pw.flush();
        pw.close();
        fos.close();
      }catch(Exception e){}

      System.out.println(userMap);

  }
}
