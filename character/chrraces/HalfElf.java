package dndcompanion.character.chrraces;

/**
 * Class to represent the Half-Elf Race.

 * @author Sam Webb
 *
 */
@SuppressWarnings("serial")
public class HalfElf extends Race {
    
	/**
	 * Default Constructor for the class.
	 */
    public HalfElf() {
        this.name = "Half-Elf";
        this.mods[5] = 2; // + 2 Charisma && +1 of Choice
        this.subraces = null;
        this.size = "Medium";
        this.speed = 30;
        this.langs = new String[]{"Cmoon", "Elvish"}; // +1 of choice

    }

	@Override
	public String getSubrace() {
		// TODO Auto-generated method stub
		return null;
	}
}
