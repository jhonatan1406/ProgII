import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        char[][] tabuleiro = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        Scanner scanner = new Scanner(System.in);
        char jogadorAtual = 'X';

        while (true) {
            System.out.println("Jogador atual: " + jogadorAtual);
            System.out.println("  0 1 2");
            for (int i = 0; i < 3; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(tabuleiro[i][j] + " ");
                }
                System.out.println();
            }

            System.out.print("Linha: ");
            int linha = scanner.nextInt();
            System.out.print("Coluna: ");
            int coluna = scanner.nextInt();

            if (tabuleiro[linha][coluna] != ' ') {
                System.out.println("Posição já preenchida! Escolha outra.");
                continue;
            }

            tabuleiro[linha][coluna] = jogadorAtual;

            if (jogadorGanhou(tabuleiro, jogadorAtual)) {
                System.out.println("Jogador " + jogadorAtual + " ganhou!");
                break;
            }

            if (deuVelha(tabuleiro)) {
                System.out.println("Deu velha!");
                break;
            }

            jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
        }
    }

    public static boolean jogadorGanhou(char[][] tabuleiro, char jogador) {
        // verifica linhas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) {
                return true;
            }
        }

        // verifica colunas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador) {
                return true;
            }
        }

        // verifica diagonais
        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) {
            return true;
        }
        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) {
            return true;
        }

        return false;
    }

    public static boolean deuVelha(char[][] tabuleiro) {
        for (int i =

