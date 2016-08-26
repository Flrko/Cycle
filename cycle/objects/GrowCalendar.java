/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cycle.objects;

import cycle.tools.CycleStage;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Calendar for logging and planing grow events
 * @author user
 */
public class GrowCalendar {
    private final Date startDate;
    private final Map<CycleStage , GrowDay> growDays;
    private int cyclePeriod = 0;
    private int seedlingPeriod = 0;    
    private int vegPeriod = 0;
    private int bloomPeriod = 0;
    
    
//    public Date vegDate() {
//        
//    }
    
    public GrowCalendar(Date startDate) {
        this.startDate = startDate;
        this.growDays = new LinkedHashMap<>();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setCyclePeriod(int cyclePeriod) {
        this.cyclePeriod = cyclePeriod;
    }

    public void setSeedlingPeriod(int seedlingPeriod) {        
        this.seedlingPeriod = seedlingPeriod;
    }

    public void setVegPeriod(int vegPeriod) {
        this.vegPeriod = vegPeriod;
    }

    public void setBloomPeriod(int bloomPeriod) {
        this.bloomPeriod = bloomPeriod;
    }
        
    /**
     * Добавление дня
     * @param stage
     * @param day 
     */
    public void addDay(CycleStage stage, GrowCalendar.GrowDay day) {
        growDays.put(stage, day);
    }
    
    class GrowDay {
        private final int number;
        private String comment;

        public GrowDay(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }
        
    }
}
