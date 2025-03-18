package investimentos;

public abstract class InvestimentoBase implements Investimento {
    protected String nome;
    protected double valorInvestido;
    protected double valorAtual;

    public InvestimentoBase(String nome, double valorInvestido, double valorAtual) {
        this.nome = nome;
        this.valorInvestido = valorInvestido;
        this.valorAtual = valorAtual;
    }

    public String getNome() {
        return nome;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public double getValorAtual() {
        return valorAtual;
    }

    @Override
    public double calcularRetorno() {
        return valorAtual - valorInvestido;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println(nome + " | Investido: R$" + valorInvestido +
                           " | Atual: R$" + valorAtual +
                           " | Retorno: R$" + calcularRetorno());
    }
}
