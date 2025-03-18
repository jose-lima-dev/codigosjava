package dispositivoEletronico;

public class Smartphone extends DispositivosEletronicos {
	private boolean temSuporte5G;

	public Smartphone(String nome, String marca, String modelo, String sistemaOperacional, boolean temSuporte5G) {
		super(nome, marca, modelo, sistemaOperacional);
		this.temSuporte5G = temSuporte5G;
	}

	public boolean isTemSuporte5G() {
		return temSuporte5G;
	}

	public void setTemSuporte5G(boolean temSuporte5G) {
		this.temSuporte5G = temSuporte5G;
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("Smartphone:");
		System.out.println("Nome: " + getNome());
		System.out.println("Marca: " + getMarca());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Sistema Operacional: " + getSistemaOperacional());
		System.out.println("Suporte a 5G: " + (temSuporte5G ? "Sim" : "Não"));
	}
}
