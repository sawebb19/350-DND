package dndcompanion.character.chrclasses;

/**
 * Class for the Barbarian character class.

 * @author Sam Webb
 * @author Nick Ford
 *
 */
@SuppressWarnings("serial")
public class Barbarian extends CharacterClass {
  /**
   * Constructor for Barbarian Class.
   */
  public Barbarian() {
    this.name = "Barbarian";
    this.hit = 12;
    this.saves[0] = 1; // Strength
    this.saves[2] = 1; // Constitution
    this.features = new String[] {//Level 1
        "Rage:\r\n" 
        + "On your turn, you can enter a rage as a bonus action that lasts for 1 minut"
        + "e or if you are knocked unconscious or if your turn ends and you haven't at"
        + "tacked a hostile creature since your last turn or taken damage since then."
        + "\r\n\r\n"
        + "While raging, you gain the following benefits if you aren't wearing heavy a"
        + "rmor:\r\n"
        + "-Advantage on Strength checks and Strength saving throws.\r\n"
        + "-When you make a melee weapon attack using Strength, you gain a bonus to th"
        + "e damage roll that increases as you gain levels as a barbarian, as shown in"
        + " the Rage Damage column of the Barbarian table.\r\n"
        + "-You have resistance to bludgeoning, piercing, and slashing damage.\r\n"
        + "If you are able to cast spells, you can't cast them or concentrate on them "
        + "while raging. Once you have raged the number of times shown for your barbar"
        + "ian level in the Rages column of the Barbarian table, you must finish a lon"
        + "g rest before you can rage again.\r\n\r\n"
        + "Unarmored Defense:\r\n"
        + "While you are not wearing any armor, your armor class equals 10 + your Dext"
        + "erity modifier + your Constitution modifier. You can use a shield and still"
        + " gain this benefit.\r\n"
        + "\r\n", 
        //Level 2
        "Danger Sense:\r\n"
        + "At 2nd level, you gain an uncanny sense of when things nearby aren't as the"
        + "y should be, giving you an edge when you dodge away from danger. You have a"
        + "dvantage on Dexterity saving throws against effects that you can see, such "
        + "as traps and spells. To gain this benefit, you can't be blinded, deafened, "
        + "or incapacitated.\r\n\r\n"
        + "Reckless Attack:\r\n"
        + "Starting at 2nd level, you can throw aside all concern for defense to attac"
        + "k with fierce desperation. When you make your first attack on your turn, yo"
        + "u can decide to attack recklessly. Doing so gives you advantage on melee we"
        + "apon attack rolls using Strength during this turn, but attack rolls against"
        + " you have advantage until your next turn.\r\n\r\n",
        //Level 3
        "",
        //Level 4
        "",
        //Level 5
        "Extra Attack:\r\n"
        + "Beginning at 5th level, you can attack twice, instead of once, whenever you"
        + " take the Attack action on your turn.\r\n\r\n"
        + "Fast Movement:\r\n"
        + "Starting at 5th level, your speed increases by 10 feet while you aren't wea"
        + "ring heavy armor.\r\n\r\n",
        //Level 6
        "",
        //Level 7
        "Feral Instinct:\r\n"
        + "By 7th level, your instincts are so honed that you have advantage on "
        + "initiative rolls. Additionally, if you are surprised at the beginning "
        + "of combat and aren't incapacitated, you can act normally on your first "
        + "turn, but only if you enter your rage before doing anything else on that"
        + " turn.\r\n\r\n",
        //Level 8
        "",
        //Level 9
        "Brutal Critical:\r\n"
        + "Beginning at 9th level, you can roll one additional weapon damage die "
        + "when determining the extra damage for a critical hit with a melee "
        + "attack. This increases to two additional dice at 13th level and three "
        + "additional dice at 17th level.\r\n\r\n",
        //Level 10
        "",
        //Level 11
        "Relentless Rage:\r\n"
        + "Starting at 11th level, your rage can keep you fighting despite grievous "
        + "wounds. If you drop to 0 hit points while you're raging and don't die "
        + "outright, you can make a DC 10 Constitution saving throw. If you succeed,"
        + " you drop to 1 hit point instead. Each time you use this feature after the "
        + "first, the DC increases by 5. When you finish a short or long rest, the "
        + "DC resets to 10.\r\n\r\n",
        //Level 12
        "",
        //Level 13
        "",
        //Level 14
        "",
        //Level 15
        "Persistent Rage:\r\n"
        + "Beginning at 15th level, your rage is so fierce that it ends early only if "
        + "you fall unconscious or if you choose to end it.\r\n\r\n",
        //Level 16
        "",
        //Level 17
        "",
        //Level 18
        "Indomitable Might:\r\n"
        + "Beginning at 18th level, if your total for a Strength check is less than "
        + "your Strength score, you can use that score in place of the total.\r\n\r\n",
        //Level 19
        "",
        //Level 20
        "Primal Champion:\r\n"
        + "At 20th level, you embody the power of the wilds. Your Strength and "
        + "Constitution scores increase by 4. Your maximum for those scores is "
        + "now 24.\r\n\r\n"
    };
  }

