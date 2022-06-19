package br.edu.infnet.appseguros.Exceptions;

public class DomicilioException extends Exception{
    private static final long serialVersionUID = 1L;

    public DomicilioException(String mensagem){
        super(mensagem);
    }
}
