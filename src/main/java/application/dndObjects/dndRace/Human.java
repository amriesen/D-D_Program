package application.dndObjects.dndRace;

import application.dndObjects.Character;
import application.dndObjects.abilities.Abilities;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Nicholas on 1/29/17.
 */
public class Human implements IDndRace {

    private static Human singltenInstance;

    private Human(){
    }

    public Human getInstence(){
        if (singltenInstance == null){
            singltenInstance = new Human();
        }

        return singltenInstance;
    }

    @Override
    public String getRaceName() {
        return "Human";
    }

    @Override
    public void RegisterAdjustment(Character character) {

    }

    @Override
    public Map<Abilities, Integer> getAdjustments() {
        return new TreeMap<>();
    }
}
