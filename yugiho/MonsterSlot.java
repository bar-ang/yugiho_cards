package yugiho;

public class MonsterSlot extends FieldSlot{
	public MonsterSlot(MonsterCard card, Position position){
		super(card, position);
	}
	public MonsterSlot(MonsterCard card){
		super(card);
	}
	public MonsterSlot(){
		super();
	}
	
	public int attack(MonsterSlot monster){
		return 0;	
	}

}
