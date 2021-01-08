import java.util.List;

public interface CardCollection {
    //Card collection that provides an interface for things such as the primary deck, players active hand or discard pile, etc.

    /**
     * Adds a card to the top of the collection (at the index of 0)
     * @param card
     */
    public void add(Card card);

    /**
     * Adds every card in a given list to the end of the current collection/bottom of the collection
     * @param cards
     */
    public void addAll(List<Card> cards);

    /**
     * Adds the given card at the specified index of the collection.
     * @param card
     * @param index
     */
    public void addAt(Card card, int index);

    /**
     * Removes the card at the top of the collection (index of 0)
     */
    public void remove();

    /**
     * Removes all cards from the collection
     */
    public void removeAll();

    /**
     * Removes the card at the given index from the collection
     * @param index
     */
    public void removeAt(int index);

    public Card retrieve();

    public Card retrieveAt(int index);

    public List<Card> retrieveFrom(int start, int endAt);

    public List<Card> retrieveAll();

    /**
     * Returns the card at the top of the deck (at the index of 0)
     * @return Card at index of zero
     */
    public Card get();

    /**
     * Returns the card at the given index.
     * @param index
     * @return Card at the given index
     * @throws IndexOutOfBoundsException if the index requested is negative or is larger then size of the array
     */
    public Card getAt(int index);

    /**
     * Returns a list of all cards present in the collection
     * @return List of all cards in the collection
     */
    public List<Card> getAll();

    /**
     * Returns a list of all cards from a given index up until a given index
     * @param start
     * @param endAt
     * @return List of cards between the given range
     */
    public List<Card> getAllBetween(int start, int endAt);

    /**
     * Returns the size of the collection
     * @return size of collection
     */
    public int size();

    /**
     * Shuffles the collection using a rifle shuffling method
     * @return True if deck was not empty and was successfully shuffled
     */
    public boolean shuffle();

    /**
     * Returns true if the collection contains the given card
     * @param card
     * @return True if collection contains card
     */
    public boolean contains(Card card);

    /**
     * Returns true if the collection is empty
     * @return true if the collection is empty, false if the collection contains cards
     */
    public boolean isEmpty();


}
