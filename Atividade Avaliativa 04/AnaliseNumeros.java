/*
 * @(#)AnaliseNumeros.java
 *
 *
 * @author Juliana
 * 12.5.2024
 */
import java.util.Scanner;
public class AnaliseNumeros {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int[] num = new int[5];

        int somaNumPar = 0;
        int somaNumImpar = 0;
        int quantidadeNumpar = 0;
        int quantidadeNumImpar = 0;

        System.out.println("Digite 5 número inteiro diferente de zero: ");

        for(int i = 0; i < 5; i++){
            System.out.print((i + 1) + "° número: ");
            num[i] = ler.nextInt();

            if(num[i] == 0 ){
                System.out.println("Digite um número diferente de zero.");
                i--;

            } else if (num[i] % 2 == 0){
                quantidadeNumpar++;
                somaNumPar += num[i];
            } else {
                quantidadeNumImpar++;
                somaNumImpar += num[i];
            }

        }

        System.out.println("Quantidade de números pares: " + quantidadeNumpar);
        System.out.println("Quantidade de números impares: " + quantidadeNumImpar);
        System.out.println("Soma de todos valores pares: " + somaNumPar);
        System.out.println("Soma de todos valores impares: " + somaNumImpar);
    
        ler.close();
    }
    
}
