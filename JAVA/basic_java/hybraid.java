package basic_java;
class A {
    public void printl() {
      System.out.println("A");
    }
  }
  
  class B extends A {
    public void print() {
      System.out.println("B");
    }
  }
  
  class C extends A {
    public void print() {
      System.out.println("C");
    }
  }
  
  public class hybraid {
    public static void main(String[] args) {
      C c = new C();
      c.printl(); // Prints "C"
    }
  }
