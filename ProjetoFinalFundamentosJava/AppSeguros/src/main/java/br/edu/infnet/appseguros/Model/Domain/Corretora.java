package br.edu.infnet.appseguros.Model.Domain;

public class Corretora {
    private String nome;
    private String telefone;
    private String email;

    public Corretora(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(";");
        sb.append(nome);
        sb.append(";");
        sb.append(telefone);
        sb.append(";");
        sb.append(email);

        return sb.toString();
    }
}
