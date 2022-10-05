package com.configspringsecurity.exercicio.services;

import com.configspringsecurity.exercicio.dtos.UsuarioDto;
import com.configspringsecurity.exercicio.models.UsuarioModel;
import com.configspringsecurity.exercicio.repositories.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private IUsuarioRepository iUsuarioRepository;

    private BCryptPasswordEncoder passwordEncoder(){

        return new BCryptPasswordEncoder();
    }

    public UsuarioModel cadastrarUsuarios(UsuarioModel usuarioModel){
        usuarioModel.setSenha(passwordEncoder().encode(usuarioModel.getSenha()));
        return iUsuarioRepository.save(usuarioModel);
    }

    public List<UsuarioModel> buscarUsuarios(){
        return iUsuarioRepository.findAll();
    }


    public Optional<UsuarioModel> buscarPorId(Long id){
        return iUsuarioRepository.findAllById(id);
    }

    public UsuarioModel atualizarUsuario(UsuarioModel usuarioModel){
        return iUsuarioRepository.save(usuarioModel);
    }

    public void deletarUsuario(Long id){
        iUsuarioRepository.deleteById(id);
    }
}
