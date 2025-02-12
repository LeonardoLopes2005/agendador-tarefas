package com.curso.javanauta.agendador.tarefas.business.mapper;

import com.curso.javanauta.agendador.tarefas.business.dto.TarefasDTO;
import com.curso.javanauta.agendador.tarefas.infrastruture.Entity.TarefasEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);

    List<TarefasEntity> paraListTarefasEntity(List<TarefasDTO> dtos);
    List<TarefasDTO> paraListTarefasDTO(List<TarefasEntity> entity);
}
