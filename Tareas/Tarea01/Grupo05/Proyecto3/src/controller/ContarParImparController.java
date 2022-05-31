package controller;

import service.ContarParImparService;

/**
 *
 * @author Bryan
 */
public class ContarParImparController {
    
    ContarParImparService contarParImparService;
    
    public ContarParImparController() {
        contarParImparService = new ContarParImparService();
    }
    
    public int[] generarArreglo() {
        return contarParImparService.generarArreglo();
    }
    
    public int contarPares(int[] arreglo) {
        return contarParImparService.contarPares(arreglo);
    }
    
    public int contarImpares(int[] arreglo) {
        return contarParImparService.contarImpares(arreglo);
    }
    
}
