package br.edu.infnet.appseguros.Model.Testes;

import br.edu.infnet.appseguros.Model.Domain.Domicilio;

public class DomicilioTeste {
    public static void main(String[] args) {
        try {
            Domicilio domicilio = new Domicilio("1234", "20/03/2021", 180, 150,
                    20000);
            domicilio.setCep("22775036");
            domicilio.setMetragemImovel(125);
            domicilio.setCpfProprietario("18222720767");
            System.out.println(domicilio);
            System.out.println("Valor a receber: " + domicilio.CalculaValorReceber());
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
