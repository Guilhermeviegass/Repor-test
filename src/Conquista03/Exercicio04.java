package Conquista03;

/*Criar um código que declara uma variável do tipo String com um nome qualquer que você quiser e dentro do for, contado até 10,
o valor da variável deve ser concatenado a ela mesma sempre que encontrar um valor par na variável do índex.
Exemplo:
	1. Iteração: nome
	2. Iteração: nome, nome
	3. Iteração: nome, nome, nome
*/
public class Exercicio04 {
    public static void main(String[] args) {
        String nome = "Carlos";
        String name = "Carlos Carlos";
        for (int resultado = 0; resultado < 10; resultado++) {
            System.out.println(nome+ " Carlos " + name);

        }
    }
}
