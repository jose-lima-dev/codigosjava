package dispositivoEletronico;

public abstract class DispositivosEletronicos {
	private String nome;
	private String marca;
	private String modelo;
	private String sistemaOperacional;

	public DispositivosEletronicos(String nome, String marca, String modelo, String sistemaOperacional) {
		this.nome = nome;
		this.marca = marca;
		this.modelo = modelo;
		this.sistemaOperacional = sistemaOperacional;
	}

	public String getNome() {
		return nome;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getSistemaOperacional() {
		return sistemaOperacional;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}

	public abstract void exibirDetalhes();

	public void ligar() {
		System.out.println(nome + " está ligando...");
	}
}
