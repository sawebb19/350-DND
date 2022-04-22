package dndcompanion.character.chrclasses;

/**
 * Class for the Bard character class.

 * @author Sam Webb
 * @author Nick Ford
 *
 */
@SuppressWarnings("serial")
public class Bard extends CharacterClass {
  /**
   * Constructor for Bard Class.
   */
  public Bard() {
    this.name = "Bard";
    this.hit = 8;
    this.saves[1] = 1; // Dexterity
    this.saves[5] = 1; // Charisma
    this.subclasses = new String[] {"Lore", "Valor"};
    this.features = new String[] {
        //Level 1
        "Spellcasting:\r\n"
        + "You have learned to untangle and reshape the fabric of reality in harmony w"
        + "ith your wishes and music. Your spells are part of your vast repertoire, ma"
        + "gic that you can tune to different situations. Charisma is your spellcastin"
        + "g ability for your bard spells. Your magic comes from the heart and soul yo"
        + "u pour into the performance of your music or oration. You use your Charisma"
        + " whenever a spell refers to your spellcasting ability. In addition, you use"
        + " your Charisma modifier when setting the saving throw DC for a bard spell y"
        + "ou cast and when making an attack roll with one. More details on internet, "
        + "look it up.\r\n\r\n"
        + "Bardic Inspiration:\r\n"
        + "You can inspire others through stirring words or music. To do so, you use a"
        + " bonus action on your turn to choose one creature other than yourself withi"
        + "n 60 feet of you who can hear you. That creature gains one Bardic Inspirati"
        + "on die, a d6.\r\n"
        + "Once within the next 10 minutes, the creature can roll the die and add the "
        + "number rolled to one ability check, attack roll, or saving throw it makes. "
        + "The creature can wait until after it rolls the d20 before deciding to use t"
        + "he Bardic Inspiration die, but must decide before the DM says whether the r"
        + "oll succeeds or fails. Once the Bardic Inspiration die is rolled, it is los"
        + "t. A creature can have only one Bardic Inspiration die at a time.\r\n"
        + "You can use this feature a number of times equal to your Charisma modifier "
        + "(a minimum of once). You regain any expended uses when you finish a long re"
        + "st.\r\n"
        + "Your Bardic Inspiration die changes when you reach certain levels in this c"
        + "lass. The die becomes a d8 at 5th level, a d10 at 10th level, and a d12 at "
        + "15th level.\r\n\r\n", 
        //Level 2
        "Jack of All Trades:\r\n"
        + "Starting at 2nd level, you can add half your proficiency bonus, rounded dow"
        + "n, to any ability check you make that doesn't already include your proficie"
        + "ncy bonus.\r\n\r\n"
        + "Song of Rest:\r\n"
        + "Beginning at 2nd level, you can use soothing music or oration to help revit"
        + "alize your wounded allies during a short rest. If you or any friendly creat"
        + "ures who can hear your performance regain hit points at the end of the shor"
        + "t rest by spending one or more Hit Dice, each of those creatures regains an"
        + " extra 1d6 hit points.\r\n"
        + "The extra Hit Points increase when you reach certain levels in this class: "
        + "to 1d8 at 9th level, to 1d10 at 13th level, and to 1d12 at 17th level."
        + "\r\n\r\n",
        //Level 3
        "Expertise:\r\n"
        + "At 3rd level, choose two of your skill proficiencies. Your proficiency bonu"
        + "s is doubled for any ability check you make that uses either of the chosen "
        + "proficiencies.\r\n"
        + "At 10th level, you can choose another two skill proficiencies to gain this "
        + "benefit.\r\n\r\n",
        //Level 4
        "",
        //Level 5
        "Font of Inspiration:\r\n"
        + "Beginning when you reach 5th level, you regain all of your expended uses of"
        + " Bardic Inspiration when you finish a short or long rest.\r\n\r\n",
        //Level 6
        "Countercharm:\r\n"
        + "At 6th level, you gain the ability to use musical notes or words of power t"
        + "o disrupt mind-influencing effects. As an action, you can start a performan"
        + "ce that lasts until the end of your next turn. During that time, you and an"
        + "y friendly creatures within 30 feet of you have advantage on saving throws "
        + "against being frightened or charmed. A creature must be able to hear you to"
        + " gain this benefit. The performance ends early if you are incapacitated or "
        + "silenced or if you voluntarily end it (no action required).\r\n\r\n",
        //Level 7
        "",
        //Level 8
        "",
        //Level 9
        "",
        //Level 10
        "Magical Secrets:\r\n"
        + "By 10th level, you have plundered magical knowledge from a wide spectrum of"
        + " disciplines. Choose two spells from any classes, including this one. A spe"
        + "ll you choose must be of a level you can cast, as shown on the Bard table, "
        + "or a cantrip.\r\n"
        + "The chosen spells count as bard spells for you and are included in the numb"
        + "er in the Spells Known column of the Bard table.\r\n"
        + "You learn two additional spells from any classes at 14th level and again at"
        + " 18th level.\r\n\r\n",
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
        "Superior Inspiration\r\n"
        + "At 20th level, when you roll initiative and have no uses of Bardic Inspirat"
        + "ion left, you regain one use.\r\n\r\n"
    };
  }

