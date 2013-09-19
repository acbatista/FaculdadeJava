
package duvidas;

public class Aluno extends Pessoa{
    
    private int ano;
    private String curso;
    
    public int getAno(){
        return ano;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public String getCurso(){
        return curso;
    }
    
    public void setCurso(String curso){
        this.curso = curso;
    }
    
    public Aluno(){
    }

    @Override
    public String toString() {
        return "Aluno{"+ super.toString() + "ano=" + ano + ", curso=" + curso + '}';
    }
    
    public Aluno(int ano, String curso){
        this.ano = ano;
        this.curso = curso;
    }
    
}
