/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cycle.objects.logics;

import cycle.objects.fertilizing.Solution;
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
    
    private final Map<CycleStage , List<Week>> plan;

    public WeekFeedScheme(String name) {
        this.name = name;
        plan = new LinkedHashMap<>();
        plan.put(CycleStage.seedling, new ArrayList<>());
        plan.put(CycleStage.veg, new ArrayList<>());
        plan.put(CycleStage.bloom, new ArrayList<>());
    }
    
    public List<Week> weekList(CycleStage cycleStage) {
        return plan.get(cycleStage);
    }
    
    public class Week {
        private final int number;
        private final Solution solution;

        public Week(int number, Solution solution) {
            this.number = number;
            this.solution = solution;
        }

        @Override
        public String toString() {
            return "Week number=" + number + ", solution: {" + solution + "}";
        }
    }
}
