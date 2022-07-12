/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javagenerics;

/**
 *
 * @author USER
 */
public class OrdenPair<K,V> implements IPair<K, V>{

    private K key;
    private V value;

    public OrdenPair(K key, V value) {
        this.key = key;
        this.value = value;
    }
       
    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public V getValue() {
        return this.value;
    }
    
    public static <K,V> boolean compare(IPair<K,V>p1,IPair<K,V> p2){
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }
    
}
