package br.com.springMVCMaven.model;

import java.util.List;

public interface GenericDao<T> {
	
	public void insere(T t);
	public T pesquisa(T t);
	public List<T> lista();
	public void altera(T t);
	public void deleta(T t);

}
