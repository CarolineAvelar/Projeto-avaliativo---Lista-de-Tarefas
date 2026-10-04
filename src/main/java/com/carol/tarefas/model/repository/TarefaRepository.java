package com.carol.tarefas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carol.tarefas.model.entity.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

}