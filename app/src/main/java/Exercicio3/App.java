/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Exercicio3;

import java.util.Scanner;

public class App {

    //Fa�a um algoritimo que receba o pre�o de custo e o pre�o de venda de 40 produtos.
    //Mostre como resultado se houve lucro, prejuizo ou empate para cada produto.
    //Informe o valor de custo de cada produto, o valor de venda de cada produto,
    //a m�dia de pre�o de custo e do pre�o de venda. (totalCusto / i) || (totalVenda / i)
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nomeProduto;

        float precoCusto;
        float precoVenda;
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;

        //precisei por o i para fora porque:
        //o i dentro do () do for pega somente o escopo de dentro dele
        //eu colocando ela fora, ele pega o escopo do main inteiro !!
        //com isso consigo fazer a conta nos dois ultimos print 
        int i = 0;
        for (; i < 3; i++) {
            System.out.println("Digite o nome do produto: ");
            nomeProduto = leitor.next();

            System.out.println("Digite o preco do produto: ");
            precoCusto = leitor.nextFloat();

            System.out.println("Digite o preco da venda: ");
            precoVenda = leitor.nextFloat();

            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;

            if (precoCusto == precoVenda) {
                System.out.println("Empate");
            } else if (precoCusto > precoVenda) {
                System.out.println("Prejuizo");
            } else {
                System.out.println("Lucro");
            }

            System.out.println(nomeProduto + ", preco de custo = "
                    + precoCusto + ", preco de venda = " + precoVenda);

        }

        System.out.println("A media do pre�o de custo � de: "
                + (totalCusto / i));
        System.out.println("A media do pre�o de venda � de: "
                + (totalVenda / i));
    }
}
