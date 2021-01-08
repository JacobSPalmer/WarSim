import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DeckTest {

    Deck tDeck;

    @Test
    void standardDeckHas52Cards() {
        tDeck = new Deck();
        List<Card> test = new ArrayList<>();
        assertEquals(52, tDeck.deckSize());
    }

    @Test
    void deckCanBeFilledAndEmptied() {
        tDeck = new Deck();
        assertFalse(tDeck.getDeckList().isEmpty());
        tDeck.empty();
        assertTrue(tDeck.getDeckList().isEmpty());
    }
}