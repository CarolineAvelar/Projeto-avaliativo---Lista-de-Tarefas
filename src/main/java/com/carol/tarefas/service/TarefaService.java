package com.carol.tarefas.service;

import java.util.List;

import com.carol.tarefas.model.entity.Tarefa;

public interface TarefaService {

    Tarefa salvarTarefa(Tarefa tarefa);

    List<Tarefa> listarTarefas();

    Tarefa atualizarTarefa(Tarefa tarefa);

    void excluirTarefa(Long id);

}