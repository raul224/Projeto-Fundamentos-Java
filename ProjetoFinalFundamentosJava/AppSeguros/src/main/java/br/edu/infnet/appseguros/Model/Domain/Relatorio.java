package br.edu.infnet.appseguros.Model.Domain;


public class Relatorio {
    private Corretora corretora;
    private String DataEmissao;
    private  int numeroRelatorio;

    public Corretora getCorretora() {
        return corretora;
    }

    public void setCorretora(Corretora corretora) {
        this.corretora = corretora;
    }

    public String getDataEmissao() {
        return DataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        DataEmissao = dataEmissao;
    }

    public int getNumeroRelatorio() {
        return numeroRelatorio;
    }

    public void setNumeroRelatorio(int numeroRelatorio) {
        this.numeroRelatorio = numeroRelatorio;
    }

    public String toStirng(){
        return String.format("%s;%s",getDataEmissao(), getNumeroRelatorio());
    }
}
