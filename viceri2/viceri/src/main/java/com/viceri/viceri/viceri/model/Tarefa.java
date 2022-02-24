package com.viceri.viceri.viceri.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="Tarefas")
@Data
public class Tarefa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private long id;
  
    private String descricao;
    
    private boolean tarefaConcluida;
    private EnumPrioridade prioridade;
    @Column(name = "usuario")
    private String emailUsuario;
    public Tarefa(long id, String descricao, boolean tarefaConcluida, EnumPrioridade prioridade, Usuario usuario) {
        this.id = id;
        this.descricao = descricao;
        this.tarefaConcluida = tarefaConcluida;
        this.prioridade = prioridade;
        this.emailUsuario= emailUsuario;
    }
    public Tarefa(){

    }


    
}
