package com.curso.javanauta.agendador.tarefas.business;


import com.curso.javanauta.agendador.tarefas.business.dto.TarefasDTO;
import com.curso.javanauta.agendador.tarefas.business.mapper.TarefasConverter;
import com.curso.javanauta.agendador.tarefas.infrastruture.Entity.TarefasEntity;
import com.curso.javanauta.agendador.tarefas.infrastruture.Repository.TarefasRepository;
import com.curso.javanauta.agendador.tarefas.infrastruture.enums.StatusNotificacaoEnum;
import com.curso.javanauta.agendador.tarefas.infrastruture.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class TarefasService {

    private final TarefasRepository tarefasRepository;
    private final TarefasConverter tarefaConverter;
    private final JwtUtil jwtUtil;

    public TarefasDTO gravarTarefa(String token,TarefasDTO dto){
        String email = jwtUtil.extrairEmailToken(token.substring(7));
        dto.setDataCriacao(LocalDateTime.now());
        dto.setStatusNotificacaoEnum(StatusNotificacaoEnum.PENDENTE);
        dto.setEmailUsuario(email);
        TarefasEntity entity = tarefaConverter.paraTarefaEntity(dto);

        return tarefaConverter.paraTarefaDTO(tarefasRepository.save(entity));
    }

}
