package dndcompanion.character.chrclasses;

/**
 * Class for the Cleric character class.

 * @author Sam Webb
 * @author Nick Ford
 *
 */
@SuppressWarnings("serial")
public class Cleric extends CharacterClass {
  /**
   * Constructor for Cleric Class.
   */
  public Cleric() {
    this.name = "Cleric";
    this.hit = 8;
    this.saves[4] = 1; // Wisdom
    this.saves[5] = 1; // Charisma
    this.subclasses = new String[] {"Knowledge", "Life", "Light", "Nature", "Tempest",
        "Trickery", "War"};
    this.features = new String[] {
        //Level 1
        "Spellcasting:\r\n"
        + "As a conduit for divine power, you can cast cleric spells. You can use a holy symbo"
        + "l as a spellcasting focus for your cleric spells. Wisdom is your spellcasting abili"
        + "ty for your cleric spells. The power of your spells comes from your devotion to you"
        + "r deity. You use your Wisdom whenever a cleric spell refers to your spellcasting ab"
        + "ility. In addition, you use your Wisdom modifier when setting the saving throw DC f"
        + "or a cleric spell you cast and when making an attack roll with one. The rest is onl"
        + "ine, look it up.\r\n\r\n", 
        //Level 2
        "Channel Divinity:\r\n"
        + "At 2nd level, you gain the ability to channel divine energy directly from your deit"
        + "y, using that energy to fuel magical effects. You start with two such effects: Turn"
        + " Undead and an effect determined by your domain. Some domains grant you additional "
        + "effects as you advance in levels, as noted in the domain description.\r\n"
        + "When you use your Channel Divinity, you choose which effect to create. You must the"
        + "n finish a short or long rest to use your Channel Divinity again.\r\n"
        + "Some Channel Divinity effects require saving throws. When you use such an effect fr"
        + "om this class, the DC equals your cleric spell save DC.\r\n"
        + "Beginning at 6th level, you can use your Channel Divinity twice between rests, and "
        + "beginning at 18th level, you can use it three times between rests. When you finish "
        + "a short or long rest, you regain your expended uses.\r\n\r\n",
        //Level 3
        "",
        //Level 4
        "",
        //Level 5
        "Destroy Undead:\r\n"
        + "Starting at 5th level, when an undead fails its saving throw against your Turn Unde"
        + "ad feature, the creature is instantly destroyed if its challenge rating is at or be"
        + "low a certain threshold, as shown in the Cleric table above.\r\n\r\n",
        //Level 6
        "",
        //Level 7
        "",
        //Level 8
        "",
        //Level 9
        "",
        //Level 10
        "Divine Intervention:\r\n"
        + "Beginning at 10th level, you can call on your deity to intervene on your behalf whe"
        + "n your need is great.\r\n"
        + "Imploring your deity's aid requires you to use your action. Describe the assistance"
        + " you seek, and roll percentile dice. If you roll a number equal to or lower than yo"
        + "ur cleric level, your deity intervenes. The DM chooses the nature of the interventi"
        + "on; the effect of any cleric spell or cleric domain spell would be appropriate. If "
        + "your deity intervenes, you can't use this feature again for 7 days. Otherwise, you "
        + "can use it again after you finish a long rest.\r\n"
        + "At 20th level, your call for intervention succeeds automatically, no roll required."
        + "\r\n\r\n",
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
   * Constructor for Cleric Class with Subclass.

   * @param subclass input subclass for the player's Cleric Class.
   */
  public Cleric(String subclass) {
    this();
    if (!subclass.equals("")) {
      this.subclass = subclass;
    }
    if (subclass.equals("Knowledge")) {
      addFeature("Blessings of Knowledge:\r\n"
          + "At 1st level, you learn two languages of your choice. You also become proficient "
          + "in your choice of two of the following skills: Arcana, History, Nature, or Religi"
          + "on.\r\n"
          + "Your proficiency bonus is doubled for any ability check you make that uses either"
          + " of those skills.\r\n\r\n", 1);
      addFeature("Channel Divinity: Knowledge of the Ages\r\n"
          + "Starting at 2nd level, you can use your Channel Divinity to tap into a divine wel"
          + "l of knowledge. As an action, you choose one skill or tool. For 10 minutes, you h"
          + "ave proficiency with the chosen skill or tool.\r\n\r\n", 2);
      addFeature("Channel Divinity: Read Thoughts\r\n"
          + "At 6th level, you can use your Channel Divinity to read a creature's thoughts. Yo"
          + "u can then use your access to the creature's mind to command it.\r\n"
          + "As an action, choose one creature that you can see within 60 feet of you. That cr"
          + "eature must make a Wisdom saving throw. If the creature succeeds on the saving th"
          + "row, you can't use this feature on it again until you finish a long rest.\r\n"
          + "If the creature fails its save, you can read its surface thoughts (those foremost"
          + " in its mind, reflecting its current emotions and what it is actively thinking ab"
          + "out) when it is within 60 feet of you. This effect lasts for 1 minute.\r\n"
          + "During that time, you can use your action to end this effect and cast the Suggest"
          + "ion spell on the creature without expending a spell slot. The target automaticall"
          + "y fails its saving throw against the spell.\r\n\r\n", 6);
      addFeature("Potent Spellcasting:\r\n"
          + "Starting at 8th level, you add your Wisdom modifier to the damage you deal with a"
          + "ny cleric cantrip.\r\n\r\n", 8);
      addFeature("Visions of the Past:\r\n"
          + "Starting at 17th level, you can call up visions of the past that relate to an obj"
          + "ect you hold or your immediate surroundings. You spend at least 1 minute in medit"
          + "ation and prayer, then receive dreamlike, shadowy glimpses of recent events. You "
          + "can meditate in this way for a number of minutes equal to your Wisdom score and m"
          + "ust maintain concentration during that time, as if you were casting a spell.\r\n"
          + "Once you use this feature, you can't use it again until you finish a short or lon"
          + "g rest.\r\n\r\n", 17);
    } else if (subclass.equals("Life")) {
      addFeature("Bonus Proficiency:\r\n"
          + "When you choose this domain at 1st level, you gain proficiency with heavy armor."
          + "\r\n\r\n"
          + "Disciple of Life:\r\n"
          + "Also starting at 1st level, your healing spells are more effective. Whenever you "
          + "use a spell of 1st level or higher to restore hit points to a creature, the creat"
          + "ure regains additional hit points equal to 2 + the spell's level.\r\n\r\n", 1);
      addFeature("Channel Divinity: Preserve Life\r\n"
          + "Starting at 2nd level, you can use your Channel Divinity to heal the badly injure"
          + "d.\r\n\r\n"
          + "As an action, you present your holy symbol and evoke healing energy that can rest"
          + "ore a number of hit points equal to five times your cleric level. Choose any crea"
          + "tures within 30 feet of you, and divide those hit points among them. This feature"
          + " can restore a creature to no more than half of its hit point maximum. You can't "
          + "use this feature on an undead or a construct.\r\n\r\n", 2);
      addFeature("Blessed Healer:\r\n"
          + "Beginning at 6th level, the healing spells you cast on others heal you as well. W"
          + "hen you cast a spell of 1st level or higher that restores hit points to a creatur"
          + "e other than you, you regain hit points equal to 2 + the spell's level.\r\n\r\n",
          6);
      addFeature("Divine Strike:\r\n"
          + "At 8th level, you gain the ability to infuse your weapon strikes with divine ener"
          + "gy. Once on each of your turns when you hit a creature with a weapon attack, you "
          + "can cause the attack to deal an extra 1d8 radiant damage to the target. When you "
          + "reach 14th level, the extra damage increases to 2d8.\r\n\r\n", 8);
      addFeature("Supreme Healing:\r\n"
          + "Starting at 17th level, when you would normally roll one or more dice to restore "
          + "hit points with a spell, you instead use the highest number possible for each die"
          + ". For example, instead of restoring 2d6 hit points to a creature, you restore 12."
          + "\r\n\r\n", 17);
    } else if (subclass.equals("Light")) {
      addFeature("Bonus Cantrip:\r\n"
          + "When you choose this domain at 1st level, you gain the Light cantrip if you don't"
          + " already know it. This cantrip doesn’t count against the number of cleric cantrip"
          + "s you know.\r\n\r\n"
          + "Warding Flare:\r\n"
          + "Also at 1st level, you can interpose divine light between yourself and an attacki"
          + "ng enemy. When you are attacked by a creature within 30 feet of you that you can "
          + "see, you can use your reaction to impose disadvantage on the attack roll, causing"
          + " light to flare before the attacker before it hits or misses. An attacker that ca"
          + "n't be blinded is immune to this feature.\r\n"
          + "You can use this feature a number of times equal to your Wisdom modifier (a minim"
          + "um of once). You regain all expended uses when you finish a long rest.\r\n\r\n",
          1);
      addFeature("Channel Divinity: Radiance of the Dawn\r\n"
          + "Starting at 2nd level, you can use your Channel Divinity to harness sunlight, ban"
          + "ishing darkness and dealing radiant damage to your foes.\r\n"
          + "As an action, you present your holy symbol, and any magical darkness within 30 fe"
          + "et of you is dispelled. Additionally, each hostile creature within 30 feet of you"
          + " must make a Constitution saving throw. A creature takes radiant damage equal to "
          + "2d10 + your cleric level on a failed saving throw, and half as much damage on a s"
          + "uccessful one. A creature that has total cover from you is not affected.\r\n\r\n",
          2);
      addFeature("Improved Flare:\r\n"
          + "Starting at 6th level, you can also use your Warding Flare feature when a creatur"
          + "e that you can see within 30 feet of you attacks a creature other than you.\r\n"
          + "\r\n", 6);
      addFeature("Potent Spellcasting:\r\n"
          + "Starting at 8th level, you add your Wisdom modifier to the damage you deal with a"
          + "ny cleric cantrip.\r\n\r\n", 8);
      addFeature("Corona of Light:\r\n"
          + "Starting at 17th level, you can use your action to activate an aura of sunlight t"
          + "hat lasts for 1 minute or until you dismiss it using another action. You emit bri"
          + "ght light in a 60-foot radius and dim light 30 feet beyond that. Your enemies in "
          + "the bright light have disadvantage on saving throws against any spell that deals "
          + "fire or radiant damage.\r\n\r\n", 17);
    } else if (subclass.equals("Nature")) {
      addFeature("Acolyte of Nature:\r\n"
          + "At 1st level, you learn one cantrip of your choice from the druid spell list. Thi"
          + "s cantrip counts as a cleric cantrip for you, but it doesn’t count against the nu"
          + "mber of cleric cantrips you know. You also gain proficiency in one of the followi"
          + "ng skills of your choice: Animal Handling, Nature, or Survival.\r\n\r\n"
          + "Bonus Proficiency:\r\n"
          + "Also at 1st level, you gain proficiency with heavy armor.\r\n\r\n", 1);
      addFeature("Channel Divinity: Charm Animals and Plants\r\n"
          + "Starting at 2nd level, you can use your Channel Divinity to charm animals and pla"
          + "nts.\r\n"
          + "As an action, you present your holy symbol and invoke the name of your deity. Eac"
          + "h beast or plant creature that can see you within 30 feet of you must make a Wisd"
          + "om saving throw. If the creature fails its saving throw, it is charmed by you for"
          + " 1 minute or until it takes damage. While it is charmed by you, it is friendly to"
          + " you and other creatures you designate.\r\n\r\n", 2);
      addFeature("Dampen Elements:\r\n"
          + "Starting at 6th level, when you or a creature within 30 feet of you takes acid, c"
          + "old, fire, lightning, or thunder damage, you can use your reaction to grant resis"
          + "tance to the creature against that instance of the damage.\r\n\r\n", 6);
      addFeature("Divine Strike:\r\n"
          + "At 8th level, you gain the ability to infuse your weapon strikes with divine ener"
          + "gy. Once on each of your turns when you hit a creature with a weapon attack, you "
          + "can cause the attack to deal an extra 1d8 cold, fire, or lightning damage (your c"
          + "hoice) to the target. When you reach 14th level, the extra damage increases to 2d"
          + "8.\r\n\r\n", 8);
      addFeature("Master of Nature:\r\n"
          + "At 17th level, you gain the ability to command animals and plant creatures. While"
          + " creatures are charmed by your Charm Animals and Plants feature, you can take a b"
          + "onus action on your turn to verbally command what each of those creatures will do"
          + " on its next turn.\r\n\r\n", 17);
    } else if (subclass.equals("Tempest")) {
      addFeature("Bonus Proficiencies:\r\n"
          + "At 1st level, you gain proficiency with martial weapons and heavy armor.\r\n\r\n"
          + "Wrath of the Storm:\r\n"
          + "Also at 1st level, you can thunderously rebuke attackers. When a creature within "
          + "5 feet of you that you can see hits you with an attack, you can use your reaction"
          + " to cause the creature to make a Dexterity saving throw. The creature takes 2d8 l"
          + "ightning or thunder damage (your choice) on a failed saving throw, and half as mu"
          + "ch damage on a successful one.\r\n"
          + "You can use this feature a number of times equal to your Wisdom modifier (a minim"
          + "um of once). You regain all expended uses when you finish a long rest.\r\n\r\n",
          1);
      addFeature("Channel Divinity: Destructive Wrath\r\n"
          + "Starting at 2nd level, you can use your Channel Divinity to wield the power of th"
          + "e storm with unchecked ferocity.\r\n"
          + "When you roll lightning or thunder damage, you can use your Channel Divinity to d"
          + "eal maximum damage, instead of rolling.\r\n\r\n", 2);
      addFeature("Thunderous Strike:\r\n"
          + "At 6th level, when you deal lightning damage to a Large or smaller creature, you "
          + "can also push it up to 10 feet away from you.\r\n\r\n", 6);
      addFeature("Divine Strike:\r\n"
          + "At 8th level, you gain the ability to infuse your weapon strikes with divine ener"
          + "gy. Once on each of your turns when you hit a creature with a weapon attack, you "
          + "can cause the attack to deal an extra 1d8 thunder damage to the target. When you "
          + "reach 14th level, the extra damage increases to 2d8.\r\n\r\n", 8);
      addFeature("Stormborn:\r\n"
          + "At 17th level, you have a flying speed equal to your current walking speed whenev"
          + "er you are not underground or indoors.\r\n\r\n", 17);
    } else if (subclass.equals("Trickery")) {
      addFeature("Blessing of the Trickster\r\n"
          + "Starting when you choose this domain at 1st level, you can use your action to tou"
          + "ch a willing creature other than yourself to give it advantage on Dexterity (Stea"
          + "lth) checks. This blessing lasts for 1 hour or until you use this feature again."
          + "\r\n\r\n", 1);
      addFeature("Channel Divinity: Invoke Duplicity\r\n"
          + "Starting at 2nd level, you can use your Channel Divinity to create an illusory du"
          + "plicate of yourself.\r\n"
          + "As an action, you create a perfect illusion of yourself that lasts for 1 minute, "
          + "or until you lose your concentration (as if you were concentrating on a spell). T"
          + "he illusion appears in an unoccupied space that you can see within 30 feet of you"
          + ". As a bonus action on your turn, you can move the illusion up to 30 feet to a sp"
          + "ace you can see, but it must remain within 120 feet of you.\r\n"
          + "For the duration, you can cast spells as though you were in the illusion's space,"
          + " but you must use your own senses. Additionally, when both you and your illusion "
          + "are within 5 feet of a creature that can see the illusion, you have advantage on "
          + "attack rolls against that creature, given how distracting the illusion is to the "
          + "target.\r\n\r\n", 2);
      addFeature("Channel Divinity: Cloak of Shadows\r\n"
          + "Starting at 6th level, you can use your Channel Divinity to vanish.\r\n"
          + "As an action, you become invisible until the end of your next turn. You become vi"
          + "sible if you attack or cast a spell.\r\n\r\n", 6);
      addFeature("Divine Strike\r\n"
          + "At 8th level, you gain the ability to infuse your weapon strikes with poison  a "
          + "gift from your deity. Once on each of your turns when you hit a creature with a w"
          + "eapon attack, you can cause the attack to deal an extra 1d8 poison damage to the "
          + "target. When you reach 14th level, the extra damage increases to 2d8.\r\n\r\n", 8);
      addFeature("Improved Duplicity\r\n"
          + "At 17th level, you can create up to four duplicates of yourself, instead of one, "
          + "when you use Invoke Duplicity. As a bonus action on your turn, you can move any n"
          + "umber of them up to 30 feet, to a maximum range of 120 feet.\r\n\r\n", 17);
    } else if (subclass.equals("War")) {
      addFeature("Bonus Proficiency:\r\n"
          + "At 1st level, you gain proficiency with martial weapons and heavy armor.\r\n\r\n"
          + "War Priest:\r\n"
          + "From 1st level, your god delivers bolts of inspiration to you while you are engag"
          + "ed in battle. When you use the Attack action, you can make one weapon attack as a"
          + " bonus action.\r\n"
          + "You can use this feature a number of times equal to your Wisdom modifier (a minim"
          + "um of once). You regain all expended uses when you finish a long rest.\r\n\r\n",
          1);
      addFeature("Channel Divinity: Guided Strike\r\n"
          + "Starting at 2nd level, you can use your Channel Divinity to strike with supernatu"
          + "ral accuracy. When you make an attack roll, you can use your Channel Divinity to "
          + "gain a +10 bonus to the roll. You make this choice after you see the roll, but be"
          + "fore the DM says whether the attack hits or misses.\r\n\r\n", 2);
      addFeature("Channel Divinity: War God's Blessing\r\n"
          + "At 6th level, when a creature within 30 feet of you makes an attack roll, you can"
          + " use your reaction to grant that creature a +10 bonus to the roll, using your Cha"
          + "nnel Divinity. You make this choice after you see the roll, but before the DM say"
          + "s whether the attack hits or misses.\r\n\r\n", 6);
      addFeature("Divine Strike\r\n"
          + "At 8th level, you gain the ability to infuse your weapon strikes with divine ener"
          + "gy. Once on each of your turns when you hit a creature with a weapon attack, you "
          + "can cause the attack to deal an extra 1d8 damage of the same type dealt by the we"
          + "apon to the target. When you reach 14th level, the extra damage increases to 2d8."
          + "\r\n\r\n", 8);
      addFeature("Avatar of Battle\r\n"
          + "At 17th level, you gain resistance to bludgeoning, piercing, and slashing damage "
          + "from nonmagical attacks.\r\n\r\n", 17);
    }
  }
}
