package com.viceri.viceri.viceri;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.viceri.viceri.viceri.conexão.ConexaoDB;
import com.viceri.viceri.viceri.model.EnumPrioridade;
import com.viceri.viceri.viceri.model.Tarefa;
import com.viceri.viceri.viceri.model.Usuario;
import com.viceri.viceri.viceri.repositorio.TarefaRepositorioClass;
import com.viceri.viceri.viceri.service.TarefaService;
import com.viceri.viceri.viceri.service.UsuarioService;

public class Main {public static void main(String[] args) {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("aplicativo");
        EntityManager em = factory.createEntityManager();
		Usuario u =new Usuario(1L,"jack@","senha");
        Usuario u2 = new Usuario(3L,"lio@","senha");
        Tarefa t = new Tarefa(3L," devolver o livro",false,EnumPrioridade.MEDIA,u);
        TarefaRepositorioClass trf = new TarefaRepositorioClass();
        ConexaoDB con = new ConexaoDB();

        //con.add(t);
        //con.delete((long) 9);
        //con.updateDescricao((long) 10, "tarefa concluida");
        //con.updatePrioridade((long) 10,EnumPrioridade.ALTA);
        con.updateConclusao((long) 10, true);

		//em.getTransaction().begin();
		//em.merge(t);
		//em.getTransaction().commit();

    
		
    
}
    
}
