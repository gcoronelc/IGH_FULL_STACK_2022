
package com.igh.liskovsubstitutionprinciple.service;
import com.igh.liskovsubstitutionprinciple.service.Animal;

/**
 * @author A.A.Abad
 */

public class Elefante extends Animal {
    
    	@Override
	public String saltar() {
            return "NO puede saltar.";
	}           
}
