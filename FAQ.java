import java.util.ArrayList;

public class FAQ {
    protected ArrayList<String> perguntas;
    protected ArrayList<String> respostas;

    public FAQ(ArrayList<String>perguntas, ArrayList<String> respostas) {
      this.perguntas = new ArrayList<String>(perguntas);
      this.respostas = new ArrayList<String>(respostas);
    }
    public void alterarResposta(String novaResposta, String pergunta){
        for (int i = 0; i < this.perguntas.size(); i++) {
            if (pergunta.equals(this.perguntas.get(i))) {
                this.perguntas.set(i, novaResposta);
            }
        }
    }
}
