package dispositivoEletronico;

public class Main {
	public static void main(String[] args) {
		Computador pc = new Computador("PC Gamer", "Dell", "XPS", "Windows 11", true);
		DispositivosEletronicos celular = new Smartphone("Galaxy S23", "Samsung", "S23 Ultra", "Android 13", true);

		pc.ligar();
		pc.exibirDetalhes();

		System.out.println();

		celular.ligar();
		celular.exibirDetalhes();
	}
}
