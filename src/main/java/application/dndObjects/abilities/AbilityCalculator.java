package application.dndObjects.abilities;

import application.dndObjects.dndRace.IDndRace;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nicholas on 1/29/17.
 */
public class AbilityCalculator {

    List<AbilityAdjustment> adjustmentList = new ArrayList<>();

    public int getModifier(Abilities ability){
        return (getScore(ability) - 10) / 2;
    }


    private int getScore(Abilities ability) {
        int total = 0;

        for (AbilityAdjustment adj : adjustmentList){

            if (adj.getAdjustments().get(ability) != null){
                total += adj.getAdjustments().get(ability);
            }
        }
        return total;
    }

    public void register(IDndRace dndRace){
        adjustmentList.add(dndRace);
    }
}
