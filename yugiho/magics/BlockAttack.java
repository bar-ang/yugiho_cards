package yugiho.magics;

public class BlockAttack extends MagicCard{
    public BlockAttack(){
        super("Block Attack", "Select 1 of your opponent's monsters and shift it into Defense Possition");
    }
	public void activate(Object obj){
        FieldSlot slot = (FieldSlot)obj;
        slot.position = Position.DEFENSE_FACE_UP;
    }
}
