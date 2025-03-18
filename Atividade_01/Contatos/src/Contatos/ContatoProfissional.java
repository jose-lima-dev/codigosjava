package Contatos;

public class ContatoProfissional implements Contato {
    private String nome;
    private String telefone;
    private String email;
    private String empresa;
    private String cargo;

    public ContatoProfissional(String nome, String telefone, String email, String empresa, String cargo) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.empresa = empresa;
        this.cargo = cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getCargo() {
        return cargo;
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
        System.out.println("Contato Profissional:");
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("Empresa: " + empresa);
        System.out.println("Cargo: " + cargo);
    }
}
