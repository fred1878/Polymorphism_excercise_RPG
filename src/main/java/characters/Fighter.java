package characters;

import party.Party;

public class Fighter extends Character{

    public Fighter(String name, int hp, int lvl, Party party) {
        super(name, hp, lvl, party);
    }

    public String attack(){
        return "You deal "+(int)(Math.random()*5)+" damage";
    }
}
