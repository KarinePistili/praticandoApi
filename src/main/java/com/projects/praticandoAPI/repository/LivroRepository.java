package com.projects.praticandoAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.praticandoAPI.modelo.Topico;
import java.util.List;


public interface LivroRepository extends JpaRepository<Livro, Long> {
    List<Livro> findByLivroNome(String nomeLivro);
}
