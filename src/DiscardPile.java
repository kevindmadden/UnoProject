import java.util.*;

public class DiscardPile {

    List<Card> discardPile;

    public DiscardPile(Card cardOnTop){
        discardPile = new ArrayList<Card>();
        discardPile.add(cardOnTop);
    }

    //MAKE SURE TO ADD NEW CARDS TO DECK AT INDEX 0
    public void printCardOnTop(){
        System.out.println("Discard Pile: "+discardPile.get(0).getColor()+ " "+discardPile.get(0).getType());
    }

    public Card getCardOnTop(){
        return discardPile.get(0);
    }

    // -what's the current color?
    // -what's the current number/type of card?
    // how many cards are in the pile?

}
