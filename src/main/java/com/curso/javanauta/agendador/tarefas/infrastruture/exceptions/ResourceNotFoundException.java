package com.curso.javanauta.agendador.tarefas.infrastruture.exceptions;

public class ResourceNotFoundException extends RuntimeException {

  public ResourceNotFoundException(String mensage) {
    super(mensage);
  }
  public ResourceNotFoundException(String mensagem, Throwable throwable){
    super(mensagem, throwable);
  }
}
