package br.edu.infnet.appseguros.Model.Domain;
public class Orcamento {
    private Cliente cliente;
    private String DataEmissao;
    private int CodigoOrcamento;

    public Cliente getCodigoOrcamento() {
        return cliente;
    }

    public void setCodigoOrcamento(int codigo) {
        this.CodigoOrcamento = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDataEmissao() {
        return DataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        DataEmissao = dataEmissao;
    }

    public String toStirng(){
        return String.format("%s;%s;%s",getDataEmissao(), getCliente(), getCodigoOrcamento());
    }
}
