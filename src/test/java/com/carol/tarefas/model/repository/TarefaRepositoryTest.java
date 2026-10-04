package com.carol.tarefas.model.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.carol.tarefas.model.entity.Tarefa;
import com.carol.tarefas.model.enums.StatusTarefa;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@ActiveProfiles("test")
public class TarefaRepositoryTest {

    @Autowired
    TarefaRepository repository;

    @Test
    public void deveSalvarUmaTarefa() {

        // cenário
        Tarefa tarefa = Tarefa.builder()
                .nome("Estudar Java")
                .descricao("Estudar Spring Boot")
                .status(StatusTarefa.PENDENTE)
                .observacoes("Revisar antes da prova")
                .build();

        // ação/execução
        Tarefa tarefaSalva = repository.save(tarefa);

        // verificação
        assertNotNull(tarefaSalva.getId());
    }
    
    @Test
    public void deveAlterarUmaTarefa() {

        // cenário
        Tarefa tarefa = Tarefa.builder()
                .nome("Estudar Java")
                .descricao("Estudar Spring Boot")
                .status(StatusTarefa.PENDENTE)
                .observacoes("Revisar antes da prova")
                .build();

        tarefa = repository.save(tarefa);

        // ação/execução
        tarefa.setStatus(StatusTarefa.CONCLUIDA);
        Tarefa tarefaAtualizada = repository.save(tarefa);

        // verificação
        assertEquals(StatusTarefa.CONCLUIDA, tarefaAtualizada.getStatus());
    }
    @Test
    public void deveExcluirUmaTarefa() {

        // cenário
        Tarefa tarefa = Tarefa.builder()
                .nome("Estudar Java")
                .descricao("Estudar Spring Boot")
                .status(StatusTarefa.PENDENTE)
                .observacoes("Revisar antes da prova")
                .build();

        tarefa = repository.save(tarefa);

        // ação/execução
        repository.delete(tarefa);

        // verificação
        boolean existe = repository.existsById(tarefa.getId());
        assertFalse(existe);
    }
}