  /**
   * Constructor for Barbarian Class with Subclass.

   * @param subclass input subclass for the player's Barbarian Class.
   */
  public Barbarian(String subclass) {
    this();
    if (subclass.equals("Berserker")) {
      addFeature("Frenzy:\r\n"
          + "Starting when you choose this path at 3rd level, you can go into a "
          + "frenzy when you rage. If you do so, for the duration of your rage you "
          + "can make a single melee weapon attack as a bonus action on each of "
          + "your turns after this one. When your rage ends, you suffer one level "
          + "of exhaustion.\r\n\r\n", 3);
      addFeature("Mindless Rage:\r\n"
          + "Beginning at 6th level, you can't be charmed or frightened while "
          + "raging. If you are charmed or frightened when you enter your rage, the "
          + "effect is suspended for the duration of the rage.\r\n\r\n", 6);
      addFeature("Intimidating Presence:\r\n"
          + "Beginning at 10th level, you can use your action to frighten someone "
          + "with your menacing presence. When you do so, choose one creature that "
          + "you can see within 30 feet of you. If the creature can see or hear you, "
          + "it must succeed on a Wisdom saving throw (DC equal to 8 + your "
          + "proficiency bonus + your Charisma modifier) or be frightened of you "
          + "until the end of your next turn. On subsequent turns, you can use your "
          + "action to extend the duration of this effect on the frightened creature "
          + "until the end of your next turn. This effect ends if the creature ends "
          + "its turn out of line of sight or more than 60 feet away from you. If "
          + "the creature succeeds on its saving throw, you can't use this feature on "
          + "that creature again for 24 hours.\r\n\r\n", 10);
      addFeature("Retaliation:\r\n"
          + "Starting at 14th level, when you take damage from a creature that is "
          + "within 5 feet of you, you can use your reaction to make a melee weapon "
          + "attack against that creature.\r\n\r\n", 14);
    } else if (subclass.equals("Totem Warrior")) {
      addFeature("Spirit Seeker:\r\n"
          + "Yours is a path that seeks attunement with the natural world, giving "
          + "you a kinship with beasts. At 3rd level when you adopt this path, you "
          + "gain the ability to cast the Beast Sense and Speak with Animals spells, "
          + "but only as rituals.\r\n\r\n"
          + "Totem Spirit:\r\n"
          + "At 3rd level, when you adopt this path, you choose a totem spirit and "
          + "gain its feature. You must make or acquire a physical totem object – an "
          + "amulet or similar adornment – that incorporates fur or feathers, claws, "
          + "teeth, or bones of the totem animal. At your option, you also gain "
          + "minor physical attributes that are reminiscent of your totem spirit. "
          + "For example, if you have a bear totem spirit, you might be unusually "
          + "hairy and thick-skinned, or if your totem is the eagle, your eyes "
          + "turn bright yellow.\r\n\r\n", 3);
      addFeature("Aspect of the Beast:\r\n"
          + "At 6th level, you gain a magical benefit based on the totem animal "
          + "of your choice. You can choose the same animal you selected at 3rd "
          + "level or a different one.\r\n\r\n", 6);
      addFeature("Spirit Walker:\r\n"
          + "At 10th level, you can cast the Commune with Nature spell, but only "
          + "as a ritual. When you do so, a spiritual version of one of the "
          + "animals you chose for Totem Spirit or Aspect of the Beast appears to "
          + "you to convey the information you seek.\r\n\r\n", 10);
      addFeature("Totemic Attunement:\r\n"
          + "At 14th level, you gain a magical benefit based on a totem animal of "
          + "your choice. You can choose the same animal you selected previously "
          + "or a different one.\r\n\r\n", 14);
    }
  }
}
