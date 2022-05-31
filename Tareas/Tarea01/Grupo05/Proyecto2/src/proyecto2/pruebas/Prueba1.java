/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto2.pruebas;


import proyecto2.service.PromedioService;
/**
 *
 * @author thein
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //variables
        
        double promedio;
        //datos
        double [] notas = {10, 15, 13, 12, 11, 17};
        //proceso
        PromedioService promedioservice = new PromedioService();
        promedio = promedioservice.promedio(notas);
        //salida
        System.out.println("Promedio " + promedio);
    }

    
    
}
