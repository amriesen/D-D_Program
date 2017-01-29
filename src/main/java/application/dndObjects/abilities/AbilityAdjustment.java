package application.dndObjects.abilities;

import application.dndObjects.Character;

import java.util.Map;

/**
 * Created by Nicholas on 1/29/17.
 */
public interface AbilityAdjustment {
    public void RegisterAdjustment(Character character);

    public Map<Abilities, Integer> getAdjustments();
}
