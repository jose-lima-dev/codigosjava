package Contatos;

public class ContatoPessoal implements Contato {
    private String nome;
    private String telefone;
    private String email;
    private String dataAniversario;

    public ContatoPessoal(String nome, String telefone, String email, String dataAniversario) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataAniversario = dataAniversario;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void exibirContato() {
        System.out.println("Contato Pessoal:");
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("Aniversário: " + dataAniversario);
    }
}
