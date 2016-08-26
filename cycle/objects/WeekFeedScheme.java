/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cycle.objects;

import cycle.objects.fertilizing.Fert;
import cycle.tools.CycleStage;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Схема питания по неделям
 * @author user
 */
public class WeekFeedScheme extends FeedScheme {
    private final String name;
    private final List<Week> weeks = new ArrayList<>();

    public WeekFeedScheme(String name) {
        this.name = name;
    }
    
    class Week {
        private final int number;                                                   //WeekNumber
        private final Map<Fert , Double> fertConcentration = new LinkedHashMap<>(); //Fertilizer's concentration for this week
        private final CycleStage stage;                                             //Этап развития растения

        public Week(int number, CycleStage stage) {
            this.number = number;
            this.stage = stage;
        }
        
        public void addFert(Fert fert , Double concentration) {
            fertConcentration.put(fert, concentration);
        }

        @Override
        public String toString() {
            String fertTab = "";
            for (Map.Entry entry : fertConcentration.entrySet()) {
                fertTab += ((Fert) entry.getKey()).getName() + " " + (Double)entry.getValue() + "ml/l\n";
            }
            return "Week number=" + number + ":\n" + fertTab;
        }        
    }
}
