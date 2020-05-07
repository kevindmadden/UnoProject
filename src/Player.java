import java.util.*;

public class Player {

    //A way to keep track of their cards
    private List<Card> hand;
    private boolean isTurn;
    private boolean isShoutingUno;
    private String name;

    public Player(String name){
        this.name = name;
        hand = new ArrayList<Card>();
    }

    public void receiveCard(Card card){
        hand.add(card);
    }

    public Card revealCard(int cardChoice){
        return hand.get(cardChoice);
    }

    public void printHand(){
        for(int i=0; i < hand.size(); i++){
            System.out.println(i+".) "+hand.get(i).getColor()+" "+hand.get(i).getType());
        }
    }







}
