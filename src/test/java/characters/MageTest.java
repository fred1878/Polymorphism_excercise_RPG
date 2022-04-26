package characters;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import party.Party;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MageTest {

    Mage Johnny;
    Party party;

    @BeforeEach
    public void setUp(){
        Johnny = new Mage("Johnny",10,1,party);
        party = new Party("Jimmy & Co",20);
        Johnny.setParty(party);
    }
    //Fails tests but desired Actual is desired outcome, couldn't deal with random outcomes in testing
    @Test
    public void canCastRandom(){
        assertThat(Johnny.cast()).isEqualTo(0);
    }

    @Test
    public void canCast(){
        assertThat(Johnny.cast(Spell.Fire_Bolt)).isEqualTo(0);
    }
}
