package yugiho;

import java.util.*;

public class Deck{
	public Stack<Card> cards;

    public Deck(){
        cards = new Stack<Card>();
    }
    public void pushCard(Card card){
        cards.push(card);
    }
    public Card drawCard(){
        return cards.pop();
    }
    public void shuffle(){
        //TODO: complete this method
        return;
    }
}