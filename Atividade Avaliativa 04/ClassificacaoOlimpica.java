/**
 * @(#)ClassificacaoOlimpica.java
 *
 * @author Juliana
 * 7.5.2024
 */

import java.util.Scanner;
public class ClassificacaoOlimpica {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);      

        System.out.println("Digite as informações dos paises:");

        String[] paises = new String[3];
        int[] pontuacoes = new int[3];
        
        for (int i = 0; i < 3; i++){
            System.out.println("País " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = ler.nextLine();
            paises[i] = nome;

            System.out.print("Quantidade de medalhas de ouro: ");
            int ouro = ler.nextInt();

            System.out.print("Quantidade de medalhas de prata: ");
            int prata = ler.nextInt();

            System.out.print("Quantidade de medalhas de brenze: ");
            int bronze = ler.nextInt();

            ler.nextLine();

            int pontuacao = calcularPontuacao(ouro,prata,bronze); 
            pontuacoes[i] = pontuacao;         

        }

        

        for (int i = 0; i < 3; i++){
            for (int j = i + 1; j < 3; j++){
                if (pontuacoes[i] < pontuacoes[j]){

                    int tempPontuacoes = pontuacoes[i];
                    pontuacoes[i] = pontuacoes[j];
                    pontuacoes[j] = tempPontuacoes;

                    String tempPaises = paises[i];
                    paises[i] = paises[j];
                    paises[j] = tempPaises;
                }
            }
        }

        System.out.println("\nClassificação países no quadro de medalhas: ");
        for (int i = 0; i < 3; i++){
            System.out.println((i + 1) + "° " + paises[i] + " - pontuação: " + pontuacoes[i]);
        }

    }

    public static int calcularPontuacao(int ouro, int prata, int bronze){
        return (ouro * 3) + (prata * 2) + bronze;
    }
    
}
