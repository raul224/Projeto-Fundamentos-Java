package br.edu.infnet.appseguros.Model.Domain;

import br.edu.infnet.appseguros.Auxiliar.Constantes;
import br.edu.infnet.appseguros.Exceptions.DomicilioException;
import br.edu.infnet.appseguros.Exceptions.VeiculoException;
import br.edu.infnet.appseguros.Exceptions.VidaException;

public class Domicilio extends Seguro{
    private String Cep;
    private int MetragemImovel;
    private String CpfProprietario;

    public Domicilio(String numeroContrato, String assinatura, int diasRestantes, float valorContrato,
                     float valorIndenizacao, boolean ativo, String cep, int metragemImovel, String cpfProprietario) {
        super(numeroContrato, assinatura, diasRestantes, valorContrato, valorIndenizacao, ativo);
        Cep = cep;
        MetragemImovel = metragemImovel;
        CpfProprietario = cpfProprietario;
    }

    public Domicilio(String numeroContrato, String assinatura, int diasRestantes, float valorContrato,
                     float valorIndenizacao){
        super(numeroContrato, assinatura, diasRestantes, valorContrato, valorIndenizacao, true);
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String cep) throws Exception{
        if(!cep.matches("[0-9]+")){
            throw new DomicilioException("CEP deve ter apenas numeros");
        }
        this.Cep = cep;
    }

    public int getMetragemImovel() {
        return MetragemImovel;
    }

    public void setMetragemImovel(int metragemImovel) throws Exception{
        if(metragemImovel <= 30){
            throw new DomicilioException("A residencia precisa ter ao menos 30 metros quadrados");
        }
        MetragemImovel = metragemImovel;
    }

    public String getCpfProprietario() {
        return CpfProprietario;
    }

    public void setCpfProprietario(String cpfProprietario) throws Exception {
        if (!cpfProprietario.matches("[0-9]+")) {
            throw new DomicilioException("CPF deve ter apenas numeros");
        }
        CpfProprietario = cpfProprietario;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(";");
        sb.append(Cep);
        sb.append(";");
        sb.append(MetragemImovel);
        sb.append(";");
        sb.append(CpfProprietario);

        return sb.toString();
    }

    @Override
    public float CalculaValorReceber() {
        int diaMes = new Constantes().DiasMes;
        float valorMes = super.getValorContrato();
        int diasContrato = super.getDiasRestantes();
        if(getMetragemImovel() > 800){
            return (valorMes/diaMes) * (diasContrato + diaMes);
        } else {
            return (valorMes/diaMes) * diasContrato;
        }
    }
}
