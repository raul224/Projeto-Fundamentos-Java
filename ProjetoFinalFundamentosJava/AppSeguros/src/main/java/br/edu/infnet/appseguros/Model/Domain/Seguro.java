package br.edu.infnet.appseguros.Model.Domain;

public abstract class Seguro{
    private String numeroContrato;
    private String DataAssinatura;
    private int DiasRestantes;
    private float ValorContrato;
    private float ValorIndenizacao;
    private boolean Ativo;

    public Seguro(String numeroContrato, String dataAssinatura, int diasRestantes, float valorContrato, float valorIndenizacao, boolean ativo) {
        this.numeroContrato = numeroContrato;
        DataAssinatura = dataAssinatura;
        DiasRestantes = diasRestantes;
        ValorContrato = valorContrato;
        ValorIndenizacao = valorIndenizacao;
        Ativo = ativo;
    }

    public String getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(String numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public String getDataAssinatura() {
        return DataAssinatura;
    }

    public void setDataAssinatura(String dataAssinatura) {
        DataAssinatura = dataAssinatura;
    }

    public int getDiasRestantes() {
        return DiasRestantes;
    }

    public void setDiasRestantes(int diasRestantes) {
        DiasRestantes = diasRestantes;
    }

    public float getValorContrato() {
        return ValorContrato;
    }

    public void setValorContrato(float valorContrato) {
        ValorContrato = valorContrato;
    }

    public float getValorIndenizacao() {
        return ValorIndenizacao;
    }

    public void setValorIndenizacao(float valorIndenizacao) {
        ValorIndenizacao = valorIndenizacao;
    }

    public boolean isAtivo() {
        return Ativo;
    }

    public void setAtivo(boolean ativo) {
        Ativo = ativo;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(numeroContrato);
        sb.append(";");
        sb.append(DataAssinatura);
        sb.append(";");
        sb.append(DiasRestantes);
        sb.append(";");
        sb.append(ValorContrato);
        sb.append(";");
        sb.append(ValorIndenizacao);
        sb.append(";");
        sb.append(Ativo);
        sb.append(";");

        return sb.toString();
    }
}