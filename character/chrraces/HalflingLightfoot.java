package DNDCompanion.character.chrraces;

@SuppressWarnings("serial")
public class HalflingLightfoot extends Halfling{
    
    public HalflingLightfoot(){
        super();
        this.subraces = null;
        this.mods[5] = 1; // +1 Charisma
        this.kind = "Lightfoot";
    }
}
