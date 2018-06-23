package yugiho;

public class GameManager{
	public Player me;
    public Player opponent;

    public GameManager(Player me, Player opponent){       
        this.me = me;
        this.opponent = opponent;
    }

    public void initGame(){
        for(int i=0;i<5;i++){
            me.hand.add(me.deck.drawCard());
            opponent.hand.add(opponent.deck.drawCard());
        }
    }
    private void playInteractive(){
        playInteractive(Phase.DRAW);
    }

    private void playInteractive(Phase phase){
        switch(phase){
            case DRAW:
                me.hand.add(me.deck.drawCard());
                phase
                break;
            case STAND_BY
        }
    }
}
enum Phase{
    DRAW,
    STAND_BY,
    MAIN_1,
    BATTLE,
    MAIN_2,
    END
}