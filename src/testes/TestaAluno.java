
package testes;
import modelo.Aluno;

public class TestaAluno {
    
    public static void main(String[] args){
    
    Aluno a;
    a = new Aluno();
    
    a.setCodigo(1234);
    a.setNome("Adriano");
    a.setIdade(28);
    
    System.out.println("Codigo: " + a.getCodigo());
    System.out.println("Nome: " + a.getNome());
    System.out.println("Idade: " + a.getIdade());
    
    
    }
    
}
