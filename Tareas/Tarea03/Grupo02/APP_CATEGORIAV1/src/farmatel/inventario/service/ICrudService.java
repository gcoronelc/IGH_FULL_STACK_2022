
package farmatel.inventario.service;

import java.util.List;


public interface ICrudService<T> {
    	//definir las firmas (metodos)
	void create(T x) throws Exception;

	void update(T x) throws Exception;

	void delete(T x) throws Exception;

	T findById(Object x) throws Exception;

	List<T> readAll() throws Exception;
        
       
}
