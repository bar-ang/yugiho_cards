package yugiho;

public class Field{
	public final int max_cards_on_field = 4;
	public FieldSlot[] monsters;
	public FieldSlot[] nonMonsters;

	public Field(){
		monsters = new FieldSlot[max_cards_on_field];
		nonMonsters = new FieldSlot[max_cards_on_field];
	}
	
}