package tabuadacomfor;

/*
6)  Faça um programa em Java que receba como entrada um número do usuário e imprima o cálculo
da sua tabuada começando no número 0 até o 10. Utilize for ou while. 

**Desafio, tente fazer o mesmo algoritmo que não precise receber a entrada do usuário e imprima a tabuada do 1 até o 10. 
*/


import java.util.Scanner;

public class TabuadaComFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tabuada;

        System.out.print("Digite qual tabuada voce quer? ");

        tabuada = sc.nextInt();

        System.out.println();

        for (int x = 0; x <= 10; x++) {

            System.out.printf("%d x %d = %d\n", x, tabuada, x * tabuada);

        }

    }

}