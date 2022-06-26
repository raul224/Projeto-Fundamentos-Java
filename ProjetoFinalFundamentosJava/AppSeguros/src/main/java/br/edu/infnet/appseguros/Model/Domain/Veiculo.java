package br.edu.infnet.appseguros.Model.Domain;

import br.edu.infnet.appseguros.Auxiliar.Constantes;
import br.edu.infnet.appseguros.Exceptions.VeiculoException;
import br.edu.infnet.appseguros.Exceptions.VidaException;

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
                     float valorIndenizacao){
        super(numeroContrato, assinatura, diasRestantes, valorContrato, valorIndenizacao, true);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) throws Exception{
        if(placa.length() != 7){
            throw  new VeiculoException("A placa deve ter apenas 7 digitos");
        }
        this.placa = placa;
    }

    public String getCRVL() {
        return CRVL;
    }

    public void setCRVL(String CRVL) throws Exception{
        if(!CRVL.matches("[0-9]+")){
            throw new VeiculoException("CRVL deve ter apenas numeros");
        }
        this.CRVL = CRVL;
    }

    public String getTipoVeiculo() {
        return TipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) throws Exception {
        if(tipoVeiculo.equalsIgnoreCase("moto") || tipoVeiculo.equalsIgnoreCase("carro")){
            TipoVeiculo = tipoVeiculo;
        } else {
            throw new VeiculoException("Tipo do veiculo deve ser carro ou moto");
        }
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
