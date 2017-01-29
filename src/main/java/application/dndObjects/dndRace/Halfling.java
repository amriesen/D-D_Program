package application.dndObjects.dndRace;

import application.dndObjects.Character;
import application.dndObjects.abilities.Abilities;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Nicholas on 1/29/17.
 */
public class Halfling implements IDndRace {

    private static Halfling singltenInstance;

    private Halfling(){
    }

    public Halfling getInstence(){
        if (singltenInstance == null){
            singltenInstance = new Halfling();
        }

        return singltenInstance;
    }


    @Override
    public String getRaceName() {
        return "Halfling";
    }

    @Override
    public void RegisterAdjustment(Character character) {

    }

    @Override
    public Map<Abilities, Integer> getAdjustments() {
        Map<Abilities, Integer> adjustment = new TreeMap<>();

        adjustment.put(Abilities.DEXSTERITY, 2);
        adjustment.put(Abilities.STRENGTH, -2);

        return adjustment;
    }
}
