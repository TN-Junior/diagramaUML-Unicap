public class Doacao {
    protected String doador;
    protected PessoaRecebedora pessoaRecebedora;
    protected String itemDoado;




        public Doacao(String doador, PessoaRecebedora pessoaRecebedora, String itemDoado) {
            this.doador = doador;
            this.pessoaRecebedora = pessoaRecebedora;
            this.itemDoado = itemDoado;
        }

        
        public String getDoador() {
            return doador;
        }

        public void setDoador(String doador) {
            this.doador = doador;
        }

        public PessoaRecebedora getPessoaRecebedora() {
            return pessoaRecebedora;
        }

        public void setPessoaRecebedora(PessoaRecebedora pessoaRecebedora) {
            this.pessoaRecebedora = pessoaRecebedora;
        }

        public String getItemDoado() {
            return itemDoado;
        }

        public void setItemDoado(String itemDoado) {
            this.itemDoado = itemDoado;
        }
    }

}
