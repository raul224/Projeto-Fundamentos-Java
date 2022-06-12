package br.edu.infnet.appseguros.Model.Domain;

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getCpfBeneficiario() {
        return cpfBeneficiario;
    }

    public void setCpfBeneficiario(String cpfBeneficiario) {
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
}
