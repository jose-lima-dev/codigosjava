package veiculos;
public abstract class Veiculo {

    private String placa;
    private String marca;
    private String modelo;
    private double preco;

    public Veiculo(String placa, String marca, String modelo, double preco) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public abstract void imprimirDetalhes();
}
