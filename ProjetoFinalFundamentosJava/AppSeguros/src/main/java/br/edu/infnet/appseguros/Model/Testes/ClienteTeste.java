package br.edu.infnet.appseguros.Model.Testes;

import br.edu.infnet.appseguros.Model.Domain.Cliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Cliente teste", "21988867650", "raulteste@gmail.com");
        System.out.println(cliente.toString());
    }
}
