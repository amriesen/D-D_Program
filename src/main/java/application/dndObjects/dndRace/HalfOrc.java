package application.dndObjects.dndRace;

import application.dndObjects.Character;
import application.dndObjects.abilities.Abilities;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Nicholas on 1/29/17.
 */
public class HalfOrc implements IDndRace {

    private static HalfOrc singltenInstance;

    private HalfOrc(){
    }

    public HalfOrc getInstence(){
        if (singltenInstance == null){
            singltenInstance = new HalfOrc();
        }

        return singltenInstance;
    }

    @Override
    public String getRaceName() {
        return "HalfOrc";
    }

    @Override
    public void RegisterAdjustment(Character character) {

    }

    @Override
    public Map<Abilities, Integer> getAdjustments() {
        Map<Abilities, Integer> adjustment = new TreeMap<>();

        adjustment.put(Abilities.STRENGTH, 2);
        adjustment.put(Abilities.INTELLIGENCE, -2);
        adjustment.put(Abilities.CHARISMA, -2);

        return adjustment;
    }
}
