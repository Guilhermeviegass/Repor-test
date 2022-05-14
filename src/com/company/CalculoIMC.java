package com.company;

import java.util.Scanner;

public class CalculoIMC {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double alturaEmMetros;
        double pesoKg;
        double imc;

        System.out.println("Olá, seja bem vindo, bora calcular esse IMC?!");

        System.out.println("");

        System.out.println("Você sabe o que é o IMC? IMC é o índice de massa corporal é uma medida internacional usada para calcular se uma pessoa está no peso ideal.");

        System.out.println("");

        System.out.println("Por favor senhor(a), inserira sua altura.");
        alturaEmMetros = scan.nextDouble();

        System.out.println("Por favor, agora inserira peso.");
        pesoKg = scan.nextDouble();

        imc = pesoKg / (alturaEmMetros * alturaEmMetros);

        System.out.println(imc);

        System.out.println("");

        if(imc < 16) {
            System.out.printf("IMC: %2f\tMagreza Grave - A magreza grave (IMC abaixo de 16) é uma condição que pode ser causada por desnutrição severa. Assim, consulte um médico, pois esse peso é uma ameaça à saúde.\n", imc);

            System.out.printf("IMC: %2f\tMagreza Grave - Dê prerência por alimentos in natura. ➢ Acrescente creme de leite ou mel junto às frutas ou salada de frutas. ➢ Aumente e varie o consumo de frutas e verduras durante o dia, no mínimo 3 porções. ➢ Faça pelo menos 3 refeições (café da manhã, almoço e jantar) e 2 lanches.\n", imc);

        }
         if(imc >= 16 && imc < 17 )
            System.out.printf("IMC: %2f\fMagreza Moderada - Condições hormonais, como o hipertireoidismo, podem afetar o peso de uma pessoa, além de parasitas ou simplesmente uma dieta com poucas calorias diárias. Nesse sentido, você pode consultar um médico para ter certeza de que não tem nada de errado.");

        else if (imc >= 17 && imc <18.5)
            System.out.printf("IMC: %2f\tMagreza Leve - Pode ter algumas consequências, mas no geral não é preocupante. Logo, um IMC acima de 17 não fica muito longe do saudável. ");

        else if(imc >= 18.5 && imc < 25)
            System.out.printf("IMC: %2f\tPeso normal - Mantenha o peso.\n", imc);

        else if(imc >= 25 && imc < 30)
            System.out.printf("IMC: %2f\tSobrepeso - ➢ Faça pelo menos 3 refeições (café da manhã, almoço e jantar) e 2 lanches. Para lanches e sobremesas prefira frutas. ➢ Coma em horários regulares, mastigando devagar e com atenção.\n", imc);

        else if(imc >= 30 && imc < 35)
            System.out.printf("IMC: %2f\tObesidade grau 1 - O tratamento da obesidade grau I deve ser baseada no tripé: dieta, exercício físico e medicação em longo prazo por se tratar de uma doença crônica.\n", imc);

        else if(imc >= 35 && imc < 40)
            System.out.printf("IMC: %2f\tObesidade grau 2 - Consuma carnes magras, de boi, frango sem pele ou peixe, preferindo preparações grelhadas, assadas ou cozidas, acrescentando pouco óleo, apenas no final do preparo.\n", imc);

        else if (imc >= 40 && imc > 40)
            System.out.printf("IMC: %2f\tObesidade grau 3 - Para emagrecer e combater a obesidade mórbida é fundamental fazer acompanhamento com um nutricionista para realizar reeducação alimentar.\n", imc);


        System.out.println("Volte sempre");




    }

}


/**
 * Melhorias
 *
 * 1. Adicionar um título ao programa
 * 2. Dizer um pouco o que o sistema faz
 * 3. Melhorar textos
 * 4. Melhorar retorno do IMC
 */

/**
 * Extra
 *
 * 1. Adicionar ao programa o quadro da interpretação do IMC
 * 2. Dizer em qual classificação o usuário se encontra
 */


