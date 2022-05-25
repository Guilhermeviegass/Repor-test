package Conquista02;

public class Exercicio04 {
    public static void main(String[] args) {
/*Criar um código que verifica 3 vezes (IF) se o valor de uma variável é igual a um valor qualquer,
 sendo atendida na segunda condição, não executando a terceira e nem um ELSE
*/
        int valor = 50;

        if (valor < 10) {
            System.out.println("Correto");
        } else if (valor == 50) {
            System.out.println("Acertou,miseravel");
        } else if (valor < 40) {
            System.out.println("Não,não");
        } else if (valor >= 100) {
            System.out.println("Errado");
        }
    }
}
