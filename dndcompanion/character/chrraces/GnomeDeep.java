package dndcompanion.character.chrraces;

public class GnomeDeep extends Gnome{
    
    public GnomeDeep(){
        super();
        this.subraces = null;
        this.mods[1] = 1; // +1 Dexterity
        this.langs = new String[]{"Common", "Gnomish", "Undercommon"};
        this.kind = "Deep";
    }
}
