
package duvidas;
import javax.swing.JOptionPane;

public class testaDuvidas {
    
    public static void main(String[] args){
    
        Aluno a = new Aluno();
        
        String nomes = JOptionPane.showInputDialog(null,"Nome: ");
        a.setNome(nomes);
        String anos = JOptionPane.showInputDialog(null,"O ano que nasceu:");
        int x = Integer.parseInt(anos);
        
        x = 2013 - x;
        a.setAno(x);
        String cpfs = JOptionPane.showInputDialog(null,"Seu cpf: ");
        int z = Integer.parseInt(cpfs);
        a.setCpf(z);
        String cursos = JOptionPane.showInputDialog(null,"Qual é o seu curso: ");
        a.setCurso(cursos);
        
        
        System.out.println("Nome: "+ nomes);
        System.out.println("Idade: " + x + " anos");
        System.out.println("CPF: " + z);
        System.out.println("Curso: " + cursos);
        
        
        
    }
    
}
