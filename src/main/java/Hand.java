import java.util.ArrayList;
import java.util.List;

//TODO include error/input checks on applicable methods

public class Hand implements CardCollection{

    private List<Card> collection;

    public Hand(List<Card> collection) {
        this.collection = collection;
    }

    public Hand() {
        this.collection = new ArrayList<>();
    }

    @Override
    public void add(Card card) {
        collection.add(0, card);
    }

    @Override
    public void addAll(List<Card> cards) {
        collection.addAll(0, cards);
    }

    @Override
    public void addAt(Card card, int index) {
        collection.add(index, card);
    }

    @Override
    public void remove() {
        collection.remove(0);
    }

    @Override
    public void removeAll() {
        collection.clear();
    }

    @Override
    public void removeAt(int index) {
        collection.remove(index);
    }

    @Override
    public Card retrieve() {
        return collection.remove(0);
    }

    @Override
    public Card retrieveAt(int index) {
        return collection.remove(index);
    }

    @Override
    public List<Card> retrieveFrom(int start, int endAt) {
        List<Card> t = new ArrayList<>();
        for(int i = start; i < endAt; i++){
            t.add(collection.remove(i));
        }
        return t;
    }

    @Override
    public List<Card> retrieveAll() {
        List<Card> t = new ArrayList<>();
        while(collection.isEmpty() != true){
            t.add(collection.remove(0));
        }
        return t;
    }

    @Override
    public Card get() {
        return collection.get(0);
    }

    @Override
    public Card getAt(int index) {
        return collection.get(index);
    }

    @Override
    public List<Card> getAll() {
        return collection;
    }

    @Override
    public List<Card> getAllBetween(int start, int endAt) {
        return collection.subList(start, endAt);
    }

    @Override
    public int size() {
        return collection.size();
    }

    @Override
    public boolean shuffle() {
        return false;
    }

    @Override
    public boolean contains(Card card) {
        for(Card c: collection){
            if(c.equals(card)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        if (this.collection.isEmpty() == true){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        StringBuilder line = new StringBuilder();
        for(Card cards : collection){
            line.insert(0, cards.toString() + "\n");
        }
        return line.toString();
    }
}
