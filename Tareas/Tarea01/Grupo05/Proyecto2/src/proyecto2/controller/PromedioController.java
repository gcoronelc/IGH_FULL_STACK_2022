/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2.controller;

import proyecto2.service.PromedioService;

/**
 *
 * @author thein
 */
public class PromedioController {
    private PromedioService promedioservice;
    public PromedioController(){
        promedioservice = new PromedioService();
    }
    public double promedio(double notas[]) {
        return promedioservice.promedio(notas);
	}
    
}
