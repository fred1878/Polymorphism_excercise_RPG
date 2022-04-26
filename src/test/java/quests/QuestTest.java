package quests;
import characters.Fighter;
import characters.Mage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import party.Party;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class QuestTest {

    Fighter Jimmy;
    Party party;
    Quest quest;

    @BeforeEach
    public void setUp(){
        Jimmy = new Fighter("Jimmy",10,1,party);
        party = new Party("Jimmy & Co",20);
        quest = new Quest("Slay the Elder Dragon",100);
        party.addCharacter(Jimmy);
    }

    @Test
    public void questCompletes(){
        party.addQuest(quest);
        quest.questComplete(party,quest);
        assertThat(party.getGold()).isEqualTo(120);
        assertThat(Jimmy.getLvl()).isEqualTo(2);
        assertThat(quest.isComplete()).isEqualTo(true);
        assertThat(party.getAllQuests().size()).isEqualTo(0);
    }

    @Test
    public void cannotCompleteQuestNotTaken(){
        assertThat(quest.questComplete(party,quest)).isEqualTo("Quest not in quest log");
    }

    @Test
    public void duplicateQuestReturnsError(){
        party.addQuest(quest);
        assertThat(party.addQuest(quest)).isEqualTo("You already have this quest");
    }
}
