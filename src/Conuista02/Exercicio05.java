package Conuista02;

public class Exercicio05 {
    public static void main(String[] args) {

        /*Criar um código com uma estrutura SWITCH que verifica se o valor de uma variável é igual ao case.
         (1, 2, 3). Os cases devem escrever quando o valor for igual ao seu próprio. Mostrando apenas a frase do case referente ao valor.
         */

        String processador = "AMD Ryzen";

        switch (processador) {

            case "Intel Xeon Platinum":
                System.out.println("Intel Xeon Platinum");
                break;

            case "AMD Ryzen":
                System.out.println("AMD Ryzen");
                break;

            case "Intel Celeron":
                System.out.println("Intel Celeron");
                break;

            default:
                System.out.println("O valor não é compatível");


        }
    }
}