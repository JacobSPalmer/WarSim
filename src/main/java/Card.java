import static java.util.Map.entry;
import java.util.Map;

public class Card {

    public enum Suit {
        SPADES, DIAMONDS, HEARTS, CLUBS
    }

    private Map<Integer, String> RankNames = Map.ofEntries(
            entry(14, "ace"),
            entry(13, "king"),
            entry(12, "queen"),
            entry(11, "jack"),
            entry(10, "ten"),
            entry(9, "nine"),
            entry(8, "eight"),
            entry(7, "seven"),
            entry(6, "six"),
            entry(5, "five"),
            entry(4, "four"),
            entry(3, "three"),
            entry(2, "two")
    );

    public static int MAX_RANK = 14;
    public static int MIN_RANK = 2;

    private Suit suit;
    private int rank;
    private String rankName;

    public Card(int rank, Suit suit){
        setSuit(suit);
        setRank(rank);
        setRankName(rank);
    }

    public void setSuit(Suit suit){
        if(suit == null){
            throw new RuntimeException("Suit must be either Spades, Diamonds, Hearts, or Clubs!");
        }
        this.suit = suit;
    }

    public Suit getSuit(){
        return this.suit;
    }

    public void setRank(int rank){
        if(rank < MIN_RANK || rank > MAX_RANK){
            throw new RuntimeException(
                    String.format("Invalid rank: %d (value must be between %d and %d)",
                            rank, MIN_RANK, MAX_RANK));
        }
        this.rank = rank;
    }

    public int getRank(){
        return this.rank;
    }

    public void setRankName(int rank){
        if(RankNames.containsKey(rank) == false){
            throw new RuntimeException(
                    String.format("Invalid rank: %d (value must be between %d and %d)",
                            rank, MIN_RANK, MAX_RANK));
        }
        this.rankName = RankNames.get(rank);
    }

    public String getRankName(){
        return this.rankName;
    }

    public static int getMAX_RANK() {
        return MAX_RANK;
    }

    public static int getMIN_RANK() {
        return MIN_RANK;
    }

    public static Suit[] getSuits(){
        return Suit.values();
    }

    @Override
    public String toString(){
        return String.format("%s of %s; Value %d", this.rankName, this.suit.toString().toLowerCase(), this.rank);
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(obj.getClass() != this.getClass()){
            return false;
        }
        Card objC = (Card) obj;
        return objC.getRank() == this.getRank() && objC.getSuit() == this.getSuit();
    }

    public static void main(String[] args) {
        Card card1 = new Card(13, Suit.SPADES);
        System.out.println(card1);
//        System.out.println(card1.getSuits());
//        main.Card card2 = new main.Card(13, Suit.SPADES);
//        System.out.println(card1.equals(card2));
    }


}

