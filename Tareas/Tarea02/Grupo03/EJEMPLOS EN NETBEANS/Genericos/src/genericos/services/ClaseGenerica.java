package genericos.services;

public class ClaseGenerica<T> {

    private T objeto;// 
   
    public ClaseGenerica(T objeto) {
       this.objeto = objeto;
    }

    public void obtenerTipo() {
       System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
    }
    
    public <T> void imprimirGenerico(T element){
        System.out.println("imprimiendo dato genérico: "+element);
    }
    
     public void imprimirNumero(int num1){
        System.out.println("imprimiendo dato genérico: "+num1);
    }
}
