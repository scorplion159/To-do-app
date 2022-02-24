package com.viceri.viceri.viceri.controle;

import com.viceri.viceri.viceri.model.Usuario;
import com.viceri.viceri.viceri.service.UsuarioService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioControle {
    private UsuarioService us ;

    public UsuarioControle(UsuarioService us) {
        this.us = us;
    }

   

    @PostMapping
    public Object postCurso(@RequestBody Usuario usuario){
        return us.add(usuario);
        
    }
    
}
