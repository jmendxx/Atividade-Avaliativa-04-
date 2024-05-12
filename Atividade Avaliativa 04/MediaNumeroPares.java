/*
 * @(#)JogoAdivinha.java
 *
 *
 * @author Juliana
 * 11.5.2024
 */

import java.util.Scanner;
public class MediaNumeroPares {
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);

        int soma = 0;
        int quantidade = 0;

        System.out.println("Digite os números pares (digite 0 para finalizar): ");

        while(true){
            int num = ler.nextInt();

            if(num == 0){
                break;
            } 
            
            if (num % 2 == 0){
                soma += num;
                quantidade++;

            } else {
                System.out.println("Número impar, digite um número par.");
            }
        }

        if (quantidade > 0){
            double media = (double) soma / quantidade;

            System.out.println("A média dos numeros pares digitados é: " + media);
        } else{

            System.out.println("Nenhum número par foi digitado.");
        }
    }

}
