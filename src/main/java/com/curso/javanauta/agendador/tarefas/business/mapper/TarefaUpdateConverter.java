package com.curso.javanauta.agendador.tarefas.business.mapper;

import com.curso.javanauta.agendador.tarefas.business.dto.TarefasDTO;
import com.curso.javanauta.agendador.tarefas.infrastruture.Entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface TarefaUpdateConverter {

    void updateTarefas(TarefasDTO dto, @MappingTarget TarefasEntity entity);
}
