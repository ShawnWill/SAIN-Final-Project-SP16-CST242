package Bags;

public class Course {
  private String courseName;
  private String courseTitle;
  private static String grade;
  private double credits;
  
  @Override
  public String toString() {
    return "Course [courseName=" + courseName + ", courseTitle=" + courseTitle + ", grade=" + grade
        + ", credits=" + credits + "]";
  }
  public String getCourseName() {
    return courseName;
  }
  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }
  public String getCourseTitle() {
    return courseTitle;
  }
  public void setCourseTitle(String courseTitle) {
    this.courseTitle = courseTitle;
  }
  public static String getGrade() {
    return grade;
  }
  public void setGrade(String grade) {
    this.grade = grade;
  }
  public double getCredits() {
    return credits;
  }
  public void setCredits(double credits) {
    this.credits = credits;
  }
}
