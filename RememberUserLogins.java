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

public class RememberUserLogins {
  public static HashMap<String, String> userMap = new HashMap<String,String>();
  
  public static void RememberUserLogins(){
    
    userMap.put("admin", "pass");
    
    try{
      File login = new File("userLogin.dat");
      FileInputStream fis = new FileInputStream(login);

      Scanner sc=new Scanner(fis);

      //read data from file line by line:
      String currentLine;
      while(sc.hasNextLine()){
          currentLine=sc.nextLine();
          //now tokenize the currentLine:
          StringTokenizer st = new StringTokenizer(currentLine,"=",false);
          //put tokens ot currentLine in map
          userMap.put(st.nextToken(),st.nextToken());
      }
      fis.close();

      //print All data in MAP
      for(Map.Entry<String,String> m :userMap.entrySet()){
          System.out.println(m.getKey()+" : "+m.getValue());
      }
  }catch(Exception e){}
    System.out.println(userMap);
  }
}