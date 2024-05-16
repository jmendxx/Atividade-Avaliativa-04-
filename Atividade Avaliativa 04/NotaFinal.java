/*
 * @(#)NotaFinal.java
 *
 *
 * @author Juliana
 * 12.5.2024
 */
import java.util.Scanner;
public class NotaFinal {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        double[] notas = new double[10];

        System.out.println("Digite as notas dos alunos:");

        for(int i = 0; i < 10; i++){
            System.out.print("Nota do " + (i + 1) + "° aluno: " );
            notas[i] = ler.nextDouble();
        }

        double soma = 0;
        int notasMaiores = 0;
        int notasMenores = 0;
        for(double nota : notas){
            soma += nota;

            if (nota >= 60.0){
                notasMaiores++;  

            } else {
                notasMenores++;
            }
        }

        double media = soma / 10;       
       
        System.out.printf("\nA média das notas dos alunos é: %.2f ", media);
        System.out.println("\nA quantidade de alunos aprovado é: " + notasMaiores);
        System.out.println("A quanridade de alunos reprovados é: " + notasMenores);
        
        ler.close();
    }
    
}
