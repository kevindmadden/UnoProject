import java.util.*;

public class Deck {

    List<Card> drawPile;
    //we need something that will put all the cards back in the deck to shuffle

    public Deck(){
        drawPile = new ArrayList<Card>(); //initializing the ArrayList made up of Card Onjects

        //loop through four colors: red, yellow, green, blue
        //loop through card types: 1 - 12
        String colors[] = {"red", "yellow", "green", "blue"};

        //Adding Cards to the Deck that we are creating
        for(String color : colors){
            drawPile.add(new Card(color, 0)); //card type 0 has only 1 copy for each color
        }

        //
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


        //Shuffle Deck by ranodomly swapping two cards
        int counter = 0;
        while(true){
            counter ++;
            if(counter > 1000000){
                break;
            }
            int randCard1Index = (int) (Math.random()*108); //indeces of our cards are from 0 to 109
            int randCard2Index = (int) (Math.random()*108); //indeces of our cards are from 0 to 109

            //swapping two cards in the deck
            Card tempCard1 = drawPile.get(randCard1Index);
            drawPile.set(randCard1Index, drawPile.get(randCard2Index));
            drawPile.set(randCard2Index, tempCard1);
        }

        //Find a random type and color combo
        //int randType = (int)(Math.random() * 15);
        //String randColor = colors[(int)(Math.random()*4)];
    }

    public Card drawCard(){
        Card tempCard = drawPile.remove(0);
        return tempCard;
    }

    public void printDeck(){
        for(int i = 0; i < drawPile.size(); i++){
            System.out.print( drawPile.get(i).getColor() );
            System.out.print( drawPile.get(i).getType() );
            System.out.println();
        }
    }

}
