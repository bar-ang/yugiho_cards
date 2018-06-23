package yugiho;

public abstract class MonsterCard extends Card{
	public int atk;
	public int def;
	public int stars;

	public MonsterCard(String name, String desc, int atk, int def, int stars){
		super(name, desc);
		this.atk = atk;
		this.def = def;
		this.stars = stars;
	}

	@Override
	public String toString(){
		return Printer.asciiCard(name, desc, stars, atk, def);
	}
}
