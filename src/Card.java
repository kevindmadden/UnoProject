public class Card {

    private String color; //applicable for all cards except wild cards
    private int type; //10 - skip, 11 - reverse, 12 - draw 2 cards, 13 - wild cards, 14 - wild draw 4 cards

    public Card(String color, int type){
        this.color = color;
        this.type = type;
    }


}
