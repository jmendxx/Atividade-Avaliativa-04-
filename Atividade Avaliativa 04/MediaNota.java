/*
 * @(#)MediaNota.java
 *
 *
 * @author Juliana
 * 12.5.2024
 */
import java.util.Scanner;
public class MediaNota {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        double soma = 0;

        System.out.println("Digite as 4 notas do aluno para verificar se ele foi aprovado: ");

        for (int i = 0; i < 4; i++){

            System.out.println("Digite a nota " + (i + 1) + ":");
            double notas = ler.nextInt();
            soma += notas;
        }

       double media = soma / 4;

        if (media >= 6.5){

           System.out.println("Aluno aprovado.");
        }else{
            System.out.println("Aluno Reprovado.");
        }
    }    
}
