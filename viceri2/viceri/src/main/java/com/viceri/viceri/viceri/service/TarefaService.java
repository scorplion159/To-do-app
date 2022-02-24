package com.viceri.viceri.viceri.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import com.viceri.viceri.viceri.Main;
import com.viceri.viceri.viceri.conexão.ConexaoDB;
import com.viceri.viceri.viceri.model.Tarefa;
import com.viceri.viceri.viceri.model.Usuario;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
@Service
public class TarefaService implements CRUDServiceUsuario  {

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
    public Usuario add(Object u) {
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

    

    

    

    
    
}
