package com.lanchonete.lanchonete_api.service;

import com.lanchonete.lanchonete_api.model.Bebida;
import com.lanchonete.lanchonete_api.repository.BebidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BebidaService {

    @Autowired
    private BebidaRepository repository;

    public List<Bebida> listarTodos() {
        return repository.findAll();
    }

    public Bebida salvar(Bebida bebida) {
        return repository.save(bebida);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

}