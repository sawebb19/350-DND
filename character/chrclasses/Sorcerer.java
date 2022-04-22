package dndcompanion.character.chrclasses;

/**
 * Class for the Sorcerer character class.

 * @author Sam Webb
 * @author Nick Ford
 *
 */
@SuppressWarnings("serial")
public class Sorcerer extends CharacterClass {
  /**
   * Constructor for Sorcerer Class.
   */
  public Sorcerer() {
    this.name = "Sorcerer";
    this.hit = 6;
    this.saves[2] = 1; // Constitution
    this.saves[5] = 1; // Charisma
    this.subclasses = new String[] {"", "Draconic Bloodline", "Wild Magic"};
    this.features = new String[] {
        //Level 1
        "Spellcasting:\r\n"
        + "An event in your past, or in the life of a parent or ancestor, left an in"
        + "delible mark on you, infusing you with arcane magic. This font of magic, "
        + "whatever its origin, fuels your spells. Charisma is your spellcasting abi"
        + "lity for your sorcerer spells, since the power of your magic relies on yo"
        + "ur ability to project your will into the world. You use your Charisma whe"
        + "never a spell refers to your spellcasting ability. In addition, you use y"
        + "our Charisma modifier when setting the saving throw DC for a sorcerer spe"
        + "ll you cast and when making an attack roll with one.\r\n\r\n", 
        //Level 2
        "Font of Magic:\r\n"
        + "At 2nd level, you tap into a deep wellspring of magic within yourself. Th"
        + "is wellspring is represented by sorcery points, which allow you to create"
        + " a variety of magical effects.\r\n"
        + "- Sorcery Points\r\n"
        + "- Flexible Casting\r\n"
        + "   - Creating Spell Slots\r\n"
        + "   - Converting a Spell Slot to Sorcery Points\r\n\r\n",
        //Level 3
        "Metamagic:\r\n"
        + "At 3rd level, you gain the ability to twist your spells to suit your need"
        + "s. You gain two of the following Metamagic options of your choice. You ga"
        + "in another one at 10th and 17th level. You can use only one Metamagic opt"
        + "ion on a spell when you cast it, unless otherwise noted.\r\n\r\n",
        //Level 4
        "",
        //Level 5
        "",
        //Level 6
        "",
        //Level 7
        "",
        //Level 8
        "",
        //Level 9
        "",
        //Level 10
        "",
        //Level 11
        "",
        //Level 12
        "",
        //Level 13
        "",
        //Level 14
        "",
        //Level 15
        "",
        //Level 16
        "",
        //Level 17
        "",
        //Level 18
        "",
        //Level 19
        "",
        //Level 20
        "Sorcerous Restoration:\r\n"
        + "At 20th level, you regain 4 expended sorcery points whenever you finish a"
        + " short rest.\r\n\r\n"
    };
  }

