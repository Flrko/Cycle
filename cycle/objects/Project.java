/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cycle.objects;

/**
 * Growing project class
 * @author user
 */
public class Project {
    
    private final Plant plant;
    private final FeedScheme feedScheme;
    private final GrowCalendar growCalendar;
    private final GrowToolsPack growTools;

    public Project(Plant plant, FeedScheme feedScheme, GrowCalendar growCalendar, GrowToolsPack growTools) {
        this.plant = plant;
        this.feedScheme = feedScheme;
        this.growCalendar = growCalendar;
        this.growTools = growTools;
    }    
}
