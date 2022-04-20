package dndcompanion.character.chrclasses;

/**
 * Class for the Ranger character class.

 * @author Sam Webb
 *
 */
@SuppressWarnings("serial")
public class Ranger extends CharacterClass {
  /**
   * Constructor for Ranger Class.
   */
  public Ranger() {
    this.name = "Ranger";
    this.hit = 10;
    this.saves[0] = 1; // Strength
    this.saves[1] = 1; // Dexterity
    this.features = new String[] {
        //Level 1
        "Favored Enemy:\r\n"
        + "Beginning at 1st level, you have significant experience studying, trackin"
        + "g, hunting, and even talking to a certain type of enemy. Choose a type of"
        + " favored enemy: aberrations, beasts, celestials, constructs, dragons, ele"
        + "mentals, fey, fiends, giants, monstrosities, oozes, plants, or undead. Al"
        + "ternatively, you can select two races of humanoid (such as gnolls and orc"
        + "s) as favored enemies. You have advantage on Wisdom (Survival) checks to "
        + "track your favored enemies, as well as on Intelligence checks to recall i"
        + "nformation about them. When you gain this feature, you also learn one lan"
        + "guage of your choice that is spoken by your favored enemies, if they spea"
        + "k one at all. You choose one additional favored enemy, as well as an asso"
        + "ciated language, at 6th and 14th level. As you gain levels, your choices "
        + "should reflect the types of monsters you have encountered on your adventu"
        + "res.\r\n\r\n"
        + "Natural Explorer:\r\n"
        + "Also at 1st level, you are particularly familiar with one type of natural"
        + " environment and are adept at traveling and surviving in such regions. Ch"
        + "oose one type of favored terrain: arctic, coast, desert, forest, grasslan"
        + "d, mountain, swamp, or the Underdark. When you make an Intelligence or Wi"
        + "sdom check related to your favored terrain, your proficiency bonus is dou"
        + "bled if you are using a skill that you’re proficient in. While traveling "
        + "for an hour or more in your favored terrain, you gain the following benef"
        + "its:\r\n"
        + "- Difficult terrain doesn’t slow your group’s travel.\r\n"
        + "- Your group can’t become lost except by magical means.\r\n"
        + "- Even when you are engaged in another activity while traveling (such as "
        + "foraging, navigating, or tracking), you remain alert to danger.\r\n"
        + "- If you are traveling alone, you can move stealthily at a normal pace."
        + "\r\n"
        + "- When you forage, you find twice as much food as you normally would.\r\n"
        + "- While tracking other creatures, you also learn their exact number, thei"
        + "r sizes, and how long ago they passed through the area.\r\n"
        + "You choose additional favored terrain types at 6th and 10th level.\r\n"
        + "\r\n", 
        //Level 2
        "Fighting Style:\r\n"
        + "At 2nd level, you adopt a particular style of fighting as your specialty."
        + " Choose one of the following options. You can't take a Fighting Style opt"
        + "ion more than once, even if you later get to choose again.\r\n\r\n"
        + "Spellcasting:\r\n"
        + "By the time you reach 2nd level, you have learned to use the magical esse"
        + "nce of nature to cast spells, much as a druid does. Wisdom is your spellc"
        + "asting ability for your ranger spells, since your magic draws on your att"
        + "unement to nature. You use your Wisdom whenever a spell refers to your sp"
        + "ellcasting ability. In addition, you use your Wisdom modifier when settin"
        + "g the saving throw DC for a ranger spell you cast and when making an atta"
        + "ck roll with one.\r\n\r\n",
        //Level 3
        "Primeval Awareness:\r\n"
        + "Beginning at 3rd level, you can use your action and expend one ranger spe"
        + "ll slot to focus your awareness on the region around you. For 1 minute pe"
        + "r level of the spell slot you expend, you can sense whether the following"
        + " types of creatures are present within 1 mile of you (or within up to 6 m"
        + "iles if you are in your favored terrain): aberrations, celestials, dragon"
        + "s, elementals, fey, fiends, and undead. This feature doesn’t reveal the c"
        + "reatures’ location or number.\r\n\r\n",
        //Level 4
        "",
        //Level 5
        "Extra Attack\r\n"
        + "Beginning at 5th level, you can attack twice, instead of once, whenever y"
        + "ou take the Attack action on your turn.\r\n\r\n",
        //Level 6
        "",
        //Level 7
        "",
        //Level 8
        "Land's Stride\r\n"
        + "Starting at 8th level, moving through nonmagical difficult terrain costs "
        + "you no extra movement. You can also pass through nonmagical plants withou"
        + "t being slowed by them and without taking damage from them if they have t"
        + "horns, spines, or a similar hazard. In addition, you have advantage on sa"
        + "ving throws against plants that are magically created or manipulated to i"
        + "mpede movement, such as those created by the Entangle spell.\r\n\r\n",
        //Level 9
        "",
        //Level 10
        "Hide in Plain Sight\r\n"
        + "Starting at 10th level, you can spend 1 minute creating camouflage for yo"
        + "urself. You must have access to fresh mud, dirt, plants, soot, and other "
        + "naturally occurring materials with which to create your camouflage. Once "
        + "you are camouflaged in this way, you can try to hide by pressing yourself"
        + " up against a solid surface, such as a tree or wall, that is at least as "
        + "tall and wide as you are. You gain a +10 bonus to Dexterity (Stealth) che"
        + "cks as long as you remain there without moving or taking actions. Once yo"
        + "u move or take an action or a reaction, you must camouflage yourself agai"
        + "n to gain this benefit.\r\n\r\n",
        //Level 11
        "",
        //Level 12
        "",
        //Level 13
        "",
        //Level 14
        "Vanish\r\n"
        + "Starting at 14th level, you can use the Hide action as a bonus action on "
        + "your turn. Also, you can't be tracked by nonmagical means, unless you cho"
        + "ose to leave a trail.\r\n\r\n",
        //Level 15
        "",
        //Level 16
        "",
        //Level 17
        "",
        //Level 18
        "Feral Senses\r\n"
        + "At 18th level, you gain preternatural senses that help you fight creature"
        + "s you can't see. When you attack a creature you can't see, your inability"
        + " to see it doesn't impose disadvantage on your attack rolls against it. Y"
        + "ou are also aware of the location of any invisible creature within 30 fee"
        + "t of you, provided that the creature isn't hidden from you and you aren't"
        + " blinded or deafened.\r\n\r\n",
        //Level 19
        "",
        //Level 20
        "Foe Slayer\r\n"
        + "At 20th level, you become an unparalleled hunter of your enemies. Once on"
        + " each of your turns, you can add your Wisdom modifier to the attack roll "
        + "or the damage roll of an attack you make against one of your favored enem"
        + "ies. You can choose to use this feature before or after the roll, but bef"
        + "ore any effects of the roll are applied.\r\n\r\n"
    };
  }

