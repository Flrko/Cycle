/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cycle.objects.fertilizing;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Класс раствора, содержит в себе список удобрений и их концентрацию
 * @author user
 */
public class Solution {    
    private final Map<Fert , Double> fertList;

    /**
     * Инициализация при помощи списка удобрений с концентрацией
     * @param fertList карта концентраций удобрений
     */
    public Solution (Map<Fert , Double> fertList) {
        this.fertList = fertList;
    }

    /**
     * Инициализация пустого раствора
     */    
    public Solution() {
        this.fertList = new LinkedHashMap<>();
    }

    public void addFert(Fert fert , Double concentration) {
        fertList.put(fert, concentration);
    }

    public Map<Fert, Double> getFertList() {
        return fertList;
    }
    
    @Override
    public String toString() {
        String fertTab = "";
        for (Map.Entry entry : fertList.entrySet()) {
            fertTab += ((Fert) entry.getKey()).getName() + " " + (Double)entry.getValue() + "ml/l\n";
        }
        return "Solution: \n" + fertTab;
    }     
}
