package dndcompanion.character.chrraces;

public class Dragonborn extends Race{

    private String ancestry;
    /* Possible ancestries:
    Black
    Blue
    Brass
    Bronze
    Copper
    Gold
    Green
    Red
    Silver
    White
    */
    
    public Dragonborn(){
        this.name = "Dragonborn";
        this.subraces = null;
        this.mods[0] = 2; // +2 Strength
        this.mods[5] = 1; // +1 Charisma
        this.size = "Medium";
        this.speed = 30;
        this.langs = new String[]{"Common", "Draconic"};
        
    }

    public String getAncestry(){
        return ancestry;
    }

    public void setAncestry(String ancestry){
        this.ancestry = ancestry;
    }

    @Override
    public String toString(){
        return
        this.name + "{\n\t" +
        "ancestry=" + this.ancestry + "\n\t" + 
        "size=" + this.size + "\n\t" +
        "speed=" + this.speed + "\n\t" +
        "langs=" + this.langs + "\n\t" +
        "mods=" + this.mods + "\n}";
    }
} 