/*
 * @(#)EleicaoPresidencial.java
 *
 *
 * @author Juliana
 * 7.5.2024
 */

import java.util.Scanner;
public class EleicaoPresidencial {

    public static void main(String[] args) {
    	Scanner ler = new Scanner(System.in);
    	
    	int totalVotos = 0;
    	int votosCandidato1 = 0;
    	int votosCandidato2 = 0;
    	int votosCandidato3 = 0;
    	int votosCandidato4 = 0;
    	int votosNulos = 0;
    	int votosBrancos = 0;
    	
    	System.out.println("Digite os votos (1, 2, 3 e 4 para votarnos candidatos, 5 para voto nulo, 6 para voto em branco) - Digite 0 para encerrar:");
    	
    	int voto = ler.nextInt();
    	while (voto != 0){
    		switch(voto){
    			case 1:
    				votosCandidato1++;
    				totalVotos++;
    				break;	
    			case 2:
    				votosCandidato2++;
    				totalVotos++;
    				break;
    			case 3:
    				votosCandidato3++;
    				totalVotos++;
    				break;
    			case 4:
    				votosCandidato4++;
    				totalVotos++;
    				break;
    			case 5:
    				votosNulos++;
    				totalVotos++;
    				break;
    			case 6: 
    				votosBrancos++;
    				totalVotos++;
    				break;
    			default:
    				System.out.println("Voto invalido!");
    				
    		}
    		voto = ler.nextInt();
    	}    	   	
    	
    	System.out.printf("Resultado da Eleicao:\n");
    	System.out.printf("Candidato 1: %d votos - %.2f%%\n", votosCandidato1, calcularPercentual(votosCandidato1, totalVotos));
    	System.out.printf("Candidato 2: %d votos - %.2f%%\n", votosCandidato2, calcularPercentual(votosCandidato2, totalVotos));
    	System.out.printf("Candidato 3: %d votos - %.2f%%\n", votosCandidato3, calcularPercentual(votosCandidato3, totalVotos));
    	System.out.printf("Candidato 4: %d votos - %.2f%%\n", votosCandidato4, calcularPercentual(votosCandidato4, totalVotos));
    	System.out.printf("Votos Nulos: %d votos - %.2f%%\n", votosNulos, calcularPercentual (votosNulos, totalVotos));
    	System.out.printf("Votos Brancos: %d votos - %.2f%%\n",votosBrancos, calcularPercentual(votosBrancos, totalVotos));
     
    }
    public static double calcularPercentual( int votos, int totalVotos){
    	return (double) votos / totalVotos * 100;
    }
  
}