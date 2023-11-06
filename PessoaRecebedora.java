import java.util.ArrayList;

public class PessoaRecebedora extends Pessoa {
    protected ArrayList<EventoDeDoacao>eventos;
    protected ArrayList<Doacao>doacoes;
    public PessoaRecebedora(String nome, String telefone, String email, String fotoPerfil, String senha, String cpf) {
        super(nome, telefone, email, fotoPerfil, senha, cpf);
    }

    public void organizarEvento(EventoDeDoacao eventoDeDoacao){
        eventos.add(eventoDeDoacao);
    }
    public void receberDoacao(EventoDeDoacao eventoDeDoacao, Doacao doacao){
        eventoDeDoacao.pessoaRecebedora.doacoes.add(doacao);
    }
}
