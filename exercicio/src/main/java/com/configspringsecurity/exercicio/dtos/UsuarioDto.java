package com.configspringsecurity.exercicio.dtos;

import com.configspringsecurity.exercicio.models.UsuarioModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDto implements Serializable {

    private Long id;
    private String nome;
    private Integer idade;
    private String telefone;
    private String login;
    private String senha;

    public UsuarioDto(UsuarioModel usuarioModel){
        this.id = usuarioModel.getId();
        this.nome = usuarioModel.getNome();
        //this.idade = usuarioModel.getIdade();
        //this.telefone = usuarioModel.getTelefone();
        this.login = usuarioModel.getLogin();
        this.senha = usuarioModel.getSenha();
    }

}