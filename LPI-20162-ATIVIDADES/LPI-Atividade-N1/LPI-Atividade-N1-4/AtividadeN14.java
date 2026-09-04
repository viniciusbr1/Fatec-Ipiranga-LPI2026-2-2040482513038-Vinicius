/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*
* Disciplina : Linguagem de Programacao I *
* Prof . Verissimo *
* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*
* Objetivo do Programa : Simular o Xeque Pastor utilizando uma matriz *
* bidimensional para representar o tabuleiro de xadrez. *
* Data - 03/09/2026 *
* Autor : Vinicius Carvalho Sanchez - RA: 2040482513038 *
* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/

public class AtividadeN14 {

    // Constante que defin o tamanho do tabuleiro
    private static final int TAMANHO_TABULEIRO = 8;

    public static void main(String[] args) {

        // Matriz bidmensional que representa o tabuleiro de xadrez
        String[][] tabuleiro = new String[TAMANHO_TABULEIRO][TAMANHO_TABULEIRO];

        inicializarTabuleiro(tabuleiro);

        System.out.println("Posicao Inicial do tabuleiro");
        exibirTabuleiro(tabuleiro);

        jogada1(tabuleiro);
        jogada2(tabuleiro);
        jogada3(tabuleiro);
        jogada4(tabuleiro);
    }

    // Inicializa as peças na posição inicial do tabuleiro
    private static void inicializarTabuleiro(String[][] tabuleiro) {

        tabuleiro[0][0] = "TP1";
        tabuleiro[0][1] = "CP2";
        tabuleiro[0][2] = "BP3";
        tabuleiro[0][3] = "DP4";
        tabuleiro[0][4] = "RP5";
        tabuleiro[0][5] = "BP6";
        tabuleiro[0][6] = "CP7";
        tabuleiro[0][7] = "TP8";

        for (int coluna = 0; coluna < TAMANHO_TABULEIRO; coluna++) {
            tabuleiro[1][coluna] = "PP" + (coluna + 1);
        }

        for (int linha = 2; linha <= 5; linha++) {
            for (int coluna = 0; coluna < TAMANHO_TABULEIRO; coluna++) {
                tabuleiro[linha][coluna] = "   ";
            }
        }

        for (int coluna = 0; coluna < TAMANHO_TABULEIRO; coluna++) {
            tabuleiro[6][coluna] = "PB" + (coluna + 1);
        }

        tabuleiro[7][0] = "TB1";
        tabuleiro[7][1] = "CB2";
        tabuleiro[7][2] = "BB3";
        tabuleiro[7][3] = "DB4";
        tabuleiro[7][4] = "RB5";
        tabuleiro[7][5] = "BB6";
        tabuleiro[7][6] = "CB7";
        tabuleiro[7][7] = "TB8";
    }

    // Percore a matriz para exibir o tabuleiro no console
    private static void exibirTabuleiro(String[][] tabuleiro) {

        System.out.println("   -a- -b- -c- -d- -e- -f- -g- -h-");

        for (int linha = 0; linha < TAMANHO_TABULEIRO; linha++) {

            System.out.print((8 - linha) + "  ");

            for (int coluna = 0; coluna < TAMANHO_TABULEIRO; coluna++) {
                System.out.print(tabuleiro[linha][coluna] + " ");
            }

            System.out.println();
        }

        System.out.println();
    }

    // nove a peça da posição de origem para a posição de destino
    private static void movimentarPeca(
            String[][] tabuleiro,
            int linhaOrigem,
            int colunaOrigem,
            int linhaDestino,
            int colunaDestino) {

        String peca = tabuleiro[linhaOrigem][colunaOrigem];

        tabuleiro[linhaDestino][colunaDestino] = peca;

        // A posição de origem e marcada com "..."
        tabuleiro[linhaOrigem][colunaOrigem] = "...";

        System.out.println("Posicao origem: ...    Posicao final: "
                + tabuleiro[linhaDestino][colunaDestino]);

        exibirTabuleiro(tabuleiro);
    }

    // Executa a Jogada 1
    private static void jogada1(String[][] tabuleiro) {

        System.out.println("Jogada #1");

        System.out.println("Brancas jogam Peao d Rei: e2-e4");
        movimentarPeca(tabuleiro, 6, 4, 4, 4);

        System.out.println("Pretas jogam Peao do Rei: e7-e5");
        movimentarPeca(tabuleiro, 1, 4, 3, 4);
    }

    // Executa a Jogada 2
    private static void jogada2(String[][] tabuleiro) {

        System.out.println("Jogada #2");

        System.out.println("Brancas jogam Bispo do Rei: Bc4");
        movimentarPeca(tabuleiro, 7, 5, 4, 2);

        System.out.println("Pretas jogam Cavalo da Dama: Cc6");
        movimentarPeca(tabuleiro, 0, 1, 2, 2);
    }

    // Executa a Jogada 3
    private static void jogada3(String[][] tabuleiro) {

        System.out.println("Jogda #3");

        System.out.println("Brancas jogam Dama: Dh5");
        movimentarPeca(tabuleiro, 7, 3, 3, 7);

        System.out.println("Pretas jogam Cavalo do Rei: Cf6");
        movimentarPeca(tabuleiro, 0, 6, 2, 5);
    }

    // Executa a Jogada 4 e finaliza com Xeque Maate
    private static void jogada4(String[][] tabuleiro) {

        System.out.println("Jogada #4 - Lance Final: Xeque Mate");

        System.out.println("Brancas capturan o Peao do Rei: Dxf7#");
        movimentarPeca(tabuleiro, 3, 7, 1, 5);

        System.out.println("Xeque Mate");
    }
}

