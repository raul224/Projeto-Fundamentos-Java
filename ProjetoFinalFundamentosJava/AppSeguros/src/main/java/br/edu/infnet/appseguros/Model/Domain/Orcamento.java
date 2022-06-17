package br.edu.infnet.appseguros.Model.Domain;
public class Orcamento {
    private Corretora corretora;
    private String DataEmissao;
    private  String cliente;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

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

    public String toStirng(){
        return String.format("%s;%s",getDataEmissao(), getCliente());
    }
}
