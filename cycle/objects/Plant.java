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
    private String name;
    private Integer growTime;
    private Integer bloomTime;
    private int currDay;
    private int height;

    public Plant(String name, Integer growTime, Integer bloomTime) {
        this.name = name;
        this.growTime = growTime;
        this.bloomTime = bloomTime;
    }

    public Plant(String name) {
        this.name = name;
    }

    
    
    public void setName(String name) {
        this.name = name;
    }

    public void setGrowTime(Integer growTime) {
        this.growTime = growTime;
    }

    public void setBloomTime(Integer bloomTime) {
        this.bloomTime = bloomTime;
    }

    public void setCurrDay(int currDay) {
        this.currDay = currDay;
    }

    public void setHeight(int height) {
        this.height = height;
    }    
}
