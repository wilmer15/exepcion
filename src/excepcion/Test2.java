
package excepcion;
import java.util.*;

public class Test2 {
   Test2(){
 
   } 
   double divideByZero(int denominador)
     throws Excepcion{
       double resultado=0;
       if(denominador==0)
           throw new Excepcion();
    resultado=25/denominador;
    System.out.println();
       return resultado;
   }
   public static void main(String [] args){
       Test2 j=new Test2();
       Scanner teclado= new Scanner(System.in);
       int denominador =0;
       double resultado=0;
       for(int i = 0;i<5;i++){
           denominador=teclado.nextInt();
           try{
           resultado= j.divideByZero(denominador);
           System.out.println(resultado);
       }catch(ArithmeticException e){
           e.printStackTrace();
       }catch(Excepcion exp){
           exp.printStackTrace();
       }
   }
}
}
