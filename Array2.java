package stud;

public class Array2 {

  public static void main(String[] args) {
    boolean isDebugMode = false;
    int a = 12;
    int b = 4;
    if(a + b > 10) {
      System.out.println("Мы попали в ветку true");
      a = 5;
    }else {
      System.out.println("Мы попали в ветку false");
      a = 11;
    }
    System.out.println(a + b);

    }
  }


