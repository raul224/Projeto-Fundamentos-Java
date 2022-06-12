package br.edu.infnet.appseguros.Model.Testes;

import br.edu.infnet.appseguros.Model.Domain.Relatorio;

public class RelatorioTeste {
    public static void main(String[] args) {
        Relatorio relatorio = new Relatorio();
        relatorio.setDataEmissao("12/06/2022");
        relatorio.setNumeroRelatorio(1);

        System.out.println(relatorio.toStirng());
    }
}
