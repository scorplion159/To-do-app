package com.viceri.viceri.viceri.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Usuarios")
@Data
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private String senha;
    @Column(name="lista de tarefas")
    private String [] listaString;
    
     static List <String> listaTarefa = new ArrayList();

    
    public Usuario(){}
    public Usuario(Long id, String email,String senha) {
        this.id = id;
        this.email = email;
        this.senha= senha;
        
    }
    

    

    //public List<Tarefa> queryForTarefas(Usuario usuario) {
        
       // List<Tarefa> listaTarefas = em.createQuery("SELECT listaTarefa  from Usuarios  where email = Jack@")
          
        //  .getResultList();
       // return listaTarefas;
 //   }
    
}
