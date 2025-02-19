package com.curso.javanauta.agendador.tarefas.infrastruture.Repository;

import com.curso.javanauta.agendador.tarefas.infrastruture.Entity.TarefasEntity;
import com.curso.javanauta.agendador.tarefas.infrastruture.enums.StatusNotificacaoEnum;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TarefasRepository extends MongoRepository<TarefasEntity, String> {

    List<TarefasEntity> findByDataEventoBetweenAndStatusNotificacaoEnum(LocalDateTime dataInicial,
                                                                        LocalDateTime dataFinal,
                                                                        StatusNotificacaoEnum status);

    List<TarefasEntity> findByEmailUsuario(String email);
}
