package yugiho;

public abstract class FieldSlot{
	public Card card;
	public Position position;

	public FieldSlot(Card card, Position position){
		this.card = card;
		this.position = position;
	}
	public FieldSlot(Card card){
		this(card, Position.FACE_UP);
	}
	public FieldSlot(){
		this(null, Position.FACE_UP);
	}

	public void setPosition(Position position){
		this.position = position;
	}

	public void changePosition(){
		switch(this.position){
			case FACE_DOWN:
			case DEFENSE_FACE_UP:
				this.position = Position.FACE_UP;
			case FACE_UP:
				this.position = Position.DEFENSE_FACE_UP;
			default:
				break;
		}
	}
}

enum Position{
	FACE_UP, FACE_DOWN, DEFENSE_FACE_UP
}