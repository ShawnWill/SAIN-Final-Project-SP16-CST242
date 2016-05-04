package Bags;

public class Major {
   String Title;
   String hegisCode;
   double creditsNeeded;
   static double minGpa;
   Course[] majorNeeded;
   Course[] engCourse;
   Course[] sciCourse;
   Course[] matCourse;
   
  public String getTitle() {
    return Title;
  }
  public void setTitle(String title) {
    Title = title;
  }
  public String getHegisCode() {
    return hegisCode;
  }
  public void setHegisCode(String hegisCode) {
    this.hegisCode = hegisCode;
  }
  public double getCreditsNeeded() {
    return creditsNeeded;
  }
  public void setCreditsNeeded(double creditsNeeded) {
    this.creditsNeeded = creditsNeeded;
  }
  public static double getMinGpa() {
    return minGpa;
  }
  public void setMinGpa(double minGpa) {
    this.minGpa = minGpa;
  }
  public Course[] getMajorNeeded() {
    return majorNeeded;
  }
  public void setMajorNeeded(Course[] majorNeeded) {
    this.majorNeeded = majorNeeded;
  }
  public Course[] getEngCourse() {
    return engCourse;
  }
  public void setEngCourse(Course[] engCourse) {
    this.engCourse = engCourse;
  }
  public Course[] getSciCourse() {
    return sciCourse;
  }
  public void setSciCourse(Course[] sciCourse) {
    this.sciCourse = sciCourse;
  }
  public Course[] getMatCourse() {
    return matCourse;
  }
  public void setMatCourse(Course[] matCourse) {
    this.matCourse = matCourse;
  }
}
