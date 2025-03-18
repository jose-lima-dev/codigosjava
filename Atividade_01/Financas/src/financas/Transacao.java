package financas;

public interface Transacao {
    double getValor();
    String getDescricao();
    String getCategoria();
    String getData();
    boolean precisaRevisao();
    
    void exibirDetalhes();
}

