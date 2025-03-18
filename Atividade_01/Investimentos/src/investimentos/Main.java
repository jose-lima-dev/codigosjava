package investimentos;

public class Main {
    public static void main(String[] args) {
        CarteiraInvestimentos carteira = new CarteiraInvestimentos();

        carteira.adicionarInvestimento(new Acao("PETR4", 1000, 700));
        carteira.adicionarInvestimento(new RendaFixa("Tesouro Direto", 2000, 2100, false));
        carteira.adicionarInvestimento(new RendaFixa("CDB vencido", 1500, 1800, true)); 
        carteira.adicionarInvestimento(new Cripto("Bitcoin", 3000, 1900));

        carteira.listarInvestimentos();

        System.out.println("\nRetorno total: R$ " + carteira.calcularRetornoTotal());

        carteira.listarParaRevisao();
    }
}
