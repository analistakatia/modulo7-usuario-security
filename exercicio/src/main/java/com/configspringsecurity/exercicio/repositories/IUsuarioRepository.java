package com.configspringsecurity.exercicio.repositories;

import com.configspringsecurity.exercicio.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUsuarioRepository extends JpaRepository<UsuarioModel, Long> {
    Optional<UsuarioModel> findAllById(Long id);
}
