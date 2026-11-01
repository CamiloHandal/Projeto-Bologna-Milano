package bolonhaemilano;

public class Cidade {

    private String nome;
    private int anoAtual;
    private Jogador dono;

    public Cidade(String nome, Jogador dono) {
        this.nome = nome;
        this.anoAtual = 1400;
        this.dono = dono;
    }

    public void avancarAno() {
        anoAtual++;
    }

    public void exibirStatus() {
        System.out.println();
        System.out.println("========== STATUS DA CIDADE ==========");
        System.out.println("Cidade: " + nome);
        System.out.println(
            "Governante: " + dono.getTitulo() + " " + dono.getNome()
        );
        System.out.println("Ano atual: " + anoAtual);
        System.out.println("======================================");
    }
}