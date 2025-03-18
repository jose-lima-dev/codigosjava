package dispositivoEletronico;

public class Computador extends DispositivosEletronicos {
	private boolean possuiPlacaDeVideo;

	public Computador(String nome, String marca, String modelo, String sistemaOperacional, boolean possuiPlacaDeVideo) {
		super(nome, marca, modelo, sistemaOperacional);
		this.possuiPlacaDeVideo = possuiPlacaDeVideo;
	}

	public boolean isPossuiPlacaDeVideo() {
		return possuiPlacaDeVideo;
	}

	public void setPossuiPlacaDeVideo(boolean possuiPlacaDeVideo) {
		this.possuiPlacaDeVideo = possuiPlacaDeVideo;
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("Computador:");
		System.out.println("Nome: " + getNome());
		System.out.println("Marca: " + getMarca());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Sistema Operacional: " + getSistemaOperacional());
		System.out.println("Placa de vídeo dedicada: " + (possuiPlacaDeVideo ? "Sim" : "Não"));
	}
}
