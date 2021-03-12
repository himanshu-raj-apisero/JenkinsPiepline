class Calc {
 
 public int add(int a, int b) {
  return (a+b);
  }
  
  public int sub(int a, int b) {
  return (a-b);
  }
  
  public float div(int a, int b) {
  return (a/b);
  }
  
  public float mul(float a, float b) {
  return (a*b);
  } 
 }
  
public class JenkinsTut {
  public static void main(String args[]) {
    
    Calc C = new Calc();
    System.out.println("Additions is: " + C.add(23, 23));
    System.out.println("Subtraction is: " + C.sub(23234, 23));
    System.out.println("Division is: " + C.div(1234.34, 3.34));
    System.out.println("Multiplication is is: " + C.mul(23, 23));
    
    }
 }