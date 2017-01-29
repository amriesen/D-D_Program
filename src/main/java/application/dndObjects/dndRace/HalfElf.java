package application.dndObjects.dndRace;

import application.dndObjects.Character;
import application.dndObjects.abilities.Abilities;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Nicholas on 1/29/17.
 */
public class HalfElf implements IDndRace {

    private static HalfElf singltenInstance;

    private HalfElf(){
    }

    public HalfElf getInstence(){
        if (singltenInstance == null){
            singltenInstance = new HalfElf();
        }

        return singltenInstance;
    }



    @Override
    public String getRaceName() {
        return "Half Elf";
    }

    @Override
    public void RegisterAdjustment(Character character) {

    }

    @Override
    public Map<Abilities, Integer> getAdjustments() {
        return new TreeMap<>();
    }
}
