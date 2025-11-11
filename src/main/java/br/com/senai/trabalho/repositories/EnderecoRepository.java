package br.com.senai.trabalho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senai.trabalho.models.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
    
}