package br.edu.infnet.appseguros.Model.Testes;

import br.edu.infnet.appseguros.Model.Domain.Corretora;

public class CorretoraTeste {
    public static void main(String[] args) {
        Corretora corretora = new Corretora("Corretora teste", "21988867650", "corretorateste@gmail.com");
        corretora.toString();
    }
}
