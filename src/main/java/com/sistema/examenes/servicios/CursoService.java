package com.sistema.examenes.servicios;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.sistema.examenes.modelo.libros;




public interface CursoService {
	public Iterable<libros> findAll();
	public Page<libros> findAll(Pageable pageable);
	public Optional<libros> findById(Integer id);
	public libros save(libros libro);
	public void deleteById(Integer id);
	public libros findById(int id);
	public List<libros> findByTituloContains(String titulo);


	/*Optional<libros> findByLibro(String libro);*/
}
