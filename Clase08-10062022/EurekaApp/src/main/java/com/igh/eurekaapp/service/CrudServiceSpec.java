package com.igh.eurekaapp.service;

import java.util.List;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public interface CrudServiceSpec<T> {
	
	T read(String codigo);
	
	List<T> readAll();
	
	List<T> readAll(T model);
	
	void insert(T model);
	
	void update(T model);
	
	void delete(String codigo);

}
