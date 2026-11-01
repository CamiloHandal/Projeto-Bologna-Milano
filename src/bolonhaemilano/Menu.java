package bolonhaemilano;

import java.util.Scanner;

public class Menu {

    private Scanner scanner = new Scanner(System.in);
    private boolean emExecucao = true;

    private Jogador jogador;
    private Cidade cidade;

    public void executar() {
        while (emExecucao) {
            exibirOpcoes();
            int opcao = lerOpcao();
            processarOpcao(opcao);
        }

        scanner.close();
    }

    private void exibirOpcoes() {
        System.out.println();
        System.out.println("==========================================");
        System.out.println("            BOLONHA E MILANO");
        System.out.println(" Um jogo de estratégia econômica medieval");
        System.out.println("==========================================");
        System.out.println("1 - Novo jogo");
        System.out.println("2 - Ver status da cidade");
        System.out.println("3 - Sobre o jogo");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private int lerOpcao() {
        String entrada = scanner.nextLine();

        try {
            return Integer.parseInt(entrada.trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private void processarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                iniciarNovoJogo();
                break;

            case 2:
                if (cidade == null) {
                    System.out.println(
                        "Nenhum jogo iniciado. Escolha 1 para começar."
                    );
                } else {
                    cidade.exibirStatus();
                }
                break;

            case 3:
                exibirSobre();
                break;

            case 0:
                emExecucao = false;
                System.out.println("Encerrando o jogo. Até a próxima!");
                break;

            default:
                System.out.println(
                    "Opção inválida! Digite 1, 2, 3 ou 0."
                );
                break;
        }
    }

    private void iniciarNovoJogo() {
        System.out.println();
        System.out.println("========== NOVO JOGO ==========");

        System.out.print("Digite o nome do jogador: ");
        String nomeJogador = scanner.nextLine().trim();

        System.out.print("Digite o nome da cidade: ");
        String nomeCidade = scanner.nextLine().trim();

        jogador = new Jogador(nomeJogador);
        cidade = new Cidade(nomeCidade, jogador);

        System.out.println("Novo jogo iniciado!");
        cidade.exibirStatus();
    }

    private void exibirSobre() {
        System.out.println();
        System.out.println("========== SOBRE O JOGO ==========");
        System.out.println(
            "Bolonha e Milano é um jogo de estratégia econômica medieval."
        );
        System.out.println(
            "O projeto será desenvolvido em oito etapas incrementais."
        );
        System.out.println(
            "Nas próximas etapas, serão implementados recursos como"
        );
        System.out.println(
            "economia, agricultura, impostos, construções e soldados."
        );
        System.out.println(
            "Projeto escolar desenvolvido em Java."
        );
        System.out.println("==================================");
    }
}