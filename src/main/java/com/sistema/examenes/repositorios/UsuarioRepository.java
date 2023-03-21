package com.sistema.examenes.repositorios;

import com.sistema.examenes.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    public Usuario findByUsername(String username);

    public List<Usuario> findAll();
    
    public List<Usuario> findAllByNombreContaining(String nombre);

}
