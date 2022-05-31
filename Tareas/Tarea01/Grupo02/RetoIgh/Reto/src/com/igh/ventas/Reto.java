/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.igh.ventas;

import com.igh.ventas.view.MenuView;
import com.igh.ventas.controller.VentasController;

/**
 *
 * @author
 * Joaquin Rodolfo Bernabe Polo
 * Marcio José Begazo Molleda
 * Campoverde Pozo Neptali Yorvin
 * Limas Bayona Alberto
 */
public class Reto {
    
    
    public static void main(String[] args) {
        VentasController ventasController = new VentasController();
        MenuView menu = new MenuView(ventasController);
        menu.main(args);
    }
    
}
