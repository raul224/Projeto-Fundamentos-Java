package br.edu.infnet.appseguros.Model.Testes;

import br.edu.infnet.appseguros.Model.Domain.Veiculo;

public class VeiculoTeste {
    public static void main(String[] args) {
        try {
            Veiculo veiculo = new Veiculo("1234", "20/03/2021", 180, 150,
                    20000);
            veiculo.setPlaca("XPZ7096");
            veiculo.setCRVL("12094857");
            veiculo.setTipoVeiculo("Moto");

            System.out.println(veiculo);
            System.out.println("Valor a receber: " + veiculo.CalculaValorReceber());
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
