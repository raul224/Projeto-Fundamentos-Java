package br.edu.infnet.appseguros.Model.Testes;

import br.edu.infnet.appseguros.Model.Domain.*;

import java.util.ArrayList;
import java.util.List;

public class OrcamentoTeste {
    public static void main(String[] args) {
        List<Seguro> seguros = new ArrayList<Seguro>();
        Cliente cliente = new Cliente("Cliente teste", "21988867650", "raulteste@gmail.com");

        Domicilio domicilio = new Domicilio("1234", "20/03/2021", 180, 150,
                20000, true, "Rua aberlado bueno, 3000", 125, "18247363526");
        seguros.add(domicilio);

        Veiculo veiculo = new Veiculo("1234", "20/03/2021", 180, 150,
                20000, true, "XPZ-709", "12094857", "Moto");
        seguros.add(veiculo);

        Vida vida = new Vida("1234", "20/03/2021", 180, 150,
                20000, true, "18593655742", 1997, "18222720767");
        seguros.add(vida);

        Orcamento orcamento = new Orcamento();
        orcamento.setCodigoOrcamento(124456);
        orcamento.setCliente(cliente);
        orcamento.setSeguros(seguros);

        System.out.println(orcamento.toString());
    }
}
