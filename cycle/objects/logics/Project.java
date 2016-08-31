/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cycle.objects.logics;

import cycle.objects.GrowToolsPack;
import cycle.objects.Plant;
import java.util.Date;

/**
 * Growing project class
 * @author user
 */
public class Project {
    
    private final String name;  //Имя
    private Date startDate;     //Дата начала проекта
    
    private final Plant plant;
    private final WeekFeedScheme feedScheme;
    private final GrowCalendar growCalendar;
    private final GrowToolsPack growTools;
    
    public Project(String name, Plant plant, WeekFeedScheme feedScheme, GrowCalendar growCalendar, GrowToolsPack growTools) {
        this.name = name;
        this.plant = plant;
        this.feedScheme = feedScheme;
        this.growCalendar = growCalendar;
        this.growTools = growTools;
    }

//    public Project(String name) {
//        this.name = name;
//        plant = null;
//    }

    public String getName() {
        return name;
    }    
}
