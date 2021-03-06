package dndcompanion.character.chrclasses;

/**
 * Class for the Fighter character class.

 * @author Sam Webb
 * @author Nick Ford
 *
 */
@SuppressWarnings("serial")
public class Fighter extends CharacterClass {
  /**
   * Constructor for Fighter Class.
   */
  public Fighter() {
    this.name = "Fighter";
    this.hit = 10;
    this.saves[0] = 1; // Strength
    this.saves[2] = 1; // Constitution
    this.subclasses = new String[] {"Battle Master", "Champion", "Eldritch Knight"};
    this.features = new String[] {
        //Level 1
        "Fighting Style:\r\n"
        + "You adopt a particular style of fighting as your specialty. Choose one of "
        + "the following options. You can't take a Fighting Style option more than "
        + "once, even if you later get to choose again.\r\n\r\n"
        + "Second Wind\r\n"
        + "You have a limited well of stamina that you can draw on to protect yourself "
        + "from harm. On your turn, you can use a bonus action to regain hit points "
        + "equal to 1d10 + your fighter level. Once you use this feature, you must "
        + "finish a short or long rest before you can use it again.\r\n\r\n", 
        //Level 2
        "Action Surge\r\n"
        + "Starting at 2nd level, you can push yourself beyond your normal limits for "
        + "a moment. On your turn, you can take one additional action. Once you use "
        + "this feature, you must finish a short or long rest before you can use it "
        + "again. Starting at 17th level, you can use it twice before a rest, but "
        + "only once on the same turn.\r\n\r\n",
        //Level 3
        "",
        //Level 4
        "",
        //Level 5
        "Extra Attack\r\n"
        + "Beginning at 5th level, you can attack twice, instead of once, whenever you "
        + "take the Attack action on your turn. The number of attacks increases to "
        + "three when you reach 11th level in this class and to four when you reach "
        + "20th level in this class.\r\n\r\n",
        //Level 6
        "",
        //Level 7
        "",
        //Level 8
        "",
        //Level 9
        "Indomitable\r\n"
        + "Beginning at 9th level, you can reroll a saving throw that you fail. If "
        + "you do so, you must use the new roll, and you can't use this feature "
        + "again until you finish a long rest. You can use this feature twice "
        + "between long rests starting at 13th level and three times between long "
        + "rests starting at 17th level.\r\n\r\n",
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
        ""
    };
  }

