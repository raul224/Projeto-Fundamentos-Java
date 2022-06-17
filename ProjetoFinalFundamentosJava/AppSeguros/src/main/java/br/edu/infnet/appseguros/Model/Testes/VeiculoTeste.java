package br.edu.infnet.appseguros.Model.Testes;

import br.edu.infnet.appseguros.Model.Domain.Veiculo;

public class VeiculoTeste {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("1234", "20/03/2021", 180, 150,
                20000, true, "XPZ-709", "12094857", "Moto");

        System.out.println(veiculo.toString());
        System.out.println("Valor a receber: " + veiculo.CalculaValorReceber());
    }
}
