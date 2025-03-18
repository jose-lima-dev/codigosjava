package financas;

public class Receita implements Transacao {
    private double valor;
    private String descricao;
    private String categoria;
    private String data;

    public Receita(double valor, String descricao, String categoria, String data) {
        this.valor = valor;
        this.descricao = descricao;
        this.categoria = categoria;
        this.data = data;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String getCategoria() {
        return categoria;
    }

    @Override
    public String getData() {
        return data;
    }

    @Override
    public boolean precisaRevisao() {
        return valor < 0;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("[RECEITA] " + descricao + " | R$ " + valor + " | " + categoria + " | " + data);
    }
}
