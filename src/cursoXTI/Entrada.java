
package cursoXTI;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args){
    
    Scanner t = new Scanner(System.in);
    
    System.out.print("Qual é o seu nome? ");
    String nome = t.nextLine();
    
    System.out.println("Qual é o seu segundo nome?");
    String segundoNome = t.nextLine();
    System.out.println("Seu nome é: " + nome  + " "+ segundoNome);
    
    }
}
