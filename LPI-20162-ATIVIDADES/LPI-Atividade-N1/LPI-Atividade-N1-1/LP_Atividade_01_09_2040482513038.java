//Autor: Vinicius Carvalho Sanchez
//Disciplina: Linguagem de Programação I 
// Curso: ADS Professor: Veríssimo 
// Semestre: 2026.2
import java.util.Scanner;

public class LP_Atividade_01_09_2040482513038 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(
                "Informe a nota final do aluno: ");

        double notaFinal =
                scanner.nextDouble();

        String situacaoIfElse;

        if (notaFinal >= 6) {
            situacaoIfElse = "Aprovado";
        } else {
            situacaoIfElse = "Reprovado";
        }

        System.out.println(
                "--- Abordagem 1: Estrutura Condicional Tradicional (if-else) ---");

        System.out.println(
                "Situação (if-else): "
                + situacaoIfElse);

        String situacaoTernario =
                notaFinal >= 6
                        ? "Aprovado"
                        : "Reprovado";

        System.out.println(
                "--- Abordagem 2: Operador Ternário Simples ---");

        System.out.println(
                "Situação (Ternário): "
                + situacaoTernario);

        /*
         * Exemplo de ternário encadeado:
         *
         * String situacao = notaFinal >= 6
         *         ? "Aprovado"
         *         : notaFinal >= 4
         *             ? "Exame"
         *             : "Reprovado";
         *
         * Deve ser evitado quando dificulta a leitura do código.
         * Nesse caso, if/else fica mais fácil de entender.
         */

        scanner.close();
    }
}