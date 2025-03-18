package investimentos;

public class Acao extends InvestimentoBase {
    public Acao(String nome, double valorInvestido, double valorAtual) {
        super(nome, valorInvestido, valorAtual);
    }

    @Override
    public boolean precisaRevisao() {
        return calcularRetorno() < -0.2 * valorInvestido;
    }
}