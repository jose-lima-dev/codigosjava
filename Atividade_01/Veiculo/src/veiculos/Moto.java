package veiculos;
public class Moto extends Veiculo {

    private boolean possuiPartidaEletrica;

    public Moto(String placa, String marca, String modelo, double preco, boolean possuiPartidaEletrica) {
        super(placa, marca, modelo, preco);
        this.possuiPartidaEletrica = possuiPartidaEletrica;
    }

    public boolean isPossuiPartidaEletrica() {
        return possuiPartidaEletrica;
    }

    public void setPossuiPartidaEletrica(boolean possuiPartidaEletrica) {
        this.possuiPartidaEletrica = possuiPartidaEletrica;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Moto:");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Partida elétrica: " + (possuiPartidaEletrica ? "Sim" : "Não"));
    }
}
