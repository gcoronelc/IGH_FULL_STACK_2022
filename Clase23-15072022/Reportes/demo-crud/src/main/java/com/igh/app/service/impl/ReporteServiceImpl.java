package com.igh.app.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igh.app.entity.Categoria;
import com.igh.app.entity.Producto;
import com.igh.app.repository.CategoriaRepository;
import com.igh.app.repository.ProductoRepository;
import com.igh.app.service.ReporteService;

@Service
public class ReporteServiceImpl implements ReporteService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public List<Map<String, ?>> traerCategorias() {
		List<Categoria> lista = (List<Categoria>) categoriaRepository.findAll();
		List<Map<String, ?>> lista2 = new ArrayList<>();
		for (Categoria c : lista) {
			Map<String, Object> r = new HashMap<>();
			r.put("ID", c.getId());
			r.put("NOMBRE", c.getNombre());
			lista2.add(r);
		}
		return lista2;
	}

	@Override
	public List<Map<String, ?>> traerProductos(Long categoria) {
		List<Producto> lista = productoRepository.findByCategoria(categoria);
		List<Map<String, ?>> lista2 = new ArrayList<>();
		for (Producto p : lista) {
			Map<String, Object> r = new HashMap<>();
			r.put("ID", p.getId());
			r.put("NOMBRE", p.getNombre());
			r.put("CATEGORIA", p.getCategoria().getId());
			r.put("PRECIO", p.getPrecio());
			r.put("STOCK", p.getStock());
			lista2.add(r);
		}
		return lista2;
	}

}
