/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cycle;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author user
 */
public class Fert {
    
    private final Map<NutriElement , Double> elementsComposition = new LinkedHashMap<>();
    private final String name;

    public Fert(String name) {
        this.name = name;
    }
    
    public void addElement(NutriElement element, Double concentration) {
        if (concentration >= 0.0 && concentration <= 100.0 - fullConcentration()) {
            elementsComposition.put(element, concentration);
        } else {
            System.err.println("Wrong concentration value = " + concentration + " for element " + element);
        }
    }
    
    private Double fullConcentration() {
        Double concentration = 0.0;
        for (Entry entry : elementsComposition.entrySet()) {
            concentration += (Double) entry.getValue();
        }
        return concentration;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String elementsTab = "";
        for (Entry entry : elementsComposition.entrySet()) {
            elementsTab += ((NutriElement) entry.getKey()).getName() + " " + (Double)entry.getValue() + "%\n";
        }
        return "Fert " + getName() + ":\n" + elementsTab;
    }        
}
