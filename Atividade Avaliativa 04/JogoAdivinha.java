/*
 * @(#)JogoAdivinha.java
 *
 *
 * @author Juliana
 * 12.5.2024
 */
import java.util.Scanner;
public class JogoAdivinha {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("Bem vindo ao jogo de adivinh!");
        System.out.println("Um jogador pensará em um número e o outro tentará adivinhar.");

        System.out.println("\nDigite o numero pensado pelo primeiro jogador: ");
        int numImaginado = ler.nextInt();
        
        int tentativas = 0;
        int chute = 0;
        
        do {
            System.out.print("Tentativa " + (tentativas + 1) + ": Digite seu chute: ");
            chute = ler.nextInt();
            tentativas++;

            if (chute < numImaginado){
                System.out.println("Seu chute foi baixo. Tente novamente!");
            } else if (chute > numImaginado) {
                System.out.println("Seu chute foi alto. Tente novamente!");
            }
            
        } while (chute != numImaginado);

        System.out.println("Parabéns! Você acertou o número " + numImaginado + " em " + tentativas + " tentativas.");

        ler.close();
    }
    
}
