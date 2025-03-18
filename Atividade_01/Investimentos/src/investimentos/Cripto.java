package investimentos;

public class Cripto extends InvestimentoBase {
    public Cripto(String nome, double valorInvestido, double valorAtual) {
        super(nome, valorInvestido, valorAtual);
    }

    @Override
    public boolean precisaRevisao() {
        return calcularRetorno() < -0.3 * valorInvestido;
    }
}
