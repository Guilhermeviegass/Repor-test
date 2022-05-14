package Conquista01;

public class Exercicio07 {
    public static void main(String[] args) {

        //Criar um código que verifica expressões booleanas (verdadeiro ou falso) utilizando operadores de comparação e operadores lógicos.
        //Ex: boolean ativo = true; ativo == true && ativo != false

        int salario = 15000;
        int carro = 5000;
        double ValorTotalContaCorrente = 3000;
        double ValorInvestimentoBanco = 20000;
        float ValorPcGamerCompravel= 10500F;

        boolean isSalarioMaiorQueCarro = salario > 10000 && carro >= 5000;
        boolean isSalarioMenorQueCarro = salario < 15000 && carro <= 10000;
        boolean isPcGamerCompravel = ValorTotalContaCorrente > ValorPcGamerCompravel || ValorInvestimentoBanco > ValorPcGamerCompravel;


        System.out.println("isSalarioMaiorQueCarro "+isSalarioMaiorQueCarro);
        System.out.println("isSalarioMenorQueCarro "+isSalarioMenorQueCarro);
        System.out.println("isPcGamerCompravel "+isPcGamerCompravel);


    }
}
