package com.viceri.viceri.viceri.conexão;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.viceri.viceri.viceri.model.EnumPrioridade;
import com.viceri.viceri.viceri.model.Tarefa;
import com.viceri.viceri.viceri.model.Usuario;

import antlr.collections.List;

public class ConexaoDB {
    
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("aplicativo");
        EntityManager em = factory.createEntityManager();

        public Tarefa add (Tarefa t){
        em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
        return null;
        }
        public Tarefa delete( Long id ){
            em.getTransaction().begin();
            Tarefa tarefa = em.find(Tarefa.class, id);
            em.remove(tarefa);
            em.getTransaction().commit();

            return null;

        }
        public Tarefa updateDescricao(Long id, String nova_descricao) {
            em.getTransaction().begin();
            Tarefa tarefa = em.find(Tarefa.class, id);
            tarefa.setDescricao(nova_descricao);
            em.merge(tarefa);
            em.getTransaction().commit();
            // TODO Auto-generated method stub
            return null;
        }
        public Tarefa updatePrioridade(Long id, EnumPrioridade enumPrioridade){
            em.getTransaction().begin();
            Tarefa tarefa = em.find(Tarefa.class, id);
            tarefa.setPrioridade(enumPrioridade);
            em.merge(tarefa);
            em.getTransaction().commit();
            return null;

        }

        public Tarefa updateConclusao(Long id, Boolean x){
            em.getTransaction().begin();
            Tarefa tarefa = em.find(Tarefa.class, id);
            tarefa.setTarefaConcluida(x);
            em.merge(tarefa);
            em.getTransaction().commit();
            return null;

        }

        public Tarefa updateUsuario(Long id, Usuario u){
            em.getTransaction().begin();
            Tarefa tarefa = em.find(Tarefa.class, id);
            //tarefa.setUsuario(u);
            em.merge(tarefa);
            em.getTransaction().commit();
            return null;

        }
        public Tarefa addTarefaUsuario(Tarefa t,Long id){
            em.getTransaction().begin();
            Usuario usuario = em.find(Usuario.class, id);
           // usuario.getListaTarefa().addAll((Collection<? extends String>) t);
            
            em.merge(usuario);
            em.getTransaction().commit();
            return null;

        }
       
    
    
}
