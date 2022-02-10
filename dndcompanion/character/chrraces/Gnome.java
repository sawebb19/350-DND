package dndcompanion.character.chrraces;

public abstract class
Gnome extends Subrace {

    protected Gnome(){
        this.name = "Gnome";
        this.subraces = new String[]{"Deep", "Rock"};
        this.mods[3] = 2; // +2 Intelligence
        this.size = "Small";
        this.speed = 25;
        this.langs = new String[]{"Common", "Gnomish"};

    }
}
