package com.company.intersegrega.service;

import com.company.intersegrega.entity.Entity;

//common interface to be implemented by all persistence services. 
public interface PersistenceService<T extends Entity> {

	public void save(T entity);
	
	public void delete(T entity);
	
	public T findById(Long id);
	
	// 한 Class에서만 사용하는 Method를 제거하여
	// Interface Segregation Principle를 충족
	// public List<T> findByName(String name);
}
