package br.edu.infnet.appseguros.Model.Testes;

import br.edu.infnet.appseguros.Model.Domain.Domicilio;

public class DomicilioTeste {
    public static void main(String[] args) {
        Domicilio domicilio = new Domicilio("1234", "20/03/2021", 180, 150,
                20000, true, "Rua aberlado bueno, 3000", 125, "18247363526");
        System.out.println(domicilio.toString());
        System.out.println("Valor a receber: " + domicilio.CalculaValorReceber());
    }
}
