/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.igh.ventas.model;
 
import java.util.List;
import java.util.stream.Collectors;
 /**
 *
 * @author
 * Joaquin Rodolfo Bernabe Polo
 * Marcio José Begazo Molleda
 * Campoverde Pozo Neptali Yorvin
 * Limas Bayona Alberto
 */
public class Resumen {
    public String categoria;
    public int nventas;
    public int ncamion;
    public float importeventas;
    public float importecomision;
    private List<Venta> ventas;
    
    public Resumen(){
        
    }
    
   
    
    public void setResumenPorCategoria(String categ, List<Venta> ventas){
        this.categoria=categ;
        this.ventas=filtrarVentas(ventas);
        this.nventas=calcularNVentas();
        this.ncamion=calcularNCamion();
        this.importeventas=calcularImporteVentas();
        this.importecomision = calcularImporteComision();
    }
    
    public void setResumenTotal(List<Venta> ventas){
        this.ventas=ventas;
        this.nventas=calcularNVentas();
        this.ncamion=calcularNCamion();
        this.importeventas=calcularImporteVentas();
        this.importecomision = calcularImporteComision();
    }
    
    private List<Venta> filtrarVentas(List<Venta> ventas){
        List<Venta> filtro=
        ventas.stream()
            .filter(e->e.getCategoria()==categoria)
                .collect(Collectors.toList());
        return filtro;
    }
    
    private int calcularNVentas(){
        int nventas=ventas.size();
        return nventas;
    }
    
    private int calcularNCamion(){
        int ncamion=0;
        
        for(int i=0;i<ventas.size();i++)
            ncamion = ventas.get(i).getCant() + ncamion;
        
        return ncamion;
    }
    
    private float calcularImporteVentas(){
        float importe=0;
        
        for(int i=0;i<ventas.size();i++)
            importe = ventas.get(i).getTotal() + importe;
        
        return importe;
    }
    
    private float calcularImporteComision(){
        float importe=0;
        
        for(int i=0;i<ventas.size();i++)
            importe = ventas.get(i).getComisiontotal() + importe;
        
        return importe;
    }
}
