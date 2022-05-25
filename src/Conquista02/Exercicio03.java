package Conquista02;

public class Exercicio03 {
    public static void main(String[] args) {
/*Criar um código que verifica 3 vezes (IF) se o valor de uma variável é igual a um valor qualquer
, não atendendo em nenhum momentos as 3 condições e finalizando o fluxo no ELSE
 */

        int valor = 800;

        if (valor > 1000) {
            System.out.println("Errado");
        }
        if (valor < 100){
            System.out.println("Muito burro filho");
        }
        if (valor == 500){
            System.out.println("Que burro dá zero pra ele");
        }
        else System.out.println("Ta tudo errado ,começa de novo!!");

    }
}
