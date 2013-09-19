
package heranca;

public class Pessoa {
     
    private String nome;
    private int codigo;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", codigo=" + codigo + '}';
    }

    public Pessoa() {
    }

    public Pessoa(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

       
    
    
}
