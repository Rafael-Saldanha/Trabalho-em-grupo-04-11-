package br.com.senai.trabalho.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.trabalho.models.Endereco;
import br.com.senai.trabalho.repositories.EnderecoRepository;

@Service
public class EnderecoService {

    @Autowired
    public EnderecoRepository enderecoRepository;

    public Endereco buscar(Integer endereco_id) {
        return enderecoRepository.findById(endereco_id).get();
    }

    public Endereco salvar(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    public Endereco atualizar(Endereco endereco, Integer id) {
		Endereco e = buscar(id);
		if (e != null) {
            endereco.setEnderecoId(id);
            enderecoRepository.save(endereco);
		}
		return null;
	}
}
