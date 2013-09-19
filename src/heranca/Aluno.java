
package heranca;

public class Aluno extends Pessoa {
    
   private short ano;
   private String curso;

    public short getAno() {
        return ano;
    }

    public void setAno(short ano) {
        this.ano = ano;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Aluno() {
    }

    @Override
    public String toString() {
        return "Aluno{"+ super.toString()  + "ano=" + ano + ", curso=" + curso + '}';
    }
   
    public Aluno(short ano, String curso) {
        this.ano = ano;
        this.curso = curso;
    }

   
}