  /**
   * Constructor for Bard Class with Subclass.

   * @param subclass input subclass for the player's Bard Class.
   */
  public Bard(String subclass) {
    this();
    if (!subclass.equals("")) {
      this.subclass = subclass;
    }
    if (subclass.equals("Lore")) {
      addFeature("Bonus Proficiencies\r\n"
          + "When you join the College of Lore at 3rd level, you gain proficiency with three"
          + " skills of your choice.\r\n\r\n"
          + "Cutting Words\r\n"
          + "Also at 3rd level, you learn how to use your wit to distract, confuse, and othe"
          + "rwise sap the confidence and competence of others. When a creature that you can"
          + " see within 60 feet of you makes an attack roll, an ability check, or a damage "
          + "roll, you can use your reaction to expend one of your uses of Bardic Inspiratio"
          + "n, rolling a Bardic Inspiration die and subtracting the number rolled from the "
          + "creature's roll. You can choose to use this feature after the creature makes it"
          + "s roll, but before the DM determines whether the attack roll or ability check s"
          + "ucceeds or fails, or before the creature deals its damage. The creature is immu"
          + "ne if it can't hear you or if it's immune to being charmed.\r\n\r\n", 3);
      addFeature("Additional Magical Secrets\r\n"
          + "At 6th level, you learn two spells of your choice from any class. A spell you c"
          + "hoose must be of a level you can cast, as shown on the Bard table, or a cantrip"
          + ". The chosen spells count as bard spells for you but don't count against the nu"
          + "mber of bard spells you know.\r\n\r\n", 6);
      addFeature("Peerless Skill\r\n"
          + "Starting at 14th level, when you make an ability check, you can expend one use "
          + "of Bardic Inspiration. Roll a Bardic Inspiration die and add the number rolled "
          + "to your ability check. You can choose to do so after you roll the die for the a"
          + "bility check, but before the DM tells you whether you succeed or fail.\r\n\r\n",
          14);
    } else if (subclass.equals("Valor")) {
      addFeature("Bonus Proficiencies\r\n"
          + "When you join the College of Valor at 3rd level, you gain proficiency with medi"
          + "um armor, shields, and martial weapons.\r\n\r\n"
          + "Combat Inspiration\r\n"
          + "Also at 3rd level, you learn to inspire others in battle. A creature that has a"
          + " Bardic Inspiration die from you can roll that die and add the number rolled to"
          + " a weapon damage roll it just made. Alternatively, when an attack roll is made "
          + "against the creature, it can use its reaction to roll the Bardic Inspiration di"
          + "e and add the number rolled to its AC against that attack, after seeing the rol"
          + "l but before knowing whether it hits or misses.\r\n\r\n", 3);
      addFeature("Extra Attack\r\n"
          + "Starting at 6th level, you can attack twice, instead of once, whenever you take"
          + " the Attack action on your turn.\r\n\r\n", 6);
      addFeature("Battle Magic\r\n"
          + "At 14th level, you have mastered the art of weaving spellcasting and weapon use"
          + " into a single harmonious act. When you use your action to cast a bard spell, y"
          + "ou can make one weapon attack as a bonus action.\r\n\r\n", 14);
    }

  }
}
