/**
 * This sets up the classes for the
 * Information Computer Science Major. Courses are put
 * into arrays of objects then added to this specific 
 * major.
 * 
 * @author ShawnWilliams
 */

package Bags;

/**
 * The Class courseBagCS.
 */
public class courseBagCS {
  
  /** The eng. */
  private static Course[] eng;
  
  /** The mat. */
  private static Course[] mat;
  
  /** The cst. */
  private static Course[] cst;
  
  /** The sci. */
  private static Course[] sci;
  
  //the getters and setters for the major 
  //classes a student will take

  /**
   * Sets the eng.
   */
  public static void setEng(){
    eng = new Course[2];
    Course eng101 = new Course();
    eng101.setCourseName("Standard Freshman Composition");
    eng101.setCourseTitle("ENG 101");
    eng101.setGrade("A");
    eng101.setCredits(3);
    eng101.setGrade(null);
    
    Course eng102 = new Course();
    eng102.setCourseName("Introduction to Literature");
    eng102.setCourseTitle("ENG 102");
    eng102.setGrade("A");
    eng102.setCredits(3);
    eng102.setGrade(null);
    
    eng[0] = eng101;
    eng[1] = eng102;
  }
  
  /**
   * Gets the eng.
   *
   * @return the eng
   */
  public static Course[] getEng(){
    return eng;
  }
  
  /**
   * Sets the mat.
   */
  public static void setMat(){
    mat = new Course[2];
    Course mat141 = new Course();
    mat141.setCourseName("Calculus with Analytic Geometry I");
    mat141.setCourseTitle("MAT 141");
    mat141.setGrade("B");
    mat141.setCredits(4);
    mat141.setGrade(null);
    
    Course mat142 = new Course();
    mat142.setCourseName("Calculus with Analytic Geometry II");
    mat142.setCourseTitle("MAT 142");
    mat141.setGrade("A");
    mat142.setCredits(4);
    mat142.setGrade(null);
    
    mat[0] = mat141;
    mat[1] = mat142;
  }
  
  /**
   * Gets the mat.
   *
   * @return the mat
   */
  public static Course[] getMat(){
    return mat;
  }
  
  /**
   * Sets the cst.
   */
  public static void setCST(){
    cst = new Course[6];
    Course cst111 = new Course();
    cst111.setCourseName("Introduction to Computer Science");
    cst111.setCourseTitle("CST 111");
    cst111.setGrade("A");
    cst111.setCredits(4);
    cst111.setGrade(null);
  
    Course cst112 = new Course();
    cst112.setCourseName("Introduction to Programing");
    cst112.setCourseTitle("CST 112");
    cst112.setGrade("A");
    cst112.setCredits(4);
    cst112.setGrade(null);
   
    Course cst141 = new Course();
    cst141.setCourseName("Principles of Computing Using JAVA");
    cst141.setCourseTitle("CST 141");
    cst141.setGrade("B");
    cst141.setCredits(4);
    cst141.setGrade(null);
    
    Course cst222 = new Course();
    cst222.setCourseName("Computer Architecture");
    cst222.setCourseTitle("CST 222");
    cst222.setGrade("B");
    cst222.setCredits(4);
    cst222.setGrade(null);
    
    Course cst242 = new Course();
    cst242.setCourseName("Advanced Java Programing");
    cst242.setCourseTitle("CST 242");
    cst242.setGrade("C");
    cst242.setCredits(4);
    cst242.setGrade(null);
    
    Course cst246 = new Course();
    cst246.setCourseName("Data Structures");
    cst246.setCourseTitle("CST 246");
    cst246.setCredits(4);
    cst246.setGrade(null);
    
    cst[0] = cst111;
    cst[1] = cst112;
    cst[2] = cst141;
    cst[3] = cst222;
    cst[4] = cst242;
    cst[5] = cst246;
  }
  
  /**
   * Gets the cst.
   *
   * @return the cst
   */
  public static Course[] getCst(){
    return cst;
  }
  
  /**
   * Sets the sci.
   */
  public static void setSci(){
    sci = new Course[4];
    Course phy130 = new Course();
    phy130.setCourseName("Physics I");
    phy130.setCourseTitle("PHY 130");
    phy130.setGrade("A");
    phy130.setCredits(3);
    phy130.setGrade(null);
    
    Course phy132 = new Course();
    phy132.setCourseName("Physics I Lab");
    phy132.setCourseTitle("PHY 132");
    phy132.setCredits(1);
    phy132.setGrade(null);
    
    Course phy230 = new Course();
    phy230.setCourseName("Physics II");
    phy230.setCourseTitle("PHY 230");
    phy230.setCredits(3);
    phy230.setGrade(null);
    
    Course phy232 = new Course();
    phy232.setCourseName("Physics II Lab");
    phy232.setCourseTitle("PHY 232");
    phy232.setCredits(1);
    phy232.setGrade(null);
    
    sci[0] = phy130;
    sci[1] = phy132;
    sci[2] = phy230;
    sci[3] = phy232;
  }
  
  /**
   * Gets the sci.
   *
   * @return the sci
   */
  public static Course[] getSci(){
    return sci;
  }
}
