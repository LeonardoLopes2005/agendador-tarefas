package com.curso.javanauta.agendador.tarefas.business.mapper;

import com.curso.javanauta.agendador.tarefas.business.dto.TarefasDTO;
import com.curso.javanauta.agendador.tarefas.infrastruture.Entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);
}
