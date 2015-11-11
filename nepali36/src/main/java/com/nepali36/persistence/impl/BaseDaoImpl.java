package com.nepali36.persistence.impl;

import java.util.List;
import java.util.Map;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import com.nepali36.model.UserAccount;
import com.nepali36.persistence.BaseDao;

public abstract class BaseDaoImpl<T, I> implements BaseDao<T, I> {
	
	protected abstract Class<T> getClassT();
	public abstract PersistenceManager getPersistenceManager();
	
	
	public void save(T t) {
		getPersistenceManager().makePersistent(t);
		
	}
	
	
	public void delete(T t) {
		getPersistenceManager().deletePersistent(t);
		
	}
	
	
	public T getById(I id) {
		return getPersistenceManager().getObjectById(getClassT(), id);
	}
	
	
	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		Query query = getPersistenceManager().newQuery(getClassT());
		return (List<T>) query.execute();
	}
	
	
	public void update(T t) {
		save(t);
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<T> getByQuery(String query, Map<String, ?> params) {
		
		String className = getClassT().getCanonicalName().toString();
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT FROM ");
		sb.append(className + " ");
		sb.append(query);
		System.out.println(sb.toString());
		Query q = getPersistenceManager().newQuery("javax.jdo.query.JDOQL", sb.toString());
		try{
			q.compile();
			return  (List<T>)q.executeWithMap(params);
		}catch( Exception e){
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	
	
	
	
	
	
	
	

}
