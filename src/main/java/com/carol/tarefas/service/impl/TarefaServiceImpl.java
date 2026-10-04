package com.carol.tarefas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carol.tarefas.model.entity.Tarefa;
import com.carol.tarefas.model.repository.TarefaRepository;
import com.carol.tarefas.service.TarefaService;

import jakarta.transaction.Transactional;

@Service
public class TarefaServiceImpl implements TarefaService {

    private TarefaRepository repository;

    @Autowired
    public TarefaServiceImpl(TarefaRepository repository) {
        super();
        this.repository = repository;
    }

    @Override
    @Transactional
    public Tarefa salvarTarefa(Tarefa tarefa) {
        return repository.save(tarefa);
    }

    @Override
    public List<Tarefa> listarTarefas() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public Tarefa atualizarTarefa(Tarefa tarefa) {
        return repository.save(tarefa);
    }

    @Override
    @Transactional
    public void excluirTarefa(Long id) {
        repository.deleteById(id);
    }

}