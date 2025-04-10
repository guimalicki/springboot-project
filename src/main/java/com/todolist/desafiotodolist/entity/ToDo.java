package com.todolist.desafiotodolist.entity;

import jakarta.persistence.*;

@Entity //Indica que se trata de uma entidade/tabela
@Table(name = "todos") //Leia To Do. Trata-se do nome da tabela
public class ToDo {
    //Colunas da tabela

    @Id //Indica que é um ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Gera um ID sequencial no próprio banco de dados
    private Long id;
    private String nome;
    private String descricao;
    private boolean realizado;
    private int prioridade;

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isRealizado() {
        return realizado;
    }

    public void setRealizado(boolean realizado) {
        this.realizado = realizado;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
}
