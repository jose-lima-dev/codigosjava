package veiculos;
public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro("ABC1234", "Toyota", "Corolla", 90000.0, 4);
        Veiculo moto = new Moto("XYZ5678", "Honda", "CG 160", 12000.0, true);
        Veiculo caminhao = new Caminhao("JKL4321", "Volvo", "FH 540", 450000.0, 25.0);

        carro.imprimirDetalhes();
        System.out.println();
        moto.imprimirDetalhes();
        System.out.println();
        caminhao.imprimirDetalhes();
    }
}
