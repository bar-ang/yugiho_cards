package yugiho;

public class LifePoints extends MonsterSlot{
	public int lifePoints;
	public final int lifePointsStartValue = 4000;

	public LifePoints(){
		this.lifePoints = lifePointsStartValue;
	}
	public LifePoints(int lifePointsStartValue){
		this.lifePoints = lifePointsStartValue;
	}
}