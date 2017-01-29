package application.dndObjects.dndRace;

import application.dndObjects.Character;
import application.dndObjects.abilities.Abilities;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Nicholas on 1/29/17.
 */
public class Elf implements IDndRace{

    private static Elf singltenInstance;

    private Elf(){
    }

    public Elf getInstence(){
        if (singltenInstance == null){
            singltenInstance = new Elf();
        }

        return singltenInstance;
    }


    @Override
    public String getRaceName() {
        return "Elf";
    }

    @Override
    public void RegisterAdjustment(Character character) {

    }

    @Override
    public Map<Abilities, Integer> getAdjustments() {
        Map<Abilities, Integer> adjustments = new TreeMap<>();

        adjustments.put(Abilities.DEXSTERITY, 2);
        adjustments.put(Abilities.CONSTITUTION, -2);

        return adjustments;
    }
}
