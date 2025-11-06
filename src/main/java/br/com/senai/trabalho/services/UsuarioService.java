package br.com.senai.trabalho.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.trabalho.models.Usuario;
import br.com.senai.trabalho.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    public UsuarioRepository usuarioRepository;


    public Usuario salvar(Usuario usuario, String confSenha) {
        if(usuario.getSenha().equals(confSenha)) {
            return usuarioRepository.save(usuario);
        }
        return null;
    }

     public String login(String email, String senha ) {
        Usuario usuario = usuarioRepository.findByEmail(email);
        if(usuario != null && senha.equals(usuario.getSenha())) {
            return "Login efetuado com sucesso";
        }
        return "Falha ao realizar login";
    }
}