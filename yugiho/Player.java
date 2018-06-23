package yugiho;

import java.util.*;

public class Player{
    public String name;
    public Deck deck;
	public Graveyard graveyard;
    public Field field;
    public LifePoints lifePoints;
    public List<Card> hand;

    public Player(String name, Deck deck){
        this.name = name;
        this.deck = deck;
        this.field = new Field();
        this.graveyard = new Graveyard();
        this.lifePoints = new LifePoints();
        this.hand = new ArrayList<Card>();
    }

    public String showHand(){
        String output = "";
        for(Card card : hand){
            output += card.toString();
        }
        return output;
    }
}