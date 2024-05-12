/*
 * @(#)AnaliseAlturaSexo.java
 *
 *
 * @author Juliana
 * 8.5.2024
 */

import java.util.Scanner;
import java.util.ArrayList;
public class AnaliseAlturaSexo {
    public static void main(String[] args) {
        
    Scanner ler = new Scanner(System.in);
    	
    	int totalF = 0;
        int totalM = 0;  
        double somaAlturaF = 0;
        
        ArrayList<Double> alturas = new ArrayList<>();
            
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o sexo da pessoa "  + (i + 1) + " (M/F):");
            char sexo = ler.next().charAt(0);

            if(sexo == 'F' || sexo == 'f') {
               totalF++; 
               System.out.println("Digite a altura da pessoa:");
               double altura = Double.parseDouble(ler.next().replace(",","."));         
               alturas.add(altura);
               somaAlturaF += altura;
               
            } else if(sexo == 'M' || sexo == 'm'){          	
            	totalM++;
            	System.out.println("Digite a altura da pessoa:\n");
            	double altura = Double.parseDouble(ler.next().replace(",","."));
            	alturas.add(altura);
            	
            } else{
            	System.out.println("Opção inválida!");
            	i--;
            }                       
        }
        
		double maiorAltura = alturas.get(0);
		double menorAltura = alturas.get(0);
				
		for (double altura : alturas){
			
		  if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
            }
        }
        
		double mediaAlturaF =  somaAlturaF / totalF;
        double porcentual = ((double)(totalM - totalF) / totalF) * 100;

        System.out.println("Maior altura do grupo: " + maiorAltura);
        System.out.println("Menor altura do grupo: " + menorAltura);
        System.out.println("Média de altura das mulheres: " + mediaAlturaF);
        System.out.printf("Número de homens %d e a diferenca porcentual entre homens e mulheres: %.2f%%\n",totalM, porcentual);
    }
}