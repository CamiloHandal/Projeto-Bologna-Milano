package bolonhaemilano;

import java.util.Scanner;

public class Menu {

    private Scanner scanner = new Scanner(System.in);
    private boolean emExecucao = true;

    private Jogador jogador;
    private Cidade cidade;
    private Mercado mercado = new Mercado();

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
        System.out.println("3 - Mercado");
        System.out.println("4 - Sobre o jogo");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private int lerOpcao() {
        try {
            return Integer.parseInt(scanner.nextLine().trim());
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
                exibirStatus();
                break;

            case 3:
                abrirMercado();
                break;

            case 4:
                exibirSobre();
                break;

            case 0:
                emExecucao = false;
                System.out.println("Encerrando o jogo. Até a próxima!");
                break;

            default:
                System.out.println(
                    "Opção inválida! Digite 1, 2, 3, 4 ou 0."
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

    private void exibirStatus() {
        if (cidade == null) {
            System.out.println(
                "Nenhum jogo iniciado. Escolha 1 para começar."
            );
            return;
        }

        cidade.exibirStatus();
    }

    private void abrirMercado() {
        if (cidade == null) {
            System.out.println(
                "Inicie um jogo antes de acessar o mercado."
            );
            return;
        }

        boolean noMercado = true;

        while (noMercado) {
            System.out.println();
            System.out.println("============== MERCADO ==============");
            System.out.println("Florins disponíveis: " + cidade.getFlorins());
            System.out.println("Grãos disponíveis: " + cidade.getGraos());
            System.out.println(
                "Terras disponíveis: " + cidade.getTerras() + " hectares"
            );
            System.out.println("-------------------------------------");
            System.out.println(
                "Preço do grão: " + mercado.getPrecoGrao()
                + " florins por unidade"
            );
            System.out.println(
                "Preço da terra: " + mercado.getPrecoTerra()
                + " florins por hectare"
            );
            System.out.println("-------------------------------------");
            System.out.println("1 - Comprar grãos");
            System.out.println("2 - Vender grãos");
            System.out.println("3 - Comprar terras");
            System.out.println("4 - Vender terras");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            int opcao = lerOpcao();

            switch (opcao) {
                case 1:
                    comprarGraos();
                    break;

                case 2:
                    venderGraos();
                    break;

                case 3:
                    comprarTerras();
                    break;

                case 4:
                    venderTerras();
                    break;

                case 0:
                    noMercado = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    private int lerQuantidade() {
        System.out.print("Digite uma quantidade inteira positiva: ");

        try {
            int quantidade = Integer.parseInt(scanner.nextLine().trim());

            if (quantidade <= 0) {
                System.out.println("A quantidade deve ser maior que zero.");
                return -1;
            }

            return quantidade;
        } catch (NumberFormatException e) {
            System.out.println("Quantidade inválida! Digite um número inteiro.");
            return -1;
        }
    }

    private void comprarGraos() {
        int quantidade = lerQuantidade();

        if (quantidade <= 0) {
            return;
        }

        if (mercado.comprarGraos(cidade, quantidade)) {
            System.out.println(
                "Compra realizada: " + quantidade + " unidades de grãos."
            );
        } else {
            System.out.println(
                "Compra recusada: florins insuficientes "
                + "ou limite de armazenamento excedido."
            );
        }
    }

    private void venderGraos() {
        int quantidade = lerQuantidade();

        if (quantidade <= 0) {
            return;
        }

        if (mercado.venderGraos(cidade, quantidade)) {
            System.out.println(
                "Venda realizada: " + quantidade + " unidades de grãos."
            );
        } else {
            System.out.println(
                "Venda recusada: grãos insuficientes "
                + "ou limite de florins excedido."
            );
        }
    }

    private void comprarTerras() {
        int quantidade = lerQuantidade();

        if (quantidade <= 0) {
            return;
        }

        if (mercado.comprarTerras(cidade, quantidade)) {
            System.out.println(
                "Compra realizada: " + quantidade + " hectares de terras."
            );
        } else {
            System.out.println(
                "Compra recusada: florins insuficientes "
                + "ou limite de terras excedido."
            );
        }
    }

    private void venderTerras() {
        int quantidade = lerQuantidade();

        if (quantidade <= 0) {
            return;
        }

        if (mercado.venderTerras(cidade, quantidade)) {
            System.out.println(
                "Venda realizada: " + quantidade + " hectares de terras."
            );
        } else {
            System.out.println(
                "Venda recusada: terras insuficientes "
                + "ou limite de florins excedido."
            );
        }
    }

    private void exibirSobre() {
        System.out.println();
        System.out.println("========== SOBRE O JOGO ==========");
        System.out.println(
            "Bolonha e Milano é um jogo de estratégia econômica medieval."
        );
        System.out.println(
            "Administre sua cidade e negocie recursos no mercado."
        );
        System.out.println(
            "O projeto será desenvolvido em oito etapas incrementais."
        );
        System.out.println(
            "Projeto escolar desenvolvido em Java."
        );
        System.out.println("==================================");
    }
}