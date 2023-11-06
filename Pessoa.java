import java.util.ArrayList;

public class Pessoa {
    protected String nome, telefone, email, fotoPerfil, senha, cpf;
    ArrayList<Doacao>doacoes;

    public Pessoa(String nome, String telefone, String email, String fotoPerfil, String senha, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.fotoPerfil = fotoPerfil;
        this.senha = senha;
        this.cpf = cpf;
    }
    public void doar(Doacao doacao, PessoaRecebedora pessoaRecebedora){
        pessoaRecebedora.doacoes.add(doacao);
        doacoes.add(doacao);
    }
    public void seVoluntariar(EventoDeDoacao eventoDeDoacao){
        eventoDeDoacao.voluntarios.add(this);
    }
    public void darFeeback(EventoDeDoacao eventoDeDoacao, Feedback feedback){
        eventoDeDoacao.feedbacks.add(feedback);
    }
    public void novaSenha(String senha){
        this.senha = senha;
    }
}
