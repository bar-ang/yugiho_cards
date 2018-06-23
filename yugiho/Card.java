package yugiho;

public abstract class Card{
	public String name;
	public String desc;

	public Card(String name, String desc){
		this.name = name;
		this.desc = desc;
	}

	public Card(){
		this.name = "";
		this.desc = "";
	}

	@Override
	public String toString(){
		return Printer.asciiCard(name, desc);
	}
}