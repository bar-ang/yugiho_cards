package yugiho;

public abstract class Main{
	public static void main(String[] args){
        GameManager gameManager;

        Player me, opponent;

        Deck myDeck = new Deck();
        Deck oppDeck = new Deck();
        for(int i=0; i<15; i++){
            myDeck.pushCard(new DarkMagician());
            oppDeck.pushCard(new DarkMagician());
        }
        
        me = new Player("Bar", myDeck);
        opponent = new Player("Kaiba", oppDeck);

        gameManager = new GameManager(me, opponent);
        gameManager.initGame();
        gameManager.playInteractive();
    }
}