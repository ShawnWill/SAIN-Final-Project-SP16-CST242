package Bags;

import java.io.Serializable;
import java.util.Arrays;

import StudentSaver_Loader.saver;

public class studentBag implements Serializable{
  private static int maxsize = 2;
  private static int count = 0;
  private static Student[] a = new Student[maxsize];
  Student[] b;
  
  public void bag(){
    a = new Student[maxsize];
  }
  
  public String bagString() {
    return Arrays.toString(a);
  }
  
  public static void add(Student student) {
    try {
      a[count] = student;
     // saver.saver(student);
      count++;
    } catch (ArrayIndexOutOfBoundsException n) {
      System.out.println("Array is full, element will not be added");
    } catch (NullPointerException e){
      e.printStackTrace();
    }
  }
  
  public void remove(Student b) {
    for (int i = 0; i < maxsize; i++) {
      if (contains(b)) {
        a[i] = a[count - 1];
      }
    }
  }
  
  public boolean contains(Student b) {
    int tf = 0;
    for (int i = 0; i < maxsize; i++) {
      if (a[i] == b) tf = 1;
    }
    if (tf == 1) return true;
    else return false;
  }
}