  /**
   * Constructor for Sorcerer Class with Subclass.

   * @param subclass input subclass for the player's Sorcerer Class.
   */
  public Sorcerer(String subclass) {
    this();
    if (subclass.equals("Draconic Bloodline")) {
      addFeature("Dragon Ancestor:\r\n"
          + "At 1st level, you choose one type of dragon as your ancestor. The damage type a"
          + "ssociated with each dragon is used by features you gain later. You can speak, r"
          + "ead, and write Draconic. Additionally, whenever you make a Charisma check when "
          + "interacting with dragons, your proficiency bonus is doubled if it applies to th"
          + "e check.\r\n\r\n"
          + "Draconic Resilience:\r\n"
          + "As magic flows through your body, it causes physical traits of your dragon ance"
          + "stors to emerge. At 1st level, your hit point maximum increases by 1 and increa"
          + "ses by 1 again whenever you gain a level in this class. Additionally, parts of "
          + "your skin are covered by a thin sheen of dragon-like scales. When you aren't we"
          + "aring armor, your AC equals 13 + your Dexterity modifier.\r\n\r\n", 1);
      addFeature("Elemental Affinity:\r\n"
          + "Starting at 6th level, when you cast a spell that deals damage of the type asso"
          + "ciated with your draconic ancestry, add your Charisma modifier to one damage ro"
          + "ll of that spell. At the same time, you can spend 1 sorcery point to gain resis"
          + "tance to that damage type for 1 hour.\r\n\r\n", 6);
      addFeature("Dragon Wings:\r\n"
          + "At 14th level, you gain the ability to sprout a pair of dragon wings from your "
          + "back, gaining a flying speed equal to your current speed. You can create these "
          + "wings as a bonus action on your turn. They last until you dismiss them as a bon"
          + "us action on your turn. You can't manifest your wings while wearing armor unles"
          + "s the armor is made to accommodate them, and clothing not made to accommodate y"
          + "our wings might be destroyed when you manifest them.\r\n\r\n", 14);
      addFeature("Draconic Presence:\r\n"
          + "Beginning at 18th level, you can channel the dread presence of your dragon ance"
          + "stor, causing those around you to become awestruck or frightened. As an action,"
          + " you can spend 5 sorcery points to draw on this power and exude an aura of awe "
          + "or fear (your choice) to a distance of 60 feet. For 1 minute or until you lose "
          + "your concentration (as if you were casting a concentration spell), each hostile"
          + " creature that starts its turn in this aura must succeed on a Wisdom saving thr"
          + "ow or be charmed (if you chose awe) or frightened (if you chose fear) until the"
          + " aura ends. A creature that succeeds on this saving throw is immune to your aur"
          + "a for 24 hours.\r\n\r\n", 18);
    } else if (subclass.equals("Wild Magic")) {
      addFeature("Wild Magic Surge:\r\n"
          + "Starting when you choose this origin at 1st level, your spellcasting can unleas"
          + "h surges of untamed magic. Once per turn, the DM can have you roll a d20 immedi"
          + "ately after you cast a sorcerer spell of 1st level or higher. If you roll a 1, "
          + "roll on the Wild Magic Surge table to create a magical effect. If that effect i"
          + "s a spell, it is too wild to be affected by your Metamagic, and if it normally "
          + "requires concentration, it doesn't require concentration in this case; the spel"
          + "l lasts for its full duration.\r\n\r\n"
          + "Tides of Chaos:\r\n"
          + "Starting at 1st level, you can manipulate the forces of chance and chaos to gai"
          + "n advantage on one attack roll, ability check, or saving throw. Once you do so,"
          + " you must finish a long rest before you can use this feature again. Any time be"
          + "fore you regain the use of this feature, the DM can have you roll on the Wild M"
          + "agic Surge table immediately after you cast a sorcerer spell of 1st level or hi"
          + "gher. You then regain the use of this feature.\r\n\r\n", 1);
      addFeature("Bend Luck:\r\n"
          + "Starting at 6th level, you have the ability to twist fate using your wild magic"
          + ". When another creature you can see makes an attack roll, an ability check, or "
          + "a saving throw, you can use your reaction and spend 2 sorcery points to roll 1d"
          + "4 and apply the number rolled as a bonus or penalty (your choice) to the creatu"
          + "re's roll. You can do so after the creature rolls but before any effects of the"
          + " roll occur.\r\n\r\n", 6);
      addFeature("Controlled Chaos:\r\n"
          + "At 14th level, you gain a modicum of control over the surges of your wild magic"
          + ". Whenever you roll on the Wild Magic Surge table, you can roll twice and use e"
          + "ither number.\r\n\r\n", 14);
      addFeature("Spell Bombardment:\r\n"
          + "Beginning at 18th level, the harmful energy of your spells intensifies. When yo"
          + "u roll damage for a spell and roll the highest number possible on any of the di"
          + "ce, choose one of those dice, roll it again and add that roll to the damage. Yo"
          + "u can use the feature only once per turn.\r\n\r\n", 18);
    }

  }
}
