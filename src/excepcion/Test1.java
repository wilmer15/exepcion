
package excepcion;

public class Test1 {
public Test1(){
    divideByZero();
}
int divideByZero(){
    return 25/0;
}
  
    public static void main(String[] args) {
   new Test1();
    }
    
}
