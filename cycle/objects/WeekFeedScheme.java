/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cycle.objects;

import cycle.objects.fertilizing.Fert;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author user
 */
public class WeekFeedScheme {
    private String name;
    private List<Week> weeks = new ArrayList<>();
    
    
    
    
    class Week {
        private final int number;
        private final Map<Fert , Double> fertConcentration = new LinkedHashMap<>();

        public Week(int number) {
            this.number = number;
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
