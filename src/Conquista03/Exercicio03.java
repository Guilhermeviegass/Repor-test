package Conquista03;

/*Criar um código que declara uma variável numérica de valor 0, e utilizando o DO WHILE, alterar o valor dessa variável para um valor maior que 10.
Essa variável deve ser utilizada na condição do DO WHILE e o código NÃO DEVE REPETIR a execução do DO WHILE.*/

public class Exercicio03 {
    public static void main(String[] args) {

        int count = 0;
        int soma = 12;

        do {
            System.out.println(count+soma);
        } while (count > 10);
        System.out.println("certo");
    }
}
