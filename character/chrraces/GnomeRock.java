package DNDCompanion.character.chrraces;

@SuppressWarnings("serial")
public class GnomeRock extends Gnome{
    
    public GnomeRock(){
        super();
        this.subraces = null;
        this.mods[2] = 1; // +1 Constitution
        this.kind = "Rock";
    }
}
