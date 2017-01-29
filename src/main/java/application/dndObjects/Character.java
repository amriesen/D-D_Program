package application.dndObjects;

import application.dndObjects.abilities.AbilityCalculator;
import application.dndObjects.dndClass.IDndClass;
import application.dndObjects.dndRace.IDndRace;

/**
 * Created by Nicholas on 1/29/17.
 */
public class Character {

    private String name;

    private IDndClass dndclass;
    private IDndRace dndrace;

    private AbilityCalculator abilityCalculator = new AbilityCalculator();

    public Character(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setDndClass(IDndClass dndClass){
        this.dndclass = dndClass;
    }

    public IDndClass getDndClass(){
        return dndclass;
    }


    public void setRace(IDndRace dndrace){
        this.dndrace = dndrace;
        abilityCalculator.register(dndrace);

    }

    public IDndRace getDndRase(){
        return dndrace;
    }

}
