
package cursoXTI;

public class ClasseWrapper {
    
    public static void main(String[] args){
    
    Double peso = new Double(75.00);
    int i = peso.intValue();
    byte b = peso.byteValue();
    String s = peso.toString();
    
    char sexo = 'M';
    
    Boolean casado = new Boolean (false);
    
    //CONVERSÃO ESTÁTICA    
    
    
     
    int i2 = Integer.valueOf("1001010", 2);//Converte binário na base binária
    System.out.println(i2);  
    }
    
}
