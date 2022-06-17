package br.edu.infnet.appseguros.Model.Domain;

public class Domicilio extends Seguro{
    private String endereco;
    private int MetragemImovel;
    private String CpfProprietario;

    public Domicilio(String numeroContrato, String assinatura, int diasRestantes, float valorContrato,
                     float valorIndenizacao, boolean ativo, String endereco, int metragemImovel, String cpfProprietario) {
        super(numeroContrato, assinatura, diasRestantes, valorContrato, valorIndenizacao, ativo);
        this.endereco = endereco;
        MetragemImovel = metragemImovel;
        CpfProprietario = cpfProprietario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getMetragemImovel() {
        return MetragemImovel;
    }

    public void setMetragemImovel(int metragemImovel) {
        MetragemImovel = metragemImovel;
    }

    public String getCpfProprietario() {
        return CpfProprietario;
    }

    public void setCpfProprietario(String cpfProprietario) {
        CpfProprietario = cpfProprietario;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(";");
        sb.append(endereco);
        sb.append(";");
        sb.append(MetragemImovel);
        sb.append(";");
        sb.append(CpfProprietario);

        return sb.toString();
    }

    @Override
    public float CalculaValorReceber() {
        float valorMes = super.getValorContrato();
        int diasContrato = super.getDiasRestantes();
        if(getMetragemImovel() > 800){
            return (valorMes/30) * (diasContrato + 30);
        } else {
            return (valorMes/30) * diasContrato;
        }
    }
}
