package Bags;

public class courseBagIT {
  private static Course[] eng;
  private static Course[] mat;
  private static Course[] cst;
  
  public void setEng(){
    eng = new Course[2];
    Course eng101 = new Course();
    eng101.setCourseName("Standard Freshman Composition");
    eng101.setCourseTitle("ENG 101");
    eng101.setCredits(3);
    eng101.setGrade(null);
    
    Course eng121 = new Course();
    eng121.setCourseName("Technical Writing");
    eng121.setCourseTitle("ENG 121");
    eng121.setCredits(3);
    eng121.setGrade(null);
    
    eng[0] = eng101;
    eng[1] = eng121;
  }
  
  public static Course[] getEng(){
    return eng;
  }
  
  public void setMat(){
    mat = new Course[2];
    Course mat107 = new Course();
    mat107.setCourseName("Computer Mathematics Concepts");
    mat107.setCourseTitle("MAT 107");
    mat107.setCredits(4);
    mat107.setGrade(null);
    
    Course mat141 = new Course();
    mat141.setCourseName("Calculus with Analytic Geometry I");
    mat141.setCourseTitle("MAT 141");
    mat141.setCredits(4);
    mat141.setGrade(null);
    
    mat[0] = mat107;
    mat[1] = mat141;
  }
  
  public static Course[] getMat(){
    return mat;
  }
  
  public void setCST(){
    cst = new Course[6];
    Course cst111 = new Course();
    cst111.setCourseName("Introduction to Computer Science");
    cst111.setCourseTitle("CST 111");
    cst111.setCredits(4);
    cst111.setGrade(null);
  
    Course cst112 = new Course();
    cst112.setCourseName("Introduction to Programing");
    cst112.setCourseTitle("CST 112");
    cst112.setCredits(4);
    cst112.setGrade(null);
    
    Course cst126 = new Course();
    cst126.setCourseName("Operating Systems: Linux / UNIX");
    cst126.setCourseTitle("CST 126");
    cst126.setCredits(4);
    cst126.setGrade(null);
    
    Course cst141 = new Course();
    cst111.setCourseName("Principles of Computing Using JAVA");
    cst111.setCourseTitle("CST 141");
    cst111.setCredits(4);
    cst111.setGrade(null);
    
    Course cst121 = new Course();
    cst121.setCourseName("Computer Organization and Assembly Language");
    cst121.setCourseTitle("CST 121");
    cst121.setCredits(4);
    cst121.setGrade(null);
    
    Course cst227 = new Course();
    cst227.setCourseName("Computer Organization and Assembly Language");
    cst227.setCourseTitle("CST 121");
    cst227.setCredits(4);
    cst227.setGrade(null);
    
    cst[0] = cst111;
    cst[1] = cst112;
    cst[2] = cst141;
    cst[3] = cst126;
    cst[5] = cst121;
    cst[6] = cst227;
  }
  
  public static Course[] getCst(){
    return cst;
  }
}
