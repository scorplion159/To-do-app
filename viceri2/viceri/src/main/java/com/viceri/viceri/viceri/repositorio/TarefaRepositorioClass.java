package com.viceri.viceri.viceri.repositorio;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import com.viceri.viceri.viceri.conexão.ConexaoDB;
import com.viceri.viceri.viceri.model.Tarefa;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import net.bytebuddy.asm.Advice.Return;

public class TarefaRepositorioClass implements TarefaRepository {
    ConexaoDB c = new ConexaoDB();
    
    @Override
    public List findAll(Sort sort) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List findAllById(Iterable ids) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List saveAll(Iterable entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void flush() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Object saveAndFlush(Object entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List saveAllAndFlush(Iterable entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable entities) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAllByIdInBatch(Iterable ids) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAllInBatch() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Object getOne(Object id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object getById(Object id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List findAll(Example example) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List findAll(Example example, Sort sort) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Page findAll(Pageable pageable) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object save(Object entity) {

        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional findById(Object id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean existsById(Object id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void deleteById(Object id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void delete(Object entity) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAllById(Iterable ids) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAll(Iterable entities) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Optional findOne(Example example) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Page findAll(Example example, Pageable pageable) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long count(Example example) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean exists(Example example) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Object findBy(Example example, Function queryFunction) {
        // TODO Auto-generated method stub
        return null;
    }

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
    public int add(Object t) {
        return 0;
        
    }

    @Override
    public Object update(int id, Object t) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object delete(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    
    
}
