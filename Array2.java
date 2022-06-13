package stud;

public class Array2 {

  public static void main(String[] args) {
    boolean isDebugMode = false;
    int a = 10;
    int b = 3;
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


