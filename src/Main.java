import java.util.*;


public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();

        List<Player> players  = new ArrayList<Player>();
        players.add(new Player("Bob"));
        players.add(new Player("Karen"));
        players.add(new Player("Jimmy"));

        //Dealing out the cards to the players
        for(Player player : players){
            for(int i = 0; i <7; i++){
                Card tempCard = deck.drawCard();
                player.receiveCard(tempCard);
            }
        }

        DiscardPile discardPile = new DiscardPile(deck.drawCard());
        Scanner kb = new Scanner(System.in);




        int direction = 1;
        int indexOfCurrentPlayer = 0;
        while(true){
            //Start of Turn
            discardPile.printCardOnTop();
            players.get(indexOfCurrentPlayer).printHand();

            //Get card that player wants to play from keyboard
            int cardInt = kb.nextInt();
            Card cardPlayerWantsToPlay = (players.get(0)).revealCard(cardInt);
            System.out.println(cardPlayerWantsToPlay.getColor()+ ", "+cardPlayerWantsToPlay.getType()); //for testing-- it prints out card you are trying to play

            if(cardPlayerWantsToPlay.getType() <= 9){
                String colorOnTop = discardPile.getCardOnTop().getColor();
                int numOnTop = discardPile.getCardOnTop().getType();

                if(cardPlayerWantsToPlay.getColor().equals(colorOnTop) || cardPlayerWantsToPlay.getType()==numOnTop){
                    //PLAY THE CARD
                    //put the card in the discard pile

                }

            }


            //if a reverse card is played, then change direction to direction = direction*(-1);
            indexOfCurrentPlayer = indexOfCurrentPlayer + direction;
            if(indexOfCurrentPlayer==3){
                indexOfCurrentPlayer = 0;
            }else if(indexOfCurrentPlayer==-1){
                indexOfCurrentPlayer = 2;
            }
        }








        //You might be thinking...
        // -Make a method in the deck that allows you to get a card
        // -In our main class, that's where we will keep track of **why** we are getting a card from the deck.






    }
}
