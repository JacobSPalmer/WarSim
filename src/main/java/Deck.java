import java.util.ArrayList;
import java.util.List;
import java.util.function.ToDoubleBiFunction;

//TODO create an abstract interface for a collection of cards so hand, decks, table, discard, etc. can all have abstraction
public class Deck{

    List<Card> deck;
    int max_rank = Card.getMAX_RANK();
    int min_rank = Card.getMIN_RANK();

    public Deck(){
        populate();
    }

    public void populate(){
        empty();
        deck = new ArrayList<>();
        Card.Suit[] suits = Card.getSuits();
        for(Card.Suit suit: suits){
            for(int i = min_rank; i <= max_rank; i++){
                deck.add(new Card(i, suit));
            }
        }
    }

    public void transferFromBottom(List<Card> recipient) {
        //transfers the bottom most card (n = 0) from the host deck to the top of the recipient deck (n = deck size)
    }

//    public boolean shuffle(){
//        if(this.deck.isEmpty() == false){
//            List<Card> deck_top;
//            List<Card> deck_bottom;
//            int n = this.deckSize();
//            List<Card> s_deck = ArrayList<>();
//            if(this.deck.size() % 2 != 0){
//                deck_top = this.deck.subList(0, n/2);
//                deck_bottom = this.deck.subList(n/2, n);
//                //TODO add in transferFromBottomHere
//            }
//            deck_top = this.deck.subList(0, (n-1)/2);
//            deck_bottom = this.deck.subList((n-1)/2, n);
//            }
//        }
//
//    }

    public void empty(){
        if(this.deck.isEmpty()){
            throw new RuntimeException("Deck is already empty.");
        }
        this.deck.clear();
    }

    //deck stats

    public boolean searchDeck (Card card){
        for(Card t: deck){
            if(t.equals(card)){
                return true;
            }
        }
        return false;
    }

    public int deckSize(){
        return this.getDeckList().size();
    }

    //getters and setters

    public List<Card> getDeckList(){
        return this.deck;
    }

    //class functions

    @Override
    public String toString(){
        StringBuilder line = new StringBuilder();
        for(Card cards : this.deck){
            line.insert(0, cards.toString() + "\n");
        }
        return line.toString();
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println(deck.toString());
        Card card1 = new Card(13, Card.Suit.SPADES);
        System.out.println(deck.searchDeck(card1));
//        deck.empty();
//        System.out.println(deck.toString());
//        System.out.println(deck.searchDeck(card1));
    }
}
