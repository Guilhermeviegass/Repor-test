package Conquista03;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        /*Criar um código que pede para o usuário inserir um valor numérico de 1 a 10,
         e caso o valor digitado seja diferente desse intervalo, ele deve exibir uma mensagem pedindo para inserir o valor correto.
        O PROGRAMA NÃO PODE ENCERRAR ATÉ O USUÁRIO COLOCAR O VALOR CORRETO
         */
        Scanner scan = new Scanner(System.in);

        int resultado = 0;

        System.out.println("Olá ");


        System.out.println("Por favor insira um numero 1 a 10");
        resultado = scan.nextInt();

        while (resultado <= 10){
            System.out.println("correto");
        resultado= scan.nextInt();}

        while (resultado > 10) {
            System.out.println("Incorreto,por favor insira o valor correto");
            resultado = scan.nextInt();
        }
    }
}
