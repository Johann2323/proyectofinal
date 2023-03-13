package com.sistema.examenes.repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistema.examenes.modelo.libros;



@Repository
public interface CursoRepository extends JpaRepository<libros, Integer> {
	List<libros> findByTituloContains(String titulo);
	
}
