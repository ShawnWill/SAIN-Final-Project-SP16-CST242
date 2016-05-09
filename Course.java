/**
 * This class contains all the getters
 * and setters for any and all courses created,
 * as well as a toString method to printout 
 * a specific course. 
 * 
 * @author ShawnWilliams
 */

package Bags;

/**
 * The Class Course.
 */
public class Course {
  
  /** The course name. */
  private String courseName;
  
  /** The course title. */
  private String courseTitle;
  
  /** The grade. */
  private static String grade;
  
  /** The credits. */
  private double credits;
  
  //generates a printable version of the student
  @Override
  public String toString() {
    return "Course [courseName=" + courseName + ", courseTitle=" + courseTitle + ", grade=" + grade
        + ", credits=" + credits + "]";
  }
  
  /**
   * Gets the course name.
   *
   * @return the course name
   */
  public String getCourseName() {
    return courseName;
  }
  
  /**
   * Sets the course name.
   *
   * @param courseName the new course name
   */
  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }
  
  /**
   * Gets the course title.
   *
   * @return the course title
   */
  public String getCourseTitle() {
    return courseTitle;
  }
  
  /**
   * Sets the course title.
   *
   * @param courseTitle the new course title
   */
  public void setCourseTitle(String courseTitle) {
    this.courseTitle = courseTitle;
  }
  
  /**
   * Gets the grade.
   *
   * @return the grade
   */
  public static String getGrade() {
    return grade;
  }
  
  /**
   * Sets the grade.
   *
   * @param grade the new grade
   */
  public void setGrade(String grade) {
    this.grade = grade;
  }
  
  /**
   * Gets the credits.
   *
   * @return the credits
   */
  public double getCredits() {
    return credits;
  }
  
  /**
   * Sets the credits.
   *
   * @param credits the new credits
   */
  public void setCredits(double credits) {
    this.credits = credits;
  }
}
