//Autor: Vinicius Carvalho Sanchez
//Disciplina: Linguagem de Programação I 
// Curso: ADS Professor: Veríssimo 
// Semestre: 2026.2

import java.util.Scanner;

public class LP_Atividade_01_06_2040482513038 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome de usuário: ");

        String texto = null;

        if (scanner.hasNextLine()) {
            texto = scanner.nextLine();
        }

        /*
         * Com &&, se texto for null, texto.length() não é executado.
         * Com & simples, as duas condições seriam avaliadas e
         * texto.length() poderia causar NullPointerException.
         */
        if (texto != null && texto.length() > 0) {

            System.out.println(
                    "Usuário válido fornecido: " + texto
            );

        } else {

            System.out.println(
                    "Entrada rejeitada: O texto está nulo ou vazio."
            );
        }

        scanner.close();
    }
}