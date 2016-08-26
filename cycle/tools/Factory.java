/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cycle.tools;

import cycle.objects.GrowCalendar;
import cycle.objects.fertilizing.NutriElement;
import java.util.Date;

/**
 *
 * @author user
 */
public class Factory {
    public final static NutriElement N = new NutriElement("N");
    public final static NutriElement P = new NutriElement("P");
    public final static NutriElement K = new NutriElement("K");
    public final static NutriElement S  = new NutriElement("S");
    public final static NutriElement Mg  = new NutriElement("Mg");
    
    
    public GrowCalendar makeGrowCalendar(Date startDate, int cyclePeriod) {
        
        GrowCalendar growCalendar = new GrowCalendar(startDate);
        
        return growCalendar;
    }
}
