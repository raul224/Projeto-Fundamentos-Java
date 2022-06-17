package br.edu.infnet.appseguros.Model.Testes;

import br.edu.infnet.appseguros.Model.Domain.Orcamento;

public class OrcamentoTeste {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.setDataEmissao("12/06/2022");
        orcamento.setNumeroRelatorio(1);

        System.out.println(orcamento.toStirng());
    }
}
