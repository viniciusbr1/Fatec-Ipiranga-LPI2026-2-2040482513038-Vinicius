

// O while necessario porque não se sabe  quantas vendas serão registradas
// O laço pode não executar nenhuma vez porque  o primeiro valor informado pode ser zero

import java.util.Scanner;

public class LP_Atividade_N2_02_2040482513038 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(java.util.Locale.US);

        double totalVendido = 0;
        int quantidadeVendas = 0;

        System.out.print("Valor da venda (ou 0 para encerrar): ");
        double valorVenda = scanner.nextDouble();

        while (valorVenda != 0) {

            totalVendido += valorVenda;
            quantidadeVendas++;

            System.out.print("Valor da venda (ou 0 para encerrar): ");
            valorVenda = scanner.nextDouble();
        }

        if (quantidadeVendas > 0) {

            double media = totalVendido / quantidadeVendas;

            System.out.printf("Total vendido no turno: R$ %.2f%n", totalVendido);
            System.out.println("Quantidade de vendas: " + quantidadeVendas);
            System.out.printf("Valor médio por venda: R$ %.2f%n", media);

        } else {

            System.out.println("Nenhuma venda registrada nesta sessão de caixa.");
        }

        scanner.close();
    }
} 

