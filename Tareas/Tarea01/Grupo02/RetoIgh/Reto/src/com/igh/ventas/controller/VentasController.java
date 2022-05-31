 
package com.igh.ventas.controller;
import com.igh.ventas.service.VentasService;
import com.igh.ventas.model.Venta;
import com.igh.ventas.model.Resumen;
import java.util.*;

/**
 *
 * @author
 * Joaquin Rodolfo Bernabe Polo
 * Marcio José Begazo Molleda
 * Campoverde Pozo Neptali Yorvin
 * Limas Bayona Alberto
 */
public class VentasController {
    
    private VentasService ventasService;
    
    public VentasController(){
        ventasService = new VentasService();
    }
    
    public Venta procesarVenta(String categ, int cant){
        //RESULTADO
        return ventasService.procesarVenta(categ, cant);
    }
    
    public List<Venta> obtenerListaVentas(){
        //RESULTADO
        return ventasService.obtenerListaVentas();
        
    }
    
    public List<Resumen> generarReporte(){
        //RESULTADO
        return ventasService.generarReporte();
    }
    
    
}
