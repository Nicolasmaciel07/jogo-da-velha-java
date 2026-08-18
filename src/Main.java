import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] tabuleiro = {
                {' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

        char jogador1 = 'X';
        char jogador2 = 'O';
        int turno = 1;
        boolean jogoRodando = true;
        int jogadasTotais = 0;
        while (jogoRodando) {
            char jogadorAtual;

            if (turno == 1) {
                jogadorAtual = jogador1;
            } else {
                jogadorAtual = jogador2;
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(" " + tabuleiro[i][j] + " ");
                    if (j < 2) System.out.print("|");
                }
                System.out.println();
                if (i < 2) System.out.println("-----------");
            }

            System.out.println("É a vez do Jogador " + turno + " (" + jogadorAtual + ")");
            System.out.println("Informe a linha (1, 2 ou 3):");
            int linha = scanner.nextInt() - 1;

            System.out.println("Informe a coluna (1, 2 ou 3):");
            int coluna = scanner.nextInt() - 1;

            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != ' ') {
                System.out.println("Posição inválida.");
                continue;
            }

            tabuleiro[linha][coluna] = jogadorAtual;
            jogadasTotais++;
            boolean venceu = false;

            for (int i = 0; i < 3; i++) {
                if (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) venceu = true;
                if (tabuleiro[0][i] == jogadorAtual && tabuleiro[1][i] == jogadorAtual && tabuleiro[2][i] == jogadorAtual) venceu = true;
            }

            if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) venceu = true;
            if (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual) venceu = true;

            if (venceu) {
                System.out.println("Fim de jogo! O Jogador " + turno + " (" + jogadorAtual + ") venceu!");
                jogoRodando = false;
                break;
            }

            if (jogadasTotais == 9) {
                System.out.println("Fim de jogo! Ocorreu um empate");
                jogoRodando = false;
                break;
            }

            if (turno == 1) {
                turno = 2;
            } else {
                turno = 1;
            }
        }

        scanner.close();
    }
}