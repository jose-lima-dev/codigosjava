package financas;

public class Main {
    public static void main(String[] args) {
        Financeiro financeiro = new Financeiro();

        financeiro.adicionarTransacao(new Receita(50000, "Salário", "Renda", "01/03/2025"));
        financeiro.adicionarTransacao(new Despesa(1200, "Aluguel", "Moradia", "02/03/2025"));
        financeiro.adicionarTransacao(new Despesa(15000, "Compra de TV", "", "05/03/2025"));
        financeiro.adicionarTransacao(new Receita(-500, "Erro no lançamento", "Extra", "06/03/2025"));

        financeiro.listarTransacoes();

        System.out.println("\nSaldo atual: R$ " + financeiro.calcularSaldo());

        System.out.println();
        financeiro.listarTransacoesParaRevisao();
    }
}
