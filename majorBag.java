/**
 * This class sets the rest of the Major 
 * Relevant information, such as a majors name
 * and the Hegis code ID number. It also sets the
 * course bags to a major. One bag per major.
 * 
 * @author ShawnWilliams
 */ 

package Bags;

/**
 * The Class majorBag.
 */
public class majorBag {
  
  /** The comp sci. */
  private static Major compSci;
  
  /** The info tech. */
  private static Major infoTech;
  
  /** The majorbg. */
  private static Major[] majorbg;
  
  /** The c. */
  private static Major c;
  //crates the Computer Science major

  /**
   * Comp sci.
   */
  public static void compSci(){
    compSci = new Major();
    compSci.setTitle("Computer Science");
    compSci.setCreditsNeeded(65);
    compSci.setHegisCode("5101");
    compSci.setMinGpa(2.0);
    compSci.setCstCourse(courseBagCS.getCst());
    compSci.setEngCourse(courseBagCS.getEng());
    compSci.setMatCourse(courseBagCS.getMat());
    compSci.setSciCourse(courseBagCS.getSci());    
  }
  
  //crates the Information and Technology major

  /**
   * Info tech.
   */
  public static void infoTech(){
    infoTech = new Major();
    infoTech.setCreditsNeeded(70);
    infoTech.setHegisCode("5104");
    infoTech.setMinGpa(3.0);
    infoTech.setMajorNeeded(courseBagIT.getCst());
    infoTech.setEngCourse(courseBagIT.getEng());
    infoTech.setMatCourse(courseBagIT.getMat());
  }
  
  /**
   * Sets the bag.
   */
  public static void setBag(){
    majorbg = new Major[2];
    compSci();
    infoTech();
    majorbg[0] = compSci;
    majorbg[1] = infoTech;
  }
  
  /**
   * Gets the major.
   * checks the input from what if to determine a students major
   * @param majorId the major id
   * @return the major
   */
  public static Major getMajor(String majorId){
    if(majorId.equals("5101")){
      c = majorbg[0];
      return c;
    } else if(majorId.equals("5104")){
      c = majorbg[1];
      return c;
    } else {
      return null;
    }
  }
}
