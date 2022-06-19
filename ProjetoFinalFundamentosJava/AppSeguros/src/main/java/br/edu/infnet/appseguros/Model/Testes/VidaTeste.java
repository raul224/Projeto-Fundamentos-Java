package br.edu.infnet.appseguros.Model.Testes;

import br.edu.infnet.appseguros.Model.Domain.Vida;

public class VidaTeste {
    public static void main(String[] args) {
        try{
            Vida vida = new Vida("1234", "20/03/2021", 180, 150,
                    20000, true);
            vida.setCpf("18593655742");
            vida.setAnoNascimento(1997);
            vida.setCpfBeneficiario("18222720767");
            System.out.println(vida.toString());
            System.out.println("Valor a receber: " + vida.CalculaValorReceber());
        } catch (Exception e){
            throw new RuntimeException(e);
        }

    }
}
