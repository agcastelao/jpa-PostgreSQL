package br.com.cast.dao;

import javax.persistence.EntityManager;

import br.com.cast.modelo.Categoria;

public class CategoriaDao {
    
    private EntityManager em;

    public CategoriaDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Categoria categoria) {
        this.em.persist(categoria);
    }

    public void atualizar(Categoria categoria) {
        this.em.merge(categoria);
    }
}
