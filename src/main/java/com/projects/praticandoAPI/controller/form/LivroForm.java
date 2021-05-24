package com.projects.praticandoAPI.controller.form;

import com.projects.praticandoAPI.modelo.Curso;
import com.projects.praticandoAPI.modelo.Topico;
import com.projects.praticandoAPI.repository.CursoRepository;

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
        return mensagem;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

}
