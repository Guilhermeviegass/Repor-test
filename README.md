# Fundamentos

## Escopo de variável

    / Escopo de uma variável é a sua ´visibilidade´ dentro do seu programa.
##Estrutura de classe

    / Em uma classe java são colocados os métodos(methods) ,funções ou procedimentos.
    /Todo o código deve estar em alguma classe, pois quando executamos algum aplicativo java nós estamos, na verdade, executando uma classe.
    /Diferentemente de um arquivo fonte que só pode conter uma classe, uma classe pode conter vários métodos.
    /Em java a classe deve estar em um Arquivo Fonte(Source File) e deve ir com um par de chaves “{}”, são nessas chaves que serão colocados os métodos. 
    /Lembrando que uma classe sempre inicia com letra maiúscula.

## Método main

    / Quando o java virtual machine(JVM) inicia, ele procura na sua classe principal por um método muito específico, chamado de método main.
    / Uma aplicação java obrigatóriamente deverá possuir pelo menos uma classe e um método main, pois é por esse método main que o JVM começará a executar
    / Por regra , todo método main deverá ser : Público, estático , sem retorno(void), com nome de “main”, e deverá receber como argumento um array do tipo String.

### Operadores aritméticos

    /* + (Mais): É o simbolo usado para somar nas operações
       - (menos): É o simbolo usado para Subtrair nas operações
       * (Vezes): É o simbolo usado para Multiplicar nas operações
    /* / (Divisão):É o simbolo usado para Dividir nas operações

### Operadores de Comparação

    /* > (maior): É o simbolo de comparação Que diz ser maior que o número anterior assim Retorna verdadeiro 
       >= (maior ou igual): É o simbolo de comparação Que diz ser maior ou igual ao número anterior assim Retorna verdadeiro 
       < (menor): É o simbolo de comparação Que diz ser menor que o número anterior assim Retorna verdadeiro 
       <= (menor ou igual): É o simbolo de comparação Que diz ser menor ou igual ao número anterior assim Retorna verdadeiro 
       == (igual a): É o simbolo de comparação que diz ser igual ao outro valor assim Retorna verdadeiro 
    /* != (diferente de): É o simbolo de comparação ser diferente dos demais, Retorna verdadeiro caso sejas diferente do anterior.

### Operadores Lógicos

    /  &&  Utilizado quando queremos duas expressões sejam verdadeiras.
    /  ||  Utilizado quando pelo menos um das expressões seja verdadeira.  

### Operadores de incremento/decremento 

    /Há 2 operadores, o de incremento e o de decremento. 
    /O de incremento é representado por dois sinais de ++, enquanto o de decremento, por dois sinais de menos --.
    /++ e --

### If.

    /A declaração if do java é usada para testar uma condição. 
    /Verifica condições booleanas: true ou false. Vários tipos de declarações se em Existem Java.

### If Else

    /Uma declaração if-else em java também testa uma condição. 
    /Executa se a condição do bloco se for verdadeiro caso contrário o bloco else é executado.

### Else If

    /else-if executa uma configuração para declaração de configuração.
    /Ele executa somente se a condição descrita e verdadeira

### Switch
 
    /O switch case é uma estrutura de decisão usada quando precisamos testar condições para determinar qual função será executada em seguida. 
    /Assim, essa expressão nos permite substituir múltiplos “if else if”, tornando o código criado mais simples, legível e fácil de manter. 

### While (Enquanto)

    /O termo while pode ser traduzido para o português como “enquanto”. 
    /Este termo é utilizado para construir uma estrutura de repetição que executa, repetidamente, uma única instrução ou um bloco delas, uma expressão booleana for verdadeira.
    

#### Do While

    /A estrutura de repetição do-while é uma variação da estrutura while.
    / Existe uma diferença sutil, porém importante, entre elas.
    / No while as condições são testadas primeiro que as instrucões,no do while e o contrario executas primeiro as instruções de verifica as condições


#### For

    /O for é uma estrutura de repetição compacta. 
    /Seus elementos de inicialização, condição e iteração são reunidos na forma de um cabeçalho e o corpo é disposto em seguida.

