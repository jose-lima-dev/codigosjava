package Contatos;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Contato pessoal = new ContatoPessoal("Maria", "9999-1234", "maria@email.com", "01/01/1995");
        Contato pessoa2 = new ContatoPessoal("José", "9919-1234", "jose@email.com", "01/01/1992");
        Contato profissional = new ContatoProfissional("Carlos", "8888-5678", "carlos@empresa.com", "Tech Solutions", "Analista de Sistemas");

        agenda.adicionarContato(pessoal);
        agenda.adicionarContato(pessoa2);
        agenda.adicionarContato(profissional);

        agenda.listarContatos();
    }
}
