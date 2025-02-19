package com.curso.javanauta.agendador.tarefas.infrastruture.exceptions;


import javax.naming.AuthenticationException;

public class UnauthorizedException extends AuthenticationException {

    public UnauthorizedException(String mensagem){super(mensagem);
    }
    public UnauthorizedException(String mensagem, Throwable throwable){
        super(mensagem);
    }
}
