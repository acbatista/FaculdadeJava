
package faculdadejava;

import javax.swing.JOptionPane;
public class TesteSwing {
    public static void main(String[] args){
    
    String n1 = JOptionPane.showInputDialog(null,"Digite o primeiro numero: ");    
    String n2 = JOptionPane.showInputDialog(null,"Digite o segundo numero: ");
    
        
        int numero1 = Integer.parseInt(n1);
        int numero2 = Integer.parseInt(n2);
        
    int total = numero1 + numero2;
    
    JOptionPane.showMessageDialog(null, total);
        
    }
}
