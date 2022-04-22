package dndcompanion.character.chrclasses;

/**
 * Class for the Rogue character class.

 * @author Sam Webb
 * @author Nick Ford
 *
 */
@SuppressWarnings("serial")
public class Rogue extends CharacterClass {
  /**
   * Constructor for Rogue Class.
   */
  public Rogue() {
    this.name = "Rogue";
    this.hit = 8;
    this.saves[1] = 1; // Dexterity
    this.saves[3] = 1; // Intelligence
    this.subclasses = new String[] {"", "Assassin", "Thief", "Arcane Trickster"};
    this.features = new String[] {
        //Level 1
        "Expertise:\r\n"
        + "At 1st level, choose two of your skill proficiencies, or one of your "
        + "skill proficiencies and your proficiency with thieves' tools. Your "
        + "proficiency bonus is doubled for any ability check you make that uses "
        + "either of the chosen proficiencies. At 6th level, you can choose two more "
        + "of your proficiencies (in skills or with thieves' tools) to gain this "
        + "benefit.\r\n\r\n"
        + "Sneak Attack:\r\n"
        + "Beginning at 1st level, you know how to strike subtly and exploit a foe's "
        + "distraction. Once per turn, you can deal an extra 1d6 damage to one "
        + "creature you hit with an attack if you have advantage on the attack "
        + "roll. The attack must use a finesse or a ranged weapon. You don't need "
        + "advantage on the attack roll if another enemy of the target is within 5 "
        + "feet of it, that enemy isn't incapacitated, and you don't have "
        + "disadvantage on the attack roll. The amount of the extra damage increases "
        + "as you gain levels in this class, as shown in the Sneak Attack column of "
        + "the Rogue table.\r\n\r\n"
        + "Thieves' Cant:\r\n"
        + "During your rogue training you learned thieves' cant, a secret mix of "
        + "dialect, jargon, and code that allows you to hide messages in seemingly "
        + "normal conversation. Only another creature that knows thieves' cant "
        + "understands such messages. It takes four times longer to convey such a "
        + "message than it does to speak the same idea plainly. In addition, you "
        + "understand a set of secret signs and symbols used to convey short, simple "
        + "messages, such as whether an area is dangerous or the territory of a "
        + "thieves' guild, whether loot is nearby, or whether the people in an area "
        + "are easy marks or will provide a safe house for thieves on the run.\r\n\r\n",
        //Level 2
        "Cunning Action:\r\n"
        + "Starting at 2nd level, your quick thinking and agility allow you to move "
        + "and act quickly. You can take a bonus action on each of your turns in "
        + "combat. This action can be used only to take the Dash, Disengage, or Hide "
        + "action.\r\n\r\n",
        //Level 3
        "",
        //Level 4
        "",
        //Level 5
        "Uncanny Dodge:\r\n"
        + "Starting at 5th level, when an attacker that you can see hits you with "
        + "an attack, you can use your reaction to halve the attack's damage against "
        + "you.\r\n\r\n",
        //Level 6
        "",
        //Level 7
        "Evasion:\r\n"
        + "Beginning at 7th level, you can nimbly dodge out of the way of certain "
        + "area effects, such as a red dragon's fiery breath or an Ice Storm spell. "
        + "When you are subjected to an effect that allows you to make a Dexterity "
        + "saving throw to take only half damage, you instead take no damage if you "
        + "succeed on the saving throw, and only half damage if you fail.\r\n\r\n",
        //Level 8
        "",
        //Level 9
        "",
        //Level 10
        "",
        //Level 11
        "Reliable Talent:\r\n"
        + "By 11th level, you have refined your chosen skills until they approach "
        + "perfection. Whenever you make an ability check that lets you add your "
        + "proficiency bonus, you can treat a d20 roll of 9 or lower as a 10.\r\n"
        + "\r\n",
        //Level 12
        "",
        //Level 13
        "",
        //Level 14
        "Blindsense:\r\n"
        + "Starting at 14th level, if you are able to hear, you are aware of the "
        + "location of any hidden or invisible creature within 10 feet of you.\r\n"
        + "\r\n",
        //Level 15
        "Slippery Mind:\r\n"
        + "By 15th level, you have acquired greater mental strength. You gain "
        + "proficiency in Wisdom saving throws.\r\n\r\n",
        //Level 16
        "",
        //Level 17
        "",
        //Level 18
        "Elusive:\r\n"
        + "Beginning at 18th level, you are so evasive that attackers rarely "
        + "gain the upper hand against you. No attack roll has advantage against "
        + "you while you aren't incapacitated.\r\n\r\n",
        //Level 19
        "",
        //Level 20
        "Stroke of Luck:\r\n"
        + "At 20th level, you have an uncanny knack for succeeding when you need "
        + "to. If your attack misses a target within range, you can turn the miss "
        + "into a hit. Alternatively, if you fail an ability check, you can treat "
        + "the d20 roll as a 20. Once you use this feature, you can't use it again "
        + "until you finish a short or long rest.\r\n\r\n"
    };
  }

