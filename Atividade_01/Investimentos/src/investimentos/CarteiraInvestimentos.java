package investimentos;

import java.util.ArrayList;
import java.util.List;

public class CarteiraInvestimentos {
    private List<Investimento> investimentos;

    public CarteiraInvestimentos() {
        investimentos = new ArrayList<>();
    }

    public void adicionarInvestimento(Investimento inv) {
        investimentos.add(inv);
    }

    public double calcularRetornoTotal() {
        double total = 0.0;
        for (Investimento i : investimentos) {
            total += i.calcularRetorno();
        }
        return total;
    }

    public void listarInvestimentos() {
        for (Investimento i : investimentos) {
            i.exibirDetalhes();
        }
    }

    public void listarParaRevisao() {
        System.out.println("\nInvestimentos que precisam de revisão:");
        for (Investimento i : investimentos) {
            if (i.precisaRevisao()) {
                i.exibirDetalhes();
            }
        }
    }

    public List<Investimento> getInvestimentos() {
        return investimentos;
    }
}
