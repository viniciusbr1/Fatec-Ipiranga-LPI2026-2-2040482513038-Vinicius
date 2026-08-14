//Autor: Vinicius Carvalho Sanchez
//Disciplina: Linguagem de Programação I 
// Curso: ADS Professor: Veríssimo 
// Semestre: 2026.2

import java.util.Locale;
import java.util.Scanner;

public class LP_Atividade_01_01_2040482513038 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Coloquei o local porque estava dando problema com o "." na nota
        scanner.useLocale(Locale.US);

        // byte: 8 bits Intervalo: -128 a 127
        System.out.print("Idade do Aluno: ");
        byte idade = scanner.nextByte();

        //  short 16 bits Intervalo: -32.768 a 32.767
        System.out.print("Número de Faltas: ");
        short faltas = scanner.nextShort();

        //int: 32 bits Intervalo: -2.147.483.648 a 2.147.483.647
        System.out.print("Matrícula ID: ");
        int matriculaId = scanner.nextInt();

        //long: 64 bits Intervalo: -9.223.372.036.854.775.808
        // a 9.223.372.036.854.775.807.
        System.out.print("Código Nacional do Estudante: ");
        long codigoNacional = scanner.nextLong();

        // float: 32 bits Intervalo aproximado:
        // -3.4028235E38 a 3.4028235E38.
        System.out.print("Nota do Trabalho: ");
        float notaTrabalho = scanner.nextFloat();

        //double: 64 bits Intervalo aproximado:
        //-1.7976931348623157E308 a 1.7976931348623157E308
        System.out.print("Nota da Prova Final: ");
        double notaProvaFinal = scanner.nextDouble();

        // char: 16 bits Intervalo: 0 a 65.535 (Unicode)
        System.out.print("Conceito Final do Aluno: ");
        char conceitoFinal = scanner.next().charAt(0);

        //boolean: true ou false  Java naõ define tamanho fixo em bits
        System.out.print("Aluno está Aprovado (true/false): ");
        boolean aprovado = scanner.nextBoolean();

        System.out.println("--- Dados do Aluno Fictício ---");
        System.out.println("Idade do Aluno: " + idade);
        System.out.println("Número de Faltas: " + faltas);
        System.out.println("Matrícula ID: " + matriculaId);
        System.out.println("Código Nacional do Estudante: " + codigoNacional);
        System.out.println("Nota do Trabalho: " + notaTrabalho);
        System.out.println("Nota da Prova Final: " + notaProvaFinal);
        System.out.println("Conceito Final do Aluno: " + conceitoFinal);
        System.out.println("Aluno está Aprovado? " + aprovado);

        scanner.close();
    }
}
