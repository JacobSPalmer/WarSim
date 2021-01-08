import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CardTest {

    private Card tCard;

    @BeforeAll
    public static void init(){

    }

    @Test
    public void cardShouldHaveSuit(){
        tCard = new Card(12, Card.Suit.DIAMONDS);
        assertEquals(Card.Suit.DIAMONDS, tCard.getSuit());
    }

    @Test
    void cardShouldHaveRank() {
        tCard = new Card(5, Card.Suit.SPADES);
        assertEquals(5, tCard.getRank());
    }
}