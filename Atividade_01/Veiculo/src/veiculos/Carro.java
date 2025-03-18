package veiculos;
public class Carro extends Veiculo {

    private int numeroPortas;

    public Carro(String placa, String marca, String modelo, double preco, int numeroPortas) {
        super(placa, marca, modelo, preco);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Carro:");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Número de portas: " + numeroPortas);
    }
}
