
package treyCatch;
import javax.swing.JOptionPane;

public class Converta {
    
    public static void main(String[] args){
   
        int[] array = new int[3];
        for (int i = 0; i < 3; i++) {
            try{
            array[i] = i;
            JOptionPane.showInputDialog(null,"Digite o primeiro numero:");
            }catch(ArrayIndexOutOfBoundsException e){
                
               System.out.println("erro " + e);
            }
            
        }
        
      String n1 = JOptionPane.showInputDialog(null,"Digite o primeiro numero:");
      String n2 = JOptionPane.showInputDialog(null,"Digite o segundo numero:");
      String n3 = JOptionPane.showInputDialog(null,"Digite o terceiro numero:");
    
      
      boolean continua = true;
        do {
              try{
              int a = Integer.parseInt(n1);
              System.out.println(a);
              int b = Integer.parseInt(n2);
              System.out.println(b);
              int c = Integer.parseInt(n3);
              System.out.println(c);
          }catch(NumberFormatException e){
              System.out.println("Dado não numerico");
          }finally{
              System.out.println("Final do precessamento");
                  }
        } while (continua);
      
      /*try{
          int a = Integer.parseInt(n1);
          System.out.println(a);
          int b = Integer.parseInt(n2);
          System.out.println(b);
          int c = Integer.parseInt(n3);
          System.out.println(c);
      }catch(NumberFormatException e){
          System.out.println("Dado não numerico");
      }finally{
          System.out.println("Final do precessamento");
              }**/
    }
}
