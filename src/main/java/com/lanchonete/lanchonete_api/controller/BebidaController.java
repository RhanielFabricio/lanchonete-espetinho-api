package com.lanchonete.lanchonete_api.controller;

import com.lanchonete.lanchonete_api.model.Bebida;
import com.lanchonete.lanchonete_api.service.BebidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bebidas")
public class BebidaController {

    @Autowired
    private BebidaService service;

    @GetMapping
    public List<Bebida> listarTodos() {
        return service.listarTodos();
    }

    @PostMapping
    public Bebida salvar(@RequestBody Bebida bebida) {
        return service.salvar(bebida);
    }

    @PutMapping("/{id}")
    public Bebida atualizar(@PathVariable Long id, @RequestBody Bebida bebida) {
        return service.atualizar(id, bebida);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }

}