  /**
   * Constructor for Ranger Class with Subclass

   * @param subclass input subclass for the player's Ranger Class.
   */
  public Ranger(String subclass) {
    if (subclass.equals("Beast Master")) {
      addFeature("Ranger's Companion:\r\n"
          + "At 3rd level, you gain a beast companion that accompanies you on your adventure"
          + "s and is trained to fight alongside you. All companion info is online, there is"
          + " a lot that won't fit here.\r\n\r\n", 3);
      addFeature("Exceptional Training:\r\n"
          + "Beginning at 7th level, on any of your turns when your beast companion doesn’t "
          + "attack, you can use a bonus action to command the beast to take the Dash, Disen"
          + "gage, or Help action on its turn. In addition, the beast’s attacks now count as"
          + " magical for the purpose of overcoming resistance and immunity to nonmagical at"
          + "tacks and damage.\r\n\r\n", 7);
      addFeature("Bestial Fury:\r\n"
          + "Starting at 11th level, when you command your beast companion to take the Attac"
          + "k action, the beast can make two attacks, or it can take the Multiattack action"
          + " if it has that action.\r\n\r\n", 11);
      addFeature("Share Spells:\r\n"
          + "Beginning at 15th level, when you cast a spell targeting yourself, you can also"
          + " affect your beast companion with the spell if the beast is within 30 feet of y"
          + "ou.\r\n\r\n", 15);
    } else if (subclass.equals("Hunter")) {
      addFeature("Hunter's Prey\r\n"
          + "At 3rd level, you gain one of the following features of your choice. Details ar"
          + "e online, no one uses Ranger anyways.\r\n"
          + "- Colossus Slayer\r\n"
          + "- Giant Killer\r\n"
          + "- Horde Breaker\r\n\r\n", 3);
      addFeature("Defensive Tactics:\r\n"
          + "At 7th level, you gain one of the following features of your choice. Details ar"
          + "e online, no one uses Ranger anyways.\r\n"
          + "- Escape the Horde\r\n"
          + "- Multiattack Defense\r\n"
          + "- Steel Will\r\n\r\n", 7);
      addFeature("Multiattack:\r\n"
          + "At 11th level, you gain one of the following features of your choice. Details a"
          + "re online, no one uses Ranger anyways.\r\n"
          + "- Volley\r\n"
          + "- Whirlwind Attack\r\n\r\n", 11);
      addFeature("Superior Hunter's Defense:\r\n"
          + "At 15th level, you gain one of the following features of your choice. Details a"
          + "re online, no one uses Ranger anyways.\r\n"
          + "- Evasion\r\n"
          + "- Stand Against the Tide\r\n"
          + "- Uncanny Dodge\r\n\r\n", 15);
    }

  }
}
