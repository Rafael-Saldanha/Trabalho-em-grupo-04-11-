package br.com.senai.trabalho.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.senai.trabalho.models.Endereco;
import br.com.senai.trabalho.services.EnderecoService;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {
    @Autowired
    public EnderecoService enderecoService;


    @GetMapping("/buscar/{id}")
    public Endereco buscar(@PathVariable Integer id) {
        return enderecoService.buscar(id);
    }

    @PostMapping("/salvar")
    public Endereco salvar(@RequestBody Endereco endereco) {
        return enderecoService.salvar(endereco);
    }

    @PutMapping("/atualizar/{id}")
    public Endereco atualizar(@PathVariable Integer id, @RequestBody Endereco endereco) {
        return enderecoService.atualizar(endereco, id);
    }
}