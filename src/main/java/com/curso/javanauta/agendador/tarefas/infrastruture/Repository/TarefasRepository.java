package com.curso.javanauta.agendador.tarefas.infrastruture.Repository;

import com.curso.javanauta.agendador.tarefas.infrastruture.Entity.TarefasEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefasRepository extends MongoRepository<TarefasEntity, String> {
}
