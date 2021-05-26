package com.projects.praticandoAPI.controller.form;

import java.util.List;

import com.projects.praticandoAPI.modelo.Curso;
import com.projects.praticandoAPI.modelo.Livro;
import com.projects.praticandoAPI.modelo.Topico;
import com.projects.praticandoAPI.repository.CursoRepository;
import com.projects.praticandoAPI.repository.LivroRepository;

public class LivroForm {

    private String titulo;
    private String descricao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeLivro() {
        return titulo;
    }

    public void setNomeLivro(String nomeLivro) {
        this.titulo = nomeLivro;
    }
    
    public Livro converter(LivroRepository livroRepository) {
		return new Livro(titulo, descricao);
	}

}
