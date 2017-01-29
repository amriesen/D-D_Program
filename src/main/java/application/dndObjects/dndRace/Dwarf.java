package application.dndObjects.dndRace;

import application.dndObjects.Character;
import application.dndObjects.abilities.Abilities;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Nicholas on 1/29/17.
 */
public class Dwarf implements IDndRace {

    private static Dwarf singltenInstance;

    private Dwarf(){
    }

    public Dwarf getInstence(){
        if (singltenInstance == null){
            singltenInstance = new Dwarf();
        }

        return singltenInstance;
    }


    @Override
    public String getRaceName() {
        return "Dwarf";
    }


    @Override
    public void RegisterAdjustment(Character character) {

    }

    @Override
    public Map<Abilities, Integer> getAdjustments() {
        Map<Abilities, Integer> adjustments = new TreeMap<>();

        adjustments.put(Abilities.CONSTITUTION, 2);
        adjustments.put(Abilities.CHARISMA, -2);

        return adjustments;
    }
}
