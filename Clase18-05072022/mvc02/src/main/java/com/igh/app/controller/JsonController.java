package com.igh.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.igh.app.model.VentaModel;

@Controller
public class JsonController {
	
	@RequestMapping(value = "/verVenta1", method = RequestMethod.GET,
			produces = "application/json; charset=UTF-8")
	@ResponseBody public VentaModel json1() {
		VentaModel bean = new VentaModel(89,5);
		return bean;
	}

	@RequestMapping(value = "/verVenta2", method = RequestMethod.GET,
			produces = "application/json; charset=UTF-8")
	@ResponseBody public List<VentaModel> json2() {
		List<VentaModel> lista = new ArrayList<>();
		lista.add(new VentaModel(89,5));
		lista.add(new VentaModel(60,15));
		lista.add(new VentaModel(55,20));
		lista.add(new VentaModel(43,15));
		lista.add(new VentaModel(28,5));
		return lista;
	}
}
