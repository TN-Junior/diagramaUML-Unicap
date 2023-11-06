public class Necessidade {
    protected String tipo;
    protected int quantidade;
    protected String urgencia;


    public Necessidade(String tipo, int quantidade, String urgencia) {
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.urgencia = urgencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(String urgencia) {
        this.urgencia = urgencia;
    }

}
