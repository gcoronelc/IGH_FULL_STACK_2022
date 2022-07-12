
package javagenerics;

/**
 *
 * @author USER
 */
public class Box <T>{
    
    private T t;
    
    public T get(){
        return this.t;
    }
    public void set(T t){
        this.t = t;
    }
    //funcionar con tipos de datos que son hijos de Number
    
    
    public <U extends Number> void inspect(U u){
        System.out.println("T : " + t.getClass().getName());
        System.out.println("U : "+u.getClass().getName());
        
    }
    
}
