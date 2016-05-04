package Bags;

public class majorBag {
  private Major compSci;
  private Major infoTech;
  
  public void compSci(){
    compSci = new Major();
    compSci.setTitle("Computer Science");
    compSci.setCreditsNeeded(65);
    compSci.setHegisCode("5101");
    compSci.setMajorNeeded(courseBagCS.getCst());
    compSci.setEngCourse(courseBagCS.getEng());
    compSci.setMatCourse(courseBagCS.getMat());
    compSci.setSciCourse(courseBagCS.getSci());    
  }
  
  public void infoTech(){
    infoTech = new Major();
    infoTech.setCreditsNeeded(70);
    infoTech.setHegisCode("5104");
    compSci.setMajorNeeded(courseBagIT.getCst());
    compSci.setEngCourse(courseBagIT.getEng());
    compSci.setMatCourse(courseBagIT.getMat());
  }
  
  public void setBag(){
    Major[] majorbg = new Major[2];
    majorbg[0] = compSci;
    majorbg[1] = infoTech;
  }

}
