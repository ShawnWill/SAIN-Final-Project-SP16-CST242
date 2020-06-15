/**
 * This class loads a users login information
 * to the memory. This information includes the
 * username and password. This runs at program start
 * up to prevent any delay in the ability of a user
 * to login ot the program. It reads the information
 * through a binary file.
 * 
 * @author ShawnWilliams
 */

package UserLogin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * The Class RememberUserLogins.
 */
public class RememberUserLogins {
  
  /** 
   * The user map. 
   * the location where all the user logins are saved
   */
  public static HashMap<String, String> userMap = new HashMap<String,String>();
  
  /**
   * Remember user logins.
   */
  public static void RememberUserLogins(){
    
    //Automatically creates an admin for program
    userMap.put("admin", "pass");
    
    //reads the binary file and places the values into the userMap
    try{
      File login = new File("userLogin.dat");
      FileInputStream fis = new FileInputStream(login);

      Scanner sc = new Scanner(fis);

      //read data from file line by line:
      String currentLine;
      while(sc.hasNextLine()){
        currentLine = sc.nextLine();
        //now tokenize the currentLine:
        StringTokenizer st = new StringTokenizer(currentLine,"=",false);
        //put tokens ot currentLine in map
        userMap.put(st.nextToken(),st.nextToken());
      }
      fis.close();
      //print All data in MAP
      for(Map.Entry<String,String> m :userMap.entrySet()){
        System.out.println(m.getKey() + " : " + m.getValue());
      }
    }catch(Exception e){
      e.printStackTrace();
    }
    System.out.println(userMap);
  }
}