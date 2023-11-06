import java.util.ArrayList;

public class EventoDeDoacao {
    protected String dataHora, localizacao;
    protected ArrayList<Necessidade>necessidades;
    protected ArrayList<Pessoa>voluntarios;
    protected MetaDeArrecadacao metaDeArrecadacao;
    protected ArrayList<Feedback>feedbacks;
    protected PessoaRecebedora pessoaRecebedora;

    public EventoDeDoacao(String dataHora, String localizacao, ArrayList<Necessidade> necessidades, PessoaRecebedora pessoaRecebedora, MetaDeArrecadacao metaDeArrecadacao) {
        this.dataHora = dataHora;
        this.localizacao = localizacao;
        this.necessidades = necessidades;
        this.metaDeArrecadacao = metaDeArrecadacao;
        this.pessoaRecebedora = pessoaRecebedora;
    }

    public String getDataHora() {
        return dataHora;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public ArrayList<Necessidade> getNecessidades() {
        return necessidades;
    }

    public ArrayList<Pessoa> getVoluntarios() {
        return voluntarios;
    }

    public MetaDeArrecadacao getMetaDeArrecadacao() {
        return metaDeArrecadacao;
    }

    public ArrayList<Feedback> getFeedbacks() {
        return feedbacks;
    }

    public PessoaRecebedora getPessoaRecebedora() {
        return pessoaRecebedora;
    }

    public void mudarDataHora(String novaDataHora) {
        this.dataHora = novaDataHora;
    }

    public void mudarLocalizacao(String novaLocalizacao) {
        this.localizacao = novaLocalizacao;
    }

    public void mudarNecessidade(ArrayList<Necessidade> necessidades) {
        this.necessidades = necessidades;
    }

    public void setVoluntarios(ArrayList<Pessoa> voluntarios) {
        this.voluntarios = voluntarios;
    }

    public void setMetaDeArrecadacao(MetaDeArrecadacao metaDeArrecadacao) {
        this.metaDeArrecadacao = metaDeArrecadacao;
    }

    public void setFeedbacks(ArrayList<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }

    public void setPessoaRecebedora(PessoaRecebedora pessoaRecebedora) {
        this.pessoaRecebedora = pessoaRecebedora;
    }

    public void listarVoluntarios(){
        for (int i = 0; i < this.voluntarios.size(); i++){
            System.out.println("Nome: "+voluntarios.get(i).nome+" Email: "+voluntarios.get(i).email);
        }
    }
}
