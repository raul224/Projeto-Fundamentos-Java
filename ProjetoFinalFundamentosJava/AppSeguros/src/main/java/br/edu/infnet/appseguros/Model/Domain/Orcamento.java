package br.edu.infnet.appseguros.Model.Domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Orcamento {
    private Cliente cliente;
    private LocalDateTime DataEmissao;
    private int CodigoOrcamento;
    private List<Seguro> Seguros;

    public int getCodigoOrcamento() {
        return CodigoOrcamento;
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

    public LocalDateTime getDataEmissao() {
        return DataEmissao;
    }

    public List<Seguro> getSeguros() {
        return Seguros;
    }

    public void setSeguros(List<Seguro> seguros) {
        Seguros = seguros;
    }

    public Orcamento(){
        DataEmissao = LocalDateTime.now();
    }

    @Override
    public String toString() {
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return String.format("%s;%s;%s;%d",getDataEmissao().format(dt), getCliente().toString(), getCodigoOrcamento(), getSeguros().size());
    }

    public String obterDadosArquivo() {
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append("\r\n");

        return sb.toString();
    }
}
