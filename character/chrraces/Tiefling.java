package DNDCompanion.character.chrraces;

public class Tiefling extends Race{

    public Tiefling(){
        this.name = "Tiefling";
        this.subraces = null;
        this.mods[3] = 1; // +1 Intelligence
        this.mods[5] = 2; // +2 Charisma
        this.size = "Medium";
        this.speed = 30;
        this.langs = new String[]{"Common", "Infernal"};
    }

	@Override
	public String getSubrace() {
		// TODO Auto-generated method stub
		return null;
	}
    
}
