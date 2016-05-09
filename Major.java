/**
 * This class contains all majors that are available
 * for student to be enrolled with. It will take all 
 * courses required for a major, as given by the course
 * bags, as well as set all relevant information for the
 * major. This included major title and hegis code. 
 *
 * @author ShawnWilliams
  */

package Bags;

/**
 * The Class Major.
 */
public class Major {
   
   /** The Title. */
   String Title;
   
   /** The hegis code. */
   String hegisCode;
   
   /** The credits needed. */
   double creditsNeeded;
   
   /** The min gpa. */
   static double minGpa;
   
   /** The major needed. */
   Course[] majorNeeded;
   
   /** The cst course. */
   Course[] cstCourse;
   
   /** The eng course. */
   Course[] engCourse;
   
   /** The sci course. */
   Course[] sciCourse;
   
   /** The mat course. */
   Course[] matCourse;
  
   //all of the getters and setters needed for a major

  /**
   * Gets the title.
   *
   * @return the title
   */
  public String getTitle() {
    return Title;
  }
  
  /**
   * Sets the title.
   *
   * @param title the new title
   */
  public void setTitle(String title) {
    Title = title;
  }
  
  /**
   * Gets the hegis code.
   *
   * @return the hegis code
   */
  public String getHegisCode() {
    return hegisCode;
  }
  
  /**
   * Sets the hegis code.
   *
   * @param hegisCode the new hegis code
   */
  public void setHegisCode(String hegisCode) {
    this.hegisCode = hegisCode;
  }
  
  /**
   * Gets the credits needed.
   *
   * @return the credits needed
   */
  public double getCreditsNeeded() {
    return creditsNeeded;
  }
  
  /**
   * Sets the credits needed.
   *
   * @param creditsNeeded the new credits needed
   */
  public void setCreditsNeeded(double creditsNeeded) {
    this.creditsNeeded = creditsNeeded;
  }
  
  /**
   * Gets the min gpa.
   *
   * @return the min gpa
   */
  public static double getMinGpa() {
    return minGpa;
  }
  
  /**
   * Sets the min gpa.
   *
   * @param minGpa the new min gpa
   */
  public void setMinGpa(double minGpa) {
    this.minGpa = minGpa;
  }
  
  /**
   * Gets the major needed.
   *
   * @return the major needed
   */
  public Course[] getMajorNeeded() {
    return majorNeeded;
  }
  
  /**
   * Sets the major needed.
   *
   * @param majorNeeded the new major needed
   */
  public void setMajorNeeded(Course[] majorNeeded) {
    this.majorNeeded = majorNeeded;
  }
  
  /**
   * Gets the eng course.
   *
   * @return the eng course
   */
  public Course[] getEngCourse() {
    return engCourse;
  }
  
  /**
   * Sets the eng course.
   *
   * @param engCourse the new eng course
   */
  public void setEngCourse(Course[] engCourse) {
    this.engCourse = engCourse;
  }
  
  /**
   * Gets the sci course.
   *
   * @return the sci course
   */
  public Course[] getSciCourse() {
    return sciCourse;
  }
  
  /**
   * Sets the sci course.
   *
   * @param sciCourse the new sci course
   */
  public void setSciCourse(Course[] sciCourse) {
    this.sciCourse = sciCourse;
  }
  
  /**
   * Gets the mat course.
   *
   * @return the mat course
   */
  public Course[] getMatCourse() {
    return matCourse;
  }
  
  /**
   * Sets the mat course.
   *
   * @param matCourse the new mat course
   */
  public void setMatCourse(Course[] matCourse) {
    this.matCourse = matCourse;
  }
  
  /**
   * Sets the cst course.
   *
   * @param cstCourse the new cst course
   */
  public void setCstCourse(Course[] cstCourse) {
    this.cstCourse = cstCourse;
  }
  
  /**
   * Gets the cst course.
   *
   * @return the cst course
   */
  public Course[] getCstCourse() {
    return cstCourse;
  }
}
