package application.dndObjects.dndRace;

import application.dndObjects.Character;
import application.dndObjects.abilities.Abilities;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Nicholas on 1/29/17.
 */
public class Gnome implements IDndRace {

    private static Gnome singltenInstance;

    private Gnome(){
    }

    public Gnome getInstence(){
        if (singltenInstance == null){
            singltenInstance = new Gnome();
        }

        return singltenInstance;
    }



    @Override
    public String getRaceName() {
        return "Gnome";
    }

    @Override
    public void RegisterAdjustment(Character character) {

    }

    @Override
    public Map<Abilities, Integer> getAdjustments() {
        Map<Abilities, Integer> adjustments = new TreeMap<>();

        adjustments.put(Abilities.CONSTITUTION, 2);
        adjustments.put(Abilities.STRENGTH, -2);

        return adjustments;
    }
}
