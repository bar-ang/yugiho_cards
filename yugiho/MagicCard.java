package yugiho;

public abstract class MagicCard extends NonMonsterCard{

	public MagicCard(String name, String desc){
        super(name, desc);
    }

	public abstract void activate(Object obj);
}
