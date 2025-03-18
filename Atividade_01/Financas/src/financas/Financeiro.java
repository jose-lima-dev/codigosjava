package financas;

import java.util.ArrayList;
import java.util.List;

public class Financeiro {
    private List<Transacao> transacoes;

    public Financeiro() {
        transacoes = new ArrayList<>();
    }

    public void adicionarTransacao(Transacao t) {
        transacoes.add(t);
    }

    public double calcularSaldo() {
        double saldo = 0.0;
        for (Transacao t : transacoes) {
            saldo += t.getValor();
        }
        return saldo;
    }

    public void listarTransacoes() {
        for (Transacao t : transacoes) {
            t.exibirDetalhes();
        }
    }

    public void listarTransacoesParaRevisao() {
        System.out.println("Transações que precisam ser revisadas:");
        for (Transacao t : transacoes) {
            if (t.precisaRevisao()) {
                t.exibirDetalhes();
            }
        }
    }
}
