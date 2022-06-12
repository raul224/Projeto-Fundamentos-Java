package br.edu.infnet.appseguros.Model.Testes;

import br.edu.infnet.appseguros.Model.Domain.Vida;

public class VidaTeste {
    public static void main(String[] args) {
        Vida vida = new Vida("1234", "20/03/2021", 180, 150,
                20000, true, "18593655742", 1997, "18222720767");

        System.out.println(vida.toString());
    }
}
