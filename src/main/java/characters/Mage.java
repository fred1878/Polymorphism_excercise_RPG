package characters;

import party.Party;

import java.util.Random;

public class Mage extends Character{

    public Mage(String name, int hp, int lvl,Party party) {
        super(name, hp, lvl, party);
    }

    public Spell randomSpell(){
        int spell = new Random().nextInt(Spell.values().length);
        return Spell.values()[spell];
    }

    public String cast(Spell spell){
        return "You cast " + spell.name() + " dealing " +(int)(Math.random()*10)+ " damage";
    }

    public String cast(){
        return "You cast "+randomSpell().name()+ " dealing " +(int)(Math.random()*10)+" damage";
    }

}
