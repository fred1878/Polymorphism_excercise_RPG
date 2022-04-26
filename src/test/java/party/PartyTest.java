package party;

import characters.Fighter;
import characters.Mage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import party.Party;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PartyTest {

    private Party party;

    @BeforeEach
    public void setUp(){
        party = new Party("Jimmy & Co",20);
        party.addCharacter(new Fighter("Jimmy",10,1,party));
    }

    @Test
    public void hasName(){
        assertThat(party.getName()).isEqualTo("Jimmy & Co");
    }

    @Test
    public void canAddMoney(){
        party.addGold(10);
        assertThat(party.getGold()).isEqualTo(30);
    }

    @Test
    public void canAddToParty(){
        assertThat(party.getCharacters().size()).isEqualTo(1);
    }

}