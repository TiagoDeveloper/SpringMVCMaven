package br.com.springMVCMaven.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.springMVCMaven.model.GenericDao;
import br.com.springMVCMaven.model.Produto;

@Transactional
@Repository
public class ProdutoDao implements GenericDao<Produto>{

	@PersistenceContext
	private EntityManager manager;

	@Override
	public void insere(Produto t) {
		
		this.manager.persist(t);
		
	}

	@Override
	public Produto pesquisa(Produto t) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Produto> lista() {
		return this.manager.createQuery("select p from Produto p").getResultList();
	}

	@Override
	public void altera(Produto t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleta(Produto t) {
		// TODO Auto-generated method stub
		
	}
	
	
}
