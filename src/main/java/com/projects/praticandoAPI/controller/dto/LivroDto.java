package com.projects.praticandoAPI.controller.dto;
import com.projects.praticandoAPI.modelo.Topico;


import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;



public class LivroDto {

    private Long id;
    private String titulo;
    private String descricao;

    public LivroDto(Livro livro) {
        this.id = livro.getId();
        this.titulo = livro.getTitulo();
        this.descricao = livro.getMensagem();
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static List<LivroDto> converter(List<Livro> livros) {
        return livros.stream().map(LivroDto::new).collect(Collectors.toList());
    }

}
