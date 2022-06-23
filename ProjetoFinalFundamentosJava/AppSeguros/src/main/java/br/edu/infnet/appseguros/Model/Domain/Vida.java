package br.edu.infnet.appseguros.Model.Domain;

import br.edu.infnet.appseguros.Auxiliar.Constantes;
import br.edu.infnet.appseguros.Exceptions.VidaException;

import java.time.LocalDateTime;

public class Vida extends Seguro{
    private String cpf;
    private int anoNascimento;
    private String cpfBeneficiario;

    public Vida(String numeroContrato, String assinatura, int diasRestantes, float valorContrato, float valorIndenizacao,
                boolean ativo, String cpf, int anoNascimento, String cpfBeneficiario) {
        super(numeroContrato, assinatura, diasRestantes, valorContrato, valorIndenizacao, ativo);
        this.cpf = cpf;
        this.anoNascimento = anoNascimento;
        this.cpfBeneficiario = cpfBeneficiario;
    }

    public Vida(String numeroContrato, String assinatura, int diasRestantes, float valorContrato,
                     float valorIndenizacao){
        super(numeroContrato, assinatura, diasRestantes, valorContrato, valorIndenizacao, true);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws Exception {
        try{
            Integer.parseInt(cpf);
        } catch(Exception e){
            throw new VidaException("CPF deve ter apenas numeros");
        }
        this.cpf = cpf;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) throws Exception {
        if(anoNascimento >= (LocalDateTime.now().getYear() - 18)){
            throw new VidaException("o cliente deve ter mais de 18 anos");
        }
        this.anoNascimento = anoNascimento;
    }

    public String getCpfBeneficiario() {
        return cpfBeneficiario;
    }

    public void setCpfBeneficiario(String cpfBeneficiario) throws Exception {
        try{
           Integer.parseInt(cpfBeneficiario);
        } catch(Exception e){
            throw new VidaException("CPF do beneficiario deve ter apenas numeros");
        }
        this.cpfBeneficiario = cpfBeneficiario;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(";");
        sb.append(cpf);
        sb.append(";");
        sb.append(anoNascimento);
        sb.append(";");
        sb.append(cpfBeneficiario);

        return sb.toString();
    }
    @Override
    public float CalculaValorReceber() {
        int diasMes = new Constantes().DiasMes;
        float valorMes = super.getValorContrato();
        int diasContrato = super.getDiasRestantes();
        if(getAnoNascimento() < 2000){
            return (valorMes/diasMes) * diasContrato;
        } else {
            return (valorMes/diasMes) * (diasContrato + diasMes);
        }
    }
}
