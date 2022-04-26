package characters;
import party.Party;

public abstract class Character implements Levelable {
    private String name;
    private int hp;
    private int lvl;
    protected Party party;

    public Character(String name, int hp, int lvl,Party party) {
        this.name = name;
        this.hp = hp;
        this.lvl = lvl;
        setParty(party);
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void addHp(int hp) {
        this.hp += hp;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public void ding(){
        lvl += 1;
    }

    public void death(){
        setLvl(1);
    }
}
