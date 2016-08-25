/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cycle.objects.fertilizing;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class NutriElement {
    public final static String[] TYPES = {"macro" , "micro"};
    public final static String[] NAMES = {"N" , "P" , "K" , "S" , "Mg"}; //TODO
    
    private String name;
    private String type;

    public NutriElement(String name) {
        if (Arrays.asList(NAMES).contains(name)) {
            this.name = name;
            this.type = makeType(name);
        } else {
            System.err.println("Wrong name for NutriElement!");
        }
    }
    
    //TODO определение типа элемента по его названию
    private String makeType(String name) {
        return null;
    }

    @Override
    public String toString() {
        return "NutriElement{" + "name=" + name + ", type=" + type + '}';
    }
        
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
