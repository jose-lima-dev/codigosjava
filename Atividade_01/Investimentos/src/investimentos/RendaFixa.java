package investimentos;

public class RendaFixa extends InvestimentoBase {
    private boolean vencido;

    public RendaFixa(String nome, double valorInvestido, double valorAtual, boolean vencido) {
        super(nome, valorInvestido, valorAtual);
        this.vencido = vencido;
    }

    @Override
    public boolean precisaRevisao() {
        return vencido;
    }
}
