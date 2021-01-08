import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HandTest {

    List<Card> sample = new ArrayList<>();
    Card s1 = new Card(2, Card.Suit.SPADES);
    Card s2 = new Card( 14, Card.Suit.DIAMONDS);
    Card s3 = new Card(6, Card.Suit.CLUBS);
    Card s4 = new Card(7, Card.Suit.HEARTS);
    CardCollection hand = new Hand();

    @Test
    void add() {
        hand.add(s1);
        assertTrue(hand.contains(s1));
        assertEquals(2, hand.getAt(0).getRank());
    }

    @Test
    void addAll() {
        sample.addAll(Arrays.asList(s1, s2, s3, s4));
        assertTrue(hand.isEmpty());
        hand.addAll(sample);
        assertTrue(hand.isEmpty() != true);
        assertEquals(2, hand.getAt(0).getRank());
        assertEquals(14, hand.getAt(1).getRank());
        assertEquals(6, hand.getAt(2).getRank());
        assertEquals(7, hand.getAt(3).getRank());
    }

    @Test
    void addAt() {
        sample.addAll(Arrays.asList(s1, s2, s3, s4));
        hand.addAll(sample);
        assertTrue(hand.getAt(2).equals(s3));
        Card s5 = new Card(12, Card.Suit.DIAMONDS);
        hand.addAt(s5, 2);
        assertTrue(hand.getAt(2).equals(s5));
    }

    @Test
    void remove() {
        sample.addAll(Arrays.asList(s1, s2, s3, s4));
        hand.addAll(sample);
        assertTrue(hand.get().equals(s1));
        hand.remove();
        assertTrue(hand.get().equals(s2));
    }

    @Test
    void removeAll() {
        sample.addAll(Arrays.asList(s1, s2, s3, s4));
        assertEquals(0, hand.size());
        hand.addAll(sample);
        assertEquals(4, hand.size());
        hand.removeAll();
        assertEquals(0, hand.size());
    }

    @Test
    void removeAt() {
        sample.addAll(Arrays.asList(s1, s2, s3, s4));
        hand.addAll(sample);
        hand.removeAt(2);
        assertEquals(3, hand.size());
        assertTrue(hand.getAt(2).equals(s4));
    }

    @Test
    void retrieve() {
        sample.addAll(Arrays.asList(s1, s2, s3, s4));
        hand.addAll(sample);
        CardCollection hand2 = new Hand();
        assertTrue(hand.contains(s1));
        assertFalse(hand2.contains(s1));
        hand2.add(hand.retrieve());
        assertTrue(hand2.contains(s1));
        assertFalse(hand.contains(s1));
        assertEquals(Arrays.asList(s2, s3, s4), hand.getAll());
    }

    @Test
    void retrieveAt() {
    }

    @Test
    void retrieveFrom() {
    }

    @Test
    void retrieveAll() {
    }

    @Test
    void getAllBetween() {
    }

    @Test
    void shuffle() {
    }

}