public class MetaDeArrecadacao {
    private double valorMeta;
    private double valorArrecadado;

    public MetaArrecadacao(double valorMeta) {
        this.valorMeta = valorMeta;
        this.valorArrecadado = 0.0;
    }

    public double getValorMeta() {
        return valorMeta;
    }

    public double getValorArrecadado() {
        return valorArrecadado;
    }

    public void receberDoacao(double valorDoacao) {
        valorArrecadado += valorDoacao;
    }

    public boolean metaAtingida() {
        return valorArrecadado >= valorMeta;
    }
}

}
