package characters;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import party.Party;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CharacterTest {

    Fighter Jimmy;
    Party party;

    @BeforeEach
    public void setUp(){
        Jimmy = new Fighter("Jimmy",10,1,party);
        party = new Party("Jimmy & Co",20);
    }

    @Test
    public void hasName(){
        assertThat(Jimmy.getName()).isEqualTo("Jimmy");
    }

    @Test
    public void hasHp(){
        assertThat(Jimmy.getHp()).isEqualTo(10);
    }

    @Test
    public void takeDamage(){
        Jimmy.addHp(-4);
        assertThat(Jimmy.getHp()).isEqualTo(6);
    }

    @Test
    public void canLevelUp(){
        Jimmy.ding();
        assertThat(Jimmy.getLvl()).isEqualTo(2);
    }

    @Test
    public void canDie(){
        Jimmy.ding();
        Jimmy.death();
        assertThat(Jimmy.getLvl()).isEqualTo(1);
    }


}
