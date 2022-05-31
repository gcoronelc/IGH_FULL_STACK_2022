 
package com.igh.ventas.service;

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
public class VentasService {

    List<Venta> ventas = new ArrayList<Venta>();

    public Venta procesarVenta(String categ, int cant) {
        //VARIABLES
        int n;
        Venta venta;

        //ASIGNACION
        n = ventas.size() + 1;
        venta = new Venta();

        //PROCESO
        venta.setVenta(n, categ, cant);
        ventas.add(venta);

        //REPORTE-RESULTADO
        return venta;
    }

    public List<Venta> obtenerListaVentas() {

        //REPORTE-RESULTADO
        return ventas;
    }

    public List<Resumen> generarReporte() {
        //VARIABLES
        Resumen ventasA;
        Resumen ventasB;
        Resumen ventasC;
        Resumen total;
        List<Resumen> reporte;

        //ASIGNACION
        ventasA = new Resumen();
        ventasB = new Resumen();
        ventasC = new Resumen();
        total = new Resumen();
        reporte = new ArrayList<Resumen>();

        //PROCESO
        ventasA.setResumenPorCategoria("A", ventas);
        ventasB.setResumenPorCategoria("B", ventas);
        ventasC.setResumenPorCategoria("C", ventas);
        total.setResumenTotal(ventas);
        reporte.add(ventasA);
        reporte.add(ventasB);
        reporte.add(ventasC);
        reporte.add(total);

        //RESULTADO
        return reporte;

    }

}
