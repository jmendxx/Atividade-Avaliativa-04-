/*
 * @(#)EstoqueVinho.java
 *
 *
 * @author Juliana
 * 12.5.2024
 */
import java.util.Scanner;
public class EstoqueVinho {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int totalTinto = 0;
        int totalBranco = 0;
        int totalRose = 0;
        int totalGeral = 0;

        System.out.println("Bem-vindo ao sistema de levantamento de estoque de vinhos!");
        System.out.println("Informe os tipos de vinho sendo 'T' para tinto, 'B' para branco, 'R' para rose ou 'F' para finalizar: \n");

        while(true) {
            System.out.print("Digite o tipo de vinho ou 'F' para finalizar: ");
            char tipo = ler.next().charAt(0);

            if(tipo == 'F' || tipo == 'f'){
                break;
            } else if (tipo == 'T' || tipo == 't'){
                totalTinto = totalTinto + 1;
            } else if (tipo == 'B' || tipo == 'b'){
                totalBranco = totalBranco + 1;
            } else if (tipo == 'R' || tipo == 'r'){
                totalRose = totalRose + 1;
            }else{
                System.out.println("\nTipo de vinho inválido. Por favor, informe 'T', 'B', 'R' ou 'F'.\n");
            }

            totalGeral++;

        }

        System.out.println("\nLevantamento de Estoque:");
        System.out.printf("Total de vinhos tinto: %d (%.1f%%)\n", totalTinto, calcularPorcentagem(totalTinto, totalGeral));
        System.out.printf("Total de vinhos branco: %d (%.1f%%)\n", totalBranco, calcularPorcentagem(totalBranco, totalGeral));
        System.out.printf("Total de vinhos rose: %d (%.1f%%)\n", totalRose, calcularPorcentagem(totalRose, totalGeral));
        System.out.println("Total geral de vinhos: " + totalGeral);

        ler.close();
    }

    public static double calcularPorcentagem (int quantidadeTipo, int totalGeral){
        return (double) (quantidadeTipo * 100) / totalGeral;
    }
    
}
