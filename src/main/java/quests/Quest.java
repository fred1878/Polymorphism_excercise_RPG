package quests;
import party.Party;
import characters.Character;

public class Quest {

    private boolean complete;
    private String questname;
    private int reward;

    public Quest(String questname, int reward) {
        this.complete = false;
        this.questname = questname;
        this.reward = reward;
    }

    public String questComplete(Party party,Quest quest) {
        if (party.quests.contains(quest)) {
            complete = true;
            party.addGold(reward);
            for (Character character : party.characters) {
                character.ding();
            }
            party.removeQuest(party.getQuest(quest));
            return "Quest Complete!";
        } else return "Quest not in quest log";
    }
    public boolean isComplete(){
        return complete;
    }
}
