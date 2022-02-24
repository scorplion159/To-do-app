package com.viceri.viceri.viceri.service;

import java.util.List;

import javax.persistence.EntityManager;

import com.viceri.viceri.viceri.conexão.ConexaoDB;
import com.viceri.viceri.viceri.model.Tarefa;
import com.viceri.viceri.viceri.model.Usuario;

import org.springframework.stereotype.Service;
@Service
public class UsuarioService implements CRUDServiceUsuario {
    
    ConexaoDB con = new ConexaoDB();
    @Override
    public List findAll() {
       
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object finById(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    

    @Override
    public Object update(int id, Object u) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object delete(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    
    public Usuario save(Usuario usuario) {
       // em.getTransaction().begin();
       // em.persist(usuario);
        //em.getTransaction().commit();

        
        return null;
    }

    @Override
    public Usuario add(Object u) {
       
        // TODO Auto-generated method stub
        return null;
    }
    
}
