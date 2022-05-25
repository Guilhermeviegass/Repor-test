package Conquista02;

public class Exercicio06{
    public static void main(String[] args) {
/*Criar um código com uma estrutura SWITCH que verifica se o valor de uma variável é igual ao case (a, b, c e default).
 O código deve executar apenas o default com a mensagem: “O valor não é compatível”.
 */


        String car = "Pc Gamer";

        switch (car) {

            case "A":
                System.out.println("Xbox");
                break;

            case "B":
                System.out.println("PS5");
                break;

            case "C":
                System.out.println("Pc");
                break;

            default:
                System.out.println("O valor não é compatível");
        }

    }
}
