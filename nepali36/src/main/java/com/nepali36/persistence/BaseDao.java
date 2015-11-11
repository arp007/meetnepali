package com.nepali36.persistence;

import java.util.List;
import java.util.Map;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;



public interface BaseDao<T, I> {
	
	public void save(T t);
	
	public void update(T t);
	
	public void delete (T t);
	
	public List<T> findAll();
	
	//public void merge (T t);
//	
//	public void saveOrUpdate(T t);
//	
//	public List<T> findAllByAttributes(String propertyName, String value);
//	
//	public Query createNamedQuery(String queryName, Map<String, ?>params);
//	
//	public T getById(I id);
//	
//	public List<T> findAllById(String propertyName, Object value);
//	
//	public List<T> findByIds(I[] idArray);
	
	public Object getByQuery(String query, Map<String, ?> params);
	
	public PersistenceManager getPersistenceManager();
	
}
