package dndcompanion.character.chrclasses;

/**
 * Class for the Paladin character class.

 * @author Sam Webb
 * @author Nick Ford
 *
 */
@SuppressWarnings("serial")
public class Paladin extends CharacterClass {
  /**
   * Constructor for Paladin Class.
   */
  public Paladin() {
    this.name = "Paladin";
    this.hit = 10;
    this.saves[4] = 1; // Wisdom
    this.saves[5] = 1; // Charisma
    this.features = new String[] {
        //Level 1
        "Divine Sense:\r\n"
        + "The presence of strong evil registers on your senses like a noxious odor, and powerful good rings like heavenly music in your ears. As an action, you can open your awareness to detect such forces. Until the end of your next turn, you know the location of any celestial, fiend, or undead within 60 feet of you that is not behind total cover. You know the type (celestial, fiend, or undead) of any being whose presence you sense, but not its identity (the vampire Count Strahd von Zarovich, for instance). Within the same radius, you also detect the presence of any place or object that has been consecrated or desecrated, as with the Hallow spell. You can use this feature a number of times equal to 1 + your Charisma modifier. When you finish a long rest, you regain all expended uses.\r\n"
        + "\r\n"
        + "Lay on Hands:\r\n"
        + "Your blessed touch can heal wounds. You have a pool of healing power that replenishes when you take a long rest. With that pool, you can restore a total number of hit points equal to your paladin level x 5. As an action, you can touch a creature and draw power from the pool to restore a number of hit points to that creature, up to the maximum amount remaining in your pool. Alternatively, you can expend 5 hit points from your pool of healing to cure the target of one disease or neutralize one poison affecting it. You can cure multiple diseases and neutralize multiple poisons with a single use of Lay on Hands, expending hit points separately for each one. This feature has no effect on undead and constructs.\r\n"
        + "\r\n"
        + "", 
        //Level 2
        "Fighting Style:\r\n"
        + "Starting at 2nd level, you adopt a particular style of fighting as your specialty. Choose one of the following options. You can't take a Fighting Style option more than once, even if you later get to choose again.\r\n"
        + "\r\n"
        + "Spellcasting:\r\n"
        + "By 2nd level, you have learned to draw on divine magic through meditation and prayer to cast spells as a cleric does. Charisma is your spellcasting ability for your paladin spells, since their power derives from the strength of your convictions. You use your Charisma whenever a spell refers to your spellcasting ability. In addition, you use your Charisma modifier when setting the saving throw DC for a paladin spell you cast and when making an attack roll with one.\r\n"
        + "\r\n"
        + "Divine Smite:\r\n"
        + "Starting at 2nd level, when you hit a creature with a melee weapon attack, you can expend one spell slot to deal radiant damage to the target, in addition to the weapon's damage. The extra damage is 2d8 for a 1st-level spell slot, plus 1d8 for each spell level higher than 1st, to a maximum of 5d8. The damage increases by 1d8 if the target is an undead or a fiend, to a maximum of 6d8.\r\n"
        + "\r\n"
        + "",
        //Level 3
        "Divine Health:\r\n"
        + "By 3rd level, the divine magic flowing through you makes you immune to disease.\r\n"
        + "\r\n"
        + "",
        //Level 4
        "",
        //Level 5
        "Extra Attack:\r\n"
        + "Beginning at 5th level, you can attack twice, instead of once, whenever you take the Attack action on your turn.\r\n"
        + "\r\n"
        + "",
        //Level 6
        "Aura of Protection:\r\n"
        + "Starting at 6th level, whenever you or a friendly creature within 10 feet of you must make a saving throw, the creature gains a bonus to the saving throw equal to your Charisma modifier (with a minimum bonus of +1). You must be conscious to grant this bonus. At 18th level, the range of this aura increases to 30 feet.\r\n"
        + "\r\n"
        + "",
        //Level 7
        "",
        //Level 8
        "",
        //Level 9
        "",
        //Level 10
        "Aura of Courage:\r\n"
        + "Starting at 10th level, you and friendly creatures within 10 feet of you can't be frightened while you are conscious. At 18th level, the range of this aura increases to 30 feet.\r\n"
        + "\r\n"
        + "",
        //Level 11
        "Improved Divine Smite:\r\n"
        + "By 11th level, you are so suffused with righteous might that all your melee weapon strikes carry divine power with them. Whenever you hit a creature with a melee weapon, the creature takes an extra 1d8 radiant damage.\r\n"
        + "\r\n"
        + "",
        //Level 12
        "",
        //Level 13
        "",
        //Level 14
        "Cleansing Touch:\r\n"
        + "Beginning at 14th level, you can use your action to end one spell on yourself or on one willing creature that you touch. You can use this feature a number of times equal to your Charisma modifier (a minimum of once). You regain expended uses when you finish a long rest.\r\n"
        + "\r\n"
        + "",
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
   * Constructor for Paladin Class with Subclass

   * @param subclass input subclass for the player's Barbarian Class.
   */
  public Paladin(String subclass) {
    this();
    if (subclass.equals("Ancients")) {
      addFeature("Channel Divinity:\r\n"
          + "When you take this oath at 3rd level, you gain the following two Channel Divinity options. Info on each can be found online, look it up.\r\n"
          + "- Nature's Wrath\r\n"
          + "- Turn the Faithless\r\n"
          + "\r\n"
          + "", 3);
      addFeature("Aura of Warding:\r\n"
          + "Beginning at 7th level, ancient magic lies so heavily upon you that it forms an eldritch ward. You and friendly creatures within 10 feet of you have resistance to damage from spells. At 18th level, the range of this aura increases to 30 feet.\r\n"
          + "\r\n"
          + "", 7);
      addFeature("Undying Sentinel:\r\n"
          + "Starting at 15th level, when you are reduced to 0 hit points and are not killed outright, you can choose to drop to 1 hit point instead. Once you use this ability, you can't use it again until you finish a long rest. Additionally, you suffer none of the drawbacks of old age, and you can't be aged magically.\r\n"
          + "\r\n"
          + "", 15);
      addFeature("Elder Champion:\r\n"
          + "At 20th level, you can assume the form of an ancient force of nature, taking on an appearance you choose. For example, your skin might turn green or take on a bark-like texture, your hair might become leafy or moss-like, or you might sprout antlers or a lion-like mane. Using your action, you undergo a transformation. Once you use this feature, you can't use it again until you finish a long rest. For 1 minute, you gain the following benefits:\r\n"
          + "- At the start of each of your turns, you regain 10 hit points.\r\n"
          + "- Whenever you cast a paladin spell that has a casting time of 1 action, you can cast it using a bonus action instead.\r\n"
          + "- Enemy creatures within 10 feet of you have disadvantage on saving throws against your paladin spells and Channel Divinity options.\r\n\r\n"
          + "", 20);
    } else if (subclass.equals("Devotion")) {
      addFeature("Channel Divinity:\r\n"
          + "When you take this oath at 3rd level, you gain the following two Channel Divinity options. Info on each can be found online, look it up.\r\n"
          + "- Sacred Weapon\r\n"
          + "- Turn the Unholy\r\n"
          + "\r\n"
          + "", 3);
      addFeature("Aura of Devotion:\r\n"
          + "Starting at 7th level, you and friendly creatures within 10 feet of you can't be charmed while you are conscious. At 18th level, the range of this aura increases to 30 feet.\r\n"
          + "\r\n"
          + "", 7);
      addFeature("Purity of Spirit:\r\n"
          + "Beginning at 15th level, you are always under the effects of a Protection from Evil and Good spell.\r\n"
          + "\r\n"
          + "", 15);
      addFeature("Holy Nimbus:\r\n"
          + "At 20th level, as an action, you can emanate an aura of sunlight. For 1 minute, bright light shines from you in a 30-foot radius, and dim light shines 30 feet beyond that. Whenever an enemy creature starts its turn in the bright light, the creature takes 10 radiant damage. In addition, for the duration, you have advantage on saving throws against spells cast by fiends or undead. Once you use this feature, you can't use it again until you finish a long rest.\r\n"
          + "\r\n", 20);
    } else if (subclass.equals("Vengeance")) {
      addFeature("Channel Divinity:\r\n"
          + "When you take this oath at 3rd level, you gain the following two Channel Divinity options. Info on each can be found online, look it up.\r\n"
          + "- Abjure Enemy\r\n"
          + "- Vow of Enmity\r\n"
          + "\r\n"
          + "", 3);
      addFeature("Relentless Avenger:\r\n"
          + "By 7th level, your supernatural focus helps you close off a foe's retreat. When you hit a creature with an opportunity attack, you can move up to half your speed immediately after the attack and as part of the same reaction. This movement doesn't provoke opportunity attacks.\r\n"
          + "\r\n"
          + "", 7);
      addFeature("Soul of Vengeance:\r\n"
          + "Starting at 15th level, the authority with which you speak your Vow of Enmity gives you greater power over your foe. When a creature under the effect of your Vow of Enmity makes an attack, you can use your reaction to make a melee weapon attack against that creature if it is within range.\r\n"
          + "\r\n"
          + "", 15);
      addFeature("Avenging Angel:\r\n"
          + "At 20th level, you can assume the form of an angelic avenger. Using your action, you undergo a transformation. Once you use this feature, you can't use it again until you finish a long rest. For 1 hour, you gain the following benefits:\r\n"
          + "- Wings sprout from your back and grant you a flying speed of 60 feet.\r\n"
          + "- You emanate an aura of menace in a 30-foot radius. The first time any enemy creature enters the aura or starts its turn there during a battle, the creature must succeed on a Wisdom saving throw or become frightened of you for 1 minute or until it takes any damage. Attack rolls against the frightened creature have advantage.\r\n"
          + "\r\n", 20);
    }

  }
}
