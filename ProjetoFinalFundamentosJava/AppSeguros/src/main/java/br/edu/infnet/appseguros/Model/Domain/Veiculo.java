package br.edu.infnet.appseguros.Model.Domain;

import br.edu.infnet.appseguros.Auxiliar.Constantes;

public class Veiculo extends Seguro{
    private String placa;
    private String CRVL;
    private String TipoVeiculo;

    public Veiculo(String numeroContrato, String assinatura, int diasRestantes, float valorContrato,
                   float valorIndenizacao, boolean ativo, String placa, String CRVL, String tipoVeiculo) {
        super(numeroContrato, assinatura, diasRestantes, valorContrato, valorIndenizacao, ativo);
        this.placa = placa;
        this.CRVL = CRVL;
        TipoVeiculo = tipoVeiculo;
    }

    public Veiculo(String numeroContrato, String assinatura, int diasRestantes, float valorContrato,
                     float valorIndenizacao, boolean ativo){
        super(numeroContrato, assinatura, diasRestantes, valorContrato, valorIndenizacao, ativo);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCRVL() {
        return CRVL;
    }

    public void setCRVL(String CRVL) {
        this.CRVL = CRVL;
    }

    public String getTipoVeiculo() {
        return TipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        TipoVeiculo = tipoVeiculo;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(";");
        sb.append(placa);
        sb.append(";");
        sb.append(CRVL);
        sb.append(";");
        sb.append(TipoVeiculo);

        return sb.toString();
    }

    @Override
    public float CalculaValorReceber() {
        int diasMes = new Constantes().DiasMes;
        float valorMes = super.getValorContrato();
        int diasContrato = super.getDiasRestantes();
        if(getTipoVeiculo().equals("moto")){
            return (valorMes/diasMes) * (diasContrato + diasMes);
        } else {
            return (valorMes/diasMes) * diasContrato;
        }
    }
}
