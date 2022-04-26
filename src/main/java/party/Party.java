package party;
import characters.Character;
import quests.Quest;

import java.util.ArrayList;
import java.util.List;

public class Party {
    private String name;
    private int gold;
    public List<Character> characters;
    public List<Quest> quests;

    public Party(String name, int gold) {
        this.name = name;
        this.gold = gold;
        this.characters = new ArrayList<>();
        this.quests = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getGold() {
        return gold;
    }

    public void addGold(int gold) {
        this.gold += gold;
    }

    public void addCharacter(Character character){
        characters.add(character);
    }

    public String addQuest(Quest quest){
        if(quests.contains(quest)){
            return "You already have this quest";
        }
        else quests.add(quest);
        return "Quest Added";
    }

    public Quest getQuest(Quest quest){
        return quests.get(quests.indexOf(quest));
    }

    public void removeQuest(Quest quest){quests.remove(quest);}

    public List<Quest> getAllQuests(){
        return quests;
    }

    public List<Character> getCharacters(){
        return characters;
    }
}
