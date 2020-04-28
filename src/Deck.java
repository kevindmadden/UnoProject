import java.util.*;

public class Deck {

    List<Card> drawPile;
    //we need something that will put all the cards back in the deck to shuffle

    public Deck(){
        drawPile = new ArrayList<Card>();
        //Card tempCard = new Card("red",0);
        //drawPile.add(tempCard);
        drawPile.add(new Card("red",0)); //so this is equivalent to the above two lines
        drawPile.add(new Card("red",1));


        //loop through four colors: red, yellow, green, blue
        //loop through card types: 1 - 12

        String colors[] = {"red", "yellow", "green", "blue"};

        for(String color : colors){
            drawPile.add(new Card(color, 0)); //card type 0 has only 1 copy for each color
        }

        for(int i=1; i<=12; i++){
            for(String color : colors){
                drawPile.add(new Card(color,i));
                drawPile.add(new Card(color,i)); //card types 1 to 12 have 2 copies for each color
            }
        }



        //two wild type cards
        for(int count = 1; count <=4; count++){
            drawPile.add(new Card(null,13));
            drawPile.add(new Card(null,14));
        }

        //from here...
        //(1)We could start working on the logic of the game (so implementing things like only being able to play a card if it matches in number of color)
        //
        // Right now we only have a deck of cards! So.... the players need the cards!
        // --Not only do we want to distribute the cards, we also want to randomly
        // --We want to randomize the order of the cards in our deck!
        //   --(Most people call that shuffling!)

        // (1) Randomizing the order of the deck of cards.
                //--In order to do this use Math.random()--> this is going to involve randomly generating numbers 1 to 14 and also numbers for each color
                //--Be really really careful that you don't eliminate any of the cards!
                //    (I would recommend printing out the cards in the deck once you shuffle just to check that you didn't delete any of them!)
        // (2) Start thinking about how you would hand out these cards to the different players.

    }

}
