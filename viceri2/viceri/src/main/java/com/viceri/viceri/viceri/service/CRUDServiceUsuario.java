package com.viceri.viceri.viceri.service;

import java.util.List;

public interface CRUDServiceUsuario<Usuario> {

    List<Usuario> findAll();
    Usuario finById(int id);
    com.viceri.viceri.viceri.model.Usuario add (Usuario u);
    Usuario update(int id,Usuario u);
    Usuario delete(int id);
    
    
}
