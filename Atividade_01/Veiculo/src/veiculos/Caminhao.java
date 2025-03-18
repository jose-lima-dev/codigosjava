package veiculos;
public class Caminhao extends Veiculo {

    private double capacidadeCarga;

    public Caminhao(String placa, String marca, String modelo, double preco, double capacidadeCarga) {
        super(placa, marca, modelo, preco);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Caminhão:");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Capacidade de carga: " + capacidadeCarga + " toneladas");
    }
}
