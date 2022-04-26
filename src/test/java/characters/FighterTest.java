package characters;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import party.Party;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FighterTest {

    Fighter Jimmy;
    Party party;

    @BeforeEach
    public void setUp(){
        Jimmy = new Fighter("Jimmy",10,1,party);
        party = new Party("Jimmy & Co",20);
        Jimmy.setParty(party);
    }

    @Test
    public void canAttack(){
        assertThat(Jimmy.attack()).isNotEmpty();
    }
}
