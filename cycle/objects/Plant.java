/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cycle.objects;

/**
 *
 * @author user
 */
public class Plant {
    private final String name;
    private final Integer growTime;
    private final Integer bloomTime;
    private int currDay;
    private int height;

    public Plant(String name, Integer growTime, Integer bloomTime) {
        this.name = name;
        this.growTime = growTime;
        this.bloomTime = bloomTime;
    }
    
    
}