  /**
   * Constructor for Rogue Class with Subclass.

   * @param subclass input subclass for the player's Rogue Class.
   */
  public Rogue(String subclass) {

    if (subclass.equals("Assassin")) {
      addFeature("Bonus Proficiencies:\r\n"
          + "When you choose this archetype at 3rd level, you gain proficiency with "
          + "the disguise kit and the poisoner's kit.\r\n\r\n"
          + "Assassinate:\r\n"
          + "Starting at 3rd level, you are at your deadliest when you get the drop "
          + "on your enemies. You have advantage on attack rolls against any "
          + "creature that hasn't taken a turn in the combat yet. In addition, any "
          + "hit you score against a creature that is surprised is a critical hit."
          + "\r\n\r\n", 3);
      addFeature("Infiltration Expertise:\r\n"
          + "Starting at 9th level, you can unfailingly create false identities for "
          + "yourself. You must spend seven days and 25 gp to establish the history, "
          + "profession, and affiliations for an identity. You can't establish an "
          + "identity that belongs to someone else. For example, you might acquire "
          + "appropriate clothing, letters of introduction, and official- looking "
          + "certification to establish yourself as a member of a trading house from "
          + "a remote city so you can insinuate yourself into the company of other "
          + "wealthy merchants. Thereafter, if you adopt the new identity as a "
          + "disguise, other creatures believe you to be that person until given an "
          + "obvious reason not to.\r\n\r\n", 9);
      addFeature("Impostor:\r\n"
          + "At 13th level, you gain the ability to unerringly mimic another "
          + "person's speech, writing, and behavior. You must spend at least three "
          + "hours studying these three components of the person's behavior, "
          + "listening to speech, examining handwriting, and observing mannerisms. "
          + "Your ruse is indiscernible to the casual observer. If a wary creature "
          + "suspects something is amiss, you have advantage on any Charisma "
          + "(Deception) check you make to avoid detection.\r\n\r\n", 13);
      addFeature("Death Strike:\r\n"
          + "Starting at 17th level, you become a master of instant death. When you "
          + "attack and hit a creature that is surprised, it must make a "
          + "Constitution saving throw (DC 8 + your Dexterity modifier + your "
          + "proficiency bonus). On a failed save, double the damage of your attack "
          + "against the creature.\r\n\r\n", 17);
    } else if (subclass.equals("Thief")) {
      addFeature("Fast Hands:\r\n"
          + "Starting at 3rd level, you can use the bonus action granted by your "
          + "Cunning Action to make a Dexterity (Sleight of Hand) check, use your "
          + "thieves' tools to disarm a trap or open a lock, or take the Use an "
          + "Object action.\r\n\r\n"
          + "Second-Story Work:\r\n"
          + "When you choose this archetype at 3rd level, you gain the ability to "
          + "climb faster than normal; climbing no longer costs you extra movement. "
          + "In addition, when you make a running jump, the distance you cover "
          + "increases by a number of feet equal to your Dexterity modifier."
          + "\r\n\r\n", 3);
      addFeature("Supreme Sneak:\r\n"
          + "Starting at 9th level, you have advantage on a Dexterity (Stealth) "
          + "check if you move no more than half your speed on the same turn."
          + "\r\n\r\n", 9);
      addFeature("Use Magic Device:\r\n"
          + "By 13th level, you have learned enough about the workings of magic "
          + "that you can improvise the use of items even when they are not "
          + "intended for you. You ignore all class, race, and level requirements "
          + "on the use of magic items.\r\n\r\n", 13);
      addFeature("Thief's Reflexes:\r\n"
          + "When you reach 17th level, you have become adept at laying ambushes and "
          + "quickly escaping danger. You can take two turns during the first round "
          + "of any combat. You take your first turn at your normal initiative and "
          + "your second turn at your initiative minus 10. You can't use this "
          + "feature when you are surprised.\r\n\r\n", 17);
    } else if (subclass.equals("Arcane Trickster")) {
      addFeature("Spellcasting:\r\n"
          + "When you reach 3rd level, you augment your martial prowess with the "
          + "ability to cast spells. Your spellcasting ability for these spells is "
          + "Intelligence. The number of cantrips and spells you can learn and "
          + "(everthing else) can be found on the internet. I won't bother.\r\n\r\n"
          + "Mage Hand Legerdemain\r\n"
          + "Starting at 3rd level, when you cast Mage Hand, you can make the "
          + "spectral hand invisible, and you can perform the following additional "
          + "tasks with it:\r\n"
          + "-You can stow one object the hand is holding in a container worn or "
          + "carried by another creature.\r\n"
          + "-You can retrieve an object in a container worn or carried by another "
          + "creature.\r\n"
          + "-You can use thieves' tools to pick locks and disarm traps at range.\r\n"
          + "You can perform one of these tasks without being noticed by a creature "
          + "if you succeed on a Dexterity (Sleight of Hand) check contested by the "
          + "creature's Wisdom (Perception) check. In addition, you can use the bonus "
          + "action granted by your Cunning Action to control the hand.\r\n\r\n", 3);
      addFeature("Magical Ambush:\r\n"
          + "Starting at 9th level, if you are hidden from a creature when you cast a "
          + "spell on it, the creature has disadvantage on any saving throw it makes "
          + "against the spell this turn.\r\n\r\n", 9);
      addFeature("Versatile Trickster:\r\n"
          + "At 13th level, you gain the ability to distract targets with your Mage "
          + "Hand. As a bonus action on your turn, you can designate a creature "
          + "within 5 feet of the spectral hand created by the spell. Doing so gives "
          + "you advantage on attack rolls against that creature until the end of "
          + "the turn.\r\n\r\n", 13);
      addFeature("Spell Thief:\r\n"
          + "At 17th level, you gain the ability to magically steal the knowledge of "
          + "how to cast a spell from another spellcaster. Immediately after a "
          + "creature casts a spell that targets you or includes you in its area of "
          + "effect, you can use your reaction to force the creature to make a "
          + "saving throw with its spellcasting ability modifier. The DC equals your "
          + "spell save DC. On a failed save, you negate the spell's effect against "
          + "you, and you steal the knowledge of the spell if it is at least 1st "
          + "level and of a level you can cast (it doesn't need to be a wizard "
          + "spell). For the next 8 hours, you know the spell and can cast it using "
          + "your spell slots. The creature can't cast that spell until the 8 hours "
          + "have passed. Once you use this feature, you can't use it again until "
          + "you finish a long rest.\r\n\r\n", 17);
    }
  }
}