  /**
   * Constructor for Fighter Class with Subclass.

   * @param subclass input subclass for the player's Fighter Class.
   */
  public Fighter(String subclass) {
    this();
    if (!subclass.equals("")) {
      this.subclass = subclass;
    }
    if (subclass.equals("Battle Master")) {
      addFeature("Combat Superiority:\r\n"
          + "When you choose this archetype at 3rd level, you learn maneuvers that "
          + "are fueled by special dice called superiority dice. You learn three ma"
          + "neuvers of your choice. Many maneuvers enhance an attack in some way. "
          + "You can use only one maneuver per attack. You learn two additional mane"
          + "uvers of your choice at 7th, 10th, and 15th level. Each time you learn "
          + "new maneuvers, you can also replace one maneuver you know with a differ"
          + "ent one. You have four superiority dice, which are d8s. A superiority d"
          + "ie is expended when you use it. You regain all of your expended superio"
          + "rity dice when you finish a short or long rest. You gain another superi"
          + "ority die at 7th level and one more at 15th level. Some of your maneuve"
          + "rs require your target to make a saving throw to resist the maneuver's "
          + "effects. The saving throw DC is calculated as follows: Maneuver save DC"
          + " = 8 + your proficiency bonus + your Strength or Dexterity modifier (yo"
          + "ur choice)\r\n\r\n"
          + "Student of War:\r\n"
          + "At 3rd level, you gain proficiency with one type of artisan's tools of "
          + "your choice.\r\n\r\n", 3);
      addFeature("Know Your Enemy:\r\n"
          + "Starting at 7th level, if you spend at least 1 minute observing or inte"
          + "racting with another creature outside combat, you can learn certain inf"
          + "ormation about its capabilities compared to your own. The DM tells you "
          + "if the creature is your equal, superior, or inferior in regard to two c"
          + "haracteristics of your choice.\r\n\r\n", 7);
      addFeature("Improved Combat Superiority:\r\n"
          + "At 10th level, your superiority dice turn into d10s. At 18th level, the"
          + "y turn into d12s.\r\n\r\n", 10);
      addFeature("Relentless:\r\n"
          + "Starting at 15th level, when you roll initiative and have no superiorit"
          + "y dice remaining, you regain 1 superiority die.\r\n\r\n", 15);
      addFeature("", 18);
    } else if (subclass.equals("Champion")) {
      addFeature("Improved Critical:\r\n"
          + "Beginning when you choose this archetype at 3rd level, your weapon atta"
          + "cks score a critical hit on a roll of 19 or 20.\r\n\r\n", 3);
      addFeature("Remarkable Athlete:\r\n"
          + "Starting at 7th level, you can add half your proficiency bonus (rounded"
          + " up) to any Strength, Dexterity, or Constitution check you make that do"
          + "esn't already use your proficiency bonus. In addition, when you make a "
          + "running long jump, the distance you can cover increases by a number of "
          + "feet equal to your Strength modifier.\r\n\r\n", 7);
      addFeature("Additional Fighting Style:\r\n"
          + "At 10th level, you can choose a second option from the Fighting Style c"
          + "lass feature.\r\n\r\n", 10);
      addFeature("Superior Critical\r\n"
          + "Starting at 15th level, your weapon attacks score a critical hit on a r"
          + "oll of 18-20.\r\n\r\n", 15);
      addFeature("Survivor:\r\n"
          + "At 18th level, you attain the pinnacle of resilience in battle. At the "
          + "start of each of your turns, you regain hit points equal to 5 + your Co"
          + "nstitution modifier if you have no more than half of your hit points le"
          + "ft. You don't gain this benefit if you have 0 hit points.\r\n\r\n", 18);
    } else if (subclass.equals("Eldritch Knight")) {
      addFeature("Spellcasting\r\n"
          + "When you reach 3rd level, you augment your martial prowess with the abi"
          + "lity to cast spells. Intelligence is your spellcasting ability for your"
          + " wizard spells, since you learn your spells through study and memorizat"
          + "ion. Detailed spellcasting information can be found online, I won't bot"
          + "her. \r\n\r\n"
          + "Weapon Bond:\r\n"
          + "At 3rd level, you learn a ritual that creates a magical bond between yo"
          + "urself and one weapon. You perform the ritual over the course of 1 hour"
          + ", which can be done during a short rest. The weapon must be within your"
          + " reach throughout the ritual, at the conclusion of which you touch the "
          + "weapon and forge the bond. Once you have bonded a weapon to yourself, y"
          + "ou can't be disarmed of that weapon unless you are incapacitated. If it"
          + " is on the same plane of existence, you can summon that weapon as a bon"
          + "us action on your turn, causing it to teleport instantly to your hand. "
          + "You can have up to two bonded weapons, but can summon only one at a tim"
          + "e with your bonus action. If you attempt to bond with a third weapon, y"
          + "ou must break the bond with one of the other two.\r\n\r\n", 3);
      addFeature("War Magic:\r\n"
          + "Beginning at 7th level, when you use your action to cast a cantrip, you"
          + " can make one weapon attack as a bonus action.\r\n\r\n", 7);
      addFeature("Eldritch Strike:\r\n"
          + "At 10th level, you learn how to make your weapon strikes undercut a cre"
          + "ature's resistance to your spells. When you hit a creature with a weapo"
          + "n attack, that creature has disadvantage on the next saving throw it ma"
          + "kes against a spell you cast before the end of your next turn.\r\n\r\n",
          10);
      addFeature("Arcane Charge:\r\n"
          + "At 15th level, you gain the ability to teleport up to 30 feet to an uno"
          + "ccupied space you can see when you use your Action Surge. You can telep"
          + "ort before or after the additional action.\r\n\r\n", 15);
      addFeature("Improved War Magic:\r\n"
          + "Starting at 18th level, when you use your action to cast a spell, you c"
          + "an make one weapon attack as a bonus action.\r\n\r\n", 18);
    }

  }
}
