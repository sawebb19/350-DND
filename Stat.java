package DNDCompanion;

public class Stat {
	int stat;
	int modifier;
	
	public Stat() {
		stat = 10;
		modifier = 0;
	}
	
	public void setStat(int userStat) {
		stat = userStat;
		modifier = stat/2 -5;
	}
	
	public int getStat() {
		return stat;
	}
	
	public int getMod() {
		return modifier;
	}
}
