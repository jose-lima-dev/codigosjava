package investimentos;

public interface Investimento {
    double calcularRetorno();
    boolean precisaRevisao();
    void exibirDetalhes();
}