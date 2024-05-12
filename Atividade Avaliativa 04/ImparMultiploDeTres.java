/*
 * @(#)ImparMultiploDeTres.java
 *
 *
 * @author Juliana
 * 12.5.2024
 */


 public class ImparMultiploDeTres {
    public static void main(String[] args){

        int soma = 0;

        for (int i = 1; i <= 500; i++){

            if ( i % 2 != 0 && i % 3 == 0 ){
                soma += i;
            }

        }

        System.out.print("A soma dos números impar multiplo de 3 de 1 a 500 é : " + soma);
    }

 }