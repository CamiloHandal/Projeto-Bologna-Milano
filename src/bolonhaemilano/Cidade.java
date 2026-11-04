package bolonhaemilano;

public class Cidade {

    private String nome;
    private int anoAtual;
    private Jogador dono;

    private int florins;
    private int terras;
    private int graos;

    public Cidade(String nome, Jogador dono) {
        this.nome = nome;
        this.anoAtual = 1400;
        this.dono = dono;

        this.florins = 1000;
        this.terras = 10000;
        this.graos = 500;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoAtual() {
        return anoAtual;
    }

    public Jogador getDono() {
        return dono;
    }

    public int getFlorins() {
        return florins;
    }

    public int getTerras() {
        return terras;
    }

    public int getGraos() {
        return graos;
    }

    public void avancarAno() {
        anoAtual++;
    }

    public void adicionarFlorins(int quantidade) {
        if (quantidade < 0
                || (long) florins + quantidade > Integer.MAX_VALUE) {
            throw new IllegalArgumentException(
                "Quantidade inválida para adicionar florins."
            );
        }

        florins += quantidade;
    }

    public boolean removerFlorins(int quantidade) {
        if (quantidade < 0 || quantidade > florins) {
            return false;
        }

        florins -= quantidade;
        return true;
    }

    public void adicionarTerras(int quantidade) {
        if (quantidade < 0
                || (long) terras + quantidade > Integer.MAX_VALUE) {
            throw new IllegalArgumentException(
                "Quantidade inválida para adicionar terras."
            );
        }

        terras += quantidade;
    }

    public boolean removerTerras(int quantidade) {
        if (quantidade < 0 || quantidade > terras) {
            return false;
        }

        terras -= quantidade;
        return true;
    }

    public void adicionarGraos(int quantidade) {
        if (quantidade < 0
                || (long) graos + quantidade > Integer.MAX_VALUE) {
            throw new IllegalArgumentException(
                "Quantidade inválida para adicionar grãos."
            );
        }

        graos += quantidade;
    }

    public boolean removerGraos(int quantidade) {
        if (quantidade < 0 || quantidade > graos) {
            return false;
        }

        graos -= quantidade;
        return true;
    }

    public void exibirStatus() {
        System.out.println();
        System.out.println("========== STATUS DA CIDADE ==========");
        System.out.println("Cidade: " + nome);
        System.out.println(
            "Governante: " + dono.getTitulo() + " " + dono.getNome()
        );
        System.out.println("Ano atual: " + anoAtual);
        System.out.println("Florins: " + florins);
        System.out.println("Terras: " + terras + " hectares");
        System.out.println("Grãos: " + graos + " unidades");
        System.out.println("======================================");
    }
}