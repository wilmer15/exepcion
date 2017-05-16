
package excepcion;


public class Test4 {
    public double areadelrectangulo(double altura, double ancho){
        if(altura<0||ancho<0)
            throw new IllegalArgumentException("lados positivos obligatorios");
            double area;
            area= altura*ancho;
            return area;
            
        
    }
    public static void main(String [] args){
        double resultado=0;
        Test4 test= new Test4();
        try{
            resultado=test.areadelrectangulo(10, 10);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(resultado);
    }
    
}
