package dndcompanion.character.chrclasses;

/**
 * Class for the Monk character class.

 * @author Sam Webb
 * @author Nick Ford
 *
 */
@SuppressWarnings("serial")
public class Monk extends CharacterClass {
  /**
   * Constructor for Monk Class.
   */
  public Monk() {
    this.name = "Monk";
    this.hit = 8;
    this.saves[0] = 1; // Strength
    this.saves[1] = 1; // Dexterity
    this.features = new String[] {
        //Level 1
        "Unarmored Defense:\r\n"
        + "Beginning at 1st level, while you are wearing no armor and not wielding a shield, y"
        + "our AC equals 10 + your Dexterity modifier + your Wisdom modifier.\r\n\r\n"
        + "Martial Arts:\r\n"
        + "At 1st level, your practice of martial arts gives you mastery of combat styles that"
        + " use unarmed strikes and monk weapons, which are shortswords and any simple melee w"
        + "eapons that don't have the two-handed or heavy property.\r\n"
        + "You gain the following benefits while you are unarmed or wielding only monk weapons"
        + " and you aren't wearing armor or wielding a shield:\r\n"
        + "- You can use Dexterity instead of Strength for the attack and damage rolls of your"
        + " unarmed strikes and monk weapons.\r\n"
        + "- You can roll a d4 in place of the normal damage of your unarmed strike or monk we"
        + "apon. This die changes as you gain monk levels, as shown in the Martial Arts column"
        + " of the Monk table.\r\n"
        + "- When you use the Attack action with an unarmed strike or a monk weapon on your tu"
        + "rn, you can make one unarmed strike as a bonus action. For example, if you take the"
        + " Attack action and attack with a quarterstaff, you can also make an unarmed strike "
        + "as a bonus action, assuming you haven't already taken a bonus action this turn.\r\n"
        + "Certain monasteries use specialized forms of the monk weapons. For example, you mig"
        + "ht use a club that is two lengths of wood connected by a short chain (called a nunc"
        + "haku) or a sickle with a shorter, straighter blade (called a kama). Whatever name y"
        + "ou use for a monk weapon, you can use the game statistics provided for the weapon o"
        + "n the Weapons page.\r\n\r\n", 
        //Level 2
        "Ki:\r\n"
        + "Starting at 2nd level, your training allows you to harness the mystic energy of ki."
        + " Your access to this energy is represented by a number of ki points. Your monk leve"
        + "l determines the number of points you have, as shown in the Ki Points column of the"
        + " Monk table. You can spend these points to fuel various ki features. You start know"
        + "ing three such features: Flurry of Blows, Patient Defense, and Step of the Wind. Yo"
        + "u learn more ki features as you gain levels in this class. Look up more details on "
        + "these. When you spend a ki point, it is unavailable until you finish a short or lon"
        + "g rest, at the end of which you draw all of your expended ki back into yourself. Yo"
        + "u must spend at least 30 minutes of the rest meditating to regain your ki points."
        + "\r\n"
        + "Some of your ki features require your target to make a saving throw to resist the f"
        + "eature's effects. The saving throw DC is calculated as follows: Ki save DC = 8 + yo"
        + "ur proficiency bonus + your Wisdom modifier.\r\n"
        + "- Flurry of Blows. Immediately after you take the Attack action on your turn, you c"
        + "an spend 1 ki point to make two unarmed strikes as a bonus action.\r\n"
        + "- Patient Defense. You can spend 1 ki point to take the Dodge action as a bonus act"
        + "ion on your turn.\r\n"
        + "- Step of the Wind. You can spend 1 ki point to take the Disengage or Dash action a"
        + "s a bonus action on your turn, and your jump distance is doubled for the turn."
        + "\r\n\r\n"
        + "Unarmored Movement:\r\n"
        + "Starting at 2nd level, your speed increases by 10 feet while you are not wearing ar"
        + "mor or wielding a shield. This bonus increases when you reach certain monk levels, "
        + "as shown in the Monk table. At 9th level, you gain the ability to move along vertic"
        + "al surfaces and across liquids on your turn without falling during the move.\r\n"
        + "\r\n",
        //Level 3
        "Deflect Missiles:\r\n"
        + "Starting at 3rd level, you can use your reaction to deflect or catch the missile wh"
        + "en you are hit by a ranged weapon attack. When you do so, the damage you take from "
        + "the attack is reduced by 1d10 + your Dexterity modifier + your monk level.\r\n"
        + "If you reduce the damage to 0, you can catch the missile if it is small enough for "
        + "you to hold in one hand and you have at least one hand free. If you catch a missile"
        + " in this way, you can spend 1 ki point to make a ranged attack with a range of 20/6"
        + "0 using the weapon or piece of ammunition you just caught, as part of the same reac"
        + "tion. You make this attack with proficiency, regardless of your weapon proficiencie"
        + "s, and the missile counts as a monk weapon for the attack.\r\n\r\n",
        //Level 4
        "Slow Fall:\r\n"
        + "Beginning at 4th level, you can use your reaction when you fall to reduce any falli"
        + "ng damage you take by an amount equal to five times your monk level.\r\n\r\n",
        //Level 5
        "Extra Attack:\r\n"
        + "Beginning at 5th level, you can attack twice, instead of once, whenever you take th"
        + "e Attack action on your turn.\r\n\r\n"
        + "Stunning Strike:\r\n"
        + "Starting at 5th level, you can interfere with the flow of ki in an opponent's body."
        + " When you hit another creature with a melee weapon attack, you can spend 1 ki point"
        + " to attempt a stunning strike. The target must succeed on a Constitution saving thr"
        + "ow or be stunned until the end of your next turn.\r\n\r\n",
        //Level 6
        "Ki-Empowered Strikes:\r\n"
        + "Starting at 6th level, your unarmed strikes count as magical for the purpose of ove"
        + "rcoming resistance and immunity to nonmagical attacks and damage.\r\n\r\n",
        //Level 7
        "Evasion:\r\n"
        + "At 7th level, your instinctive agility lets you dodge out of the way of certain are"
        + "a effects, such as a blue dragon's lightning breath or a fireball spell. When you a"
        + "re subjected to an effect that allows you to make a Dexterity saving throw to take "
        + "only half damage, you instead take no damage if you succeed on the saving throw, an"
        + "d only half damage if you fail.\r\n\r\n"
        + "Stillness of Mind:\r\n"
        + "Starting at 7th level, you can use your action to end one effect on yourself that i"
        + "s causing you to be charmed or frightened.\r\n\r\n",
        //Level 8
        "",
        //Level 9
        "",
        //Level 10
        "Purity of Body:\r\n"
        + "At 10th level, your mastery of the ki flowing through you makes you immune to disea"
        + "se and poison.\r\n\r\n",
        //Level 11
        "",
        //Level 12
        "",
        //Level 13
        "Tongue of the Sun and Moon:\r\n"
        + "Starting at 13th level, you learn to touch the ki of other minds so that you unders"
        + "tand all spoken languages. Moreover, any creature that can understand a language ca"
        + "n understand what you say.\r\n\r\n",
        //Level 14
        "Diamond Soul:\r\n"
        + "Beginning at 14th level, your mastery of ki grants you proficiency in all saving th"
        + "rows.Additionally, whenever you make a saving throw and fail, you can spend 1 ki po"
        + "int to reroll it and take the second result.\r\n\r\n",
        //Level 15
        "Timeless Body:\r\n"
        + "At 15th level, your ki sustains you so that you suffer none of the frailty of old a"
        + "ge, and you can't be aged magically. You can still die of old age, however. In addi"
        + "tion, you no longer need food or water.\r\n\r\n",
        //Level 16
        "",
        //Level 17
        "",
        //Level 18
        "Empty Body:\r\n"
        + "Beginning at 18th level, you can use your action to spend 4 ki points to become inv"
        + "isible for 1 minute. During that time, you also have resistance to all damage but f"
        + "orce damage. Additionally, you can spend 8 ki points to cast the Astral Projection "
        + "spell, without needing material components. When you do so, you can't take any othe"
        + "r creatures with you.\r\n\r\n"
        + "",
        //Level 19
        "",
        //Level 20
        "Perfect Self:\r\n"
        + "At 20th level, when you roll for initiative and have no ki points remaining, you re"
        + "gain 4 ki points.\r\n\r\n"
    };
  }

  /**
   * Constructor for Monk Class with Subclass

   * @param subclass input subclass for the player's Monk Class.
   */
  public Monk(String subclass) {
    this();
    if (subclass.equals("Four Elements")) {
      addFeature("Disciple of the Elements:\r\n"
          + "When you choose this tradition at 3rd level, you learn magical disciplines that h"
          + "arness the power of the four elements. A discipline requires you to spend ki poin"
          + "ts each time you use it. You know the Elemental Attunement discipline and one oth"
          + "er elemental discipline of your choice. You learn one additional elemental discip"
          + "line of your choice at 6th, 11th, and 17th level. Whenever you learn a new elemen"
          + "tal discipline, you can also replace one elemental discipline that you already kn"
          + "ow with a different discipline.\r\n"
          + "Casting Elemental Spells.\r\n"
          + "Some elemental disciplines allow you to cast spells. See chapter 10 for the gener"
          + "al rules of spellcasting. To cast one of these spells, you use its casting time a"
          + "nd other rules, but you don't need to provide material components for it. Once yo"
          + "u reach 5th level in this class, you can spend additional ki points to increase t"
          + "he level of an elemental discipline spell that you cast, provided that the spell "
          + "has an enhanced effect at a higher level, as Burning Hands does. The spell's leve"
          + "l increases by 1 for each additional ki point you spend. For example, if you are "
          + "a 5th-level monk and use Sweeping Cinder Strike to cast Burning Hands, you can sp"
          + "end 3 ki points to cast it as a 2nd-level spell (the discipline's base cost of 2 "
          + "ki points plus 1). The maximum number of ki points you can spend to cast a spell "
          + "in this way (including its base ki point cost and any additional ki points you sp"
          + "end to increase its level) is determined by your monk level, as shown in the Spel"
          + "ls and Ki Points table. More info online, look it up.\r\n\r\n", 3);

    } else if (subclass.equals("Open Hand")) {
      addFeature("Open Hand Technique:\r\n"
          + "Starting when you choose this tradition at 3rd level, you can manipulate your ene"
          + "my's ki when you harness your own. Whenever you hit a creature with one of the at"
          + "tacks granted by your Flurry of Blows, you can impose one of the following effect"
          + "s on that target:\r\n"
          + "- It must succeed on a Dexterity saving throw or be knocked prone.\r\n"
          + "- It must make a Strength saving throw. If it fails, you can push it up to 15 fee"
          + "t away from you.\r\n"
          + "- It can't take reactions until the end of your next turn.\r\n"
          + "\r\n"
          + "", 3);
      addFeature("Wholeness of Body:\r\n"
          + "At 6th level, you gain the ability to heal yourself. As an action, you can regain"
          + " hit points equal to three times your monk level. You must finish a long rest bef"
          + "ore you can use this feature again.\r\n\r\n", 6);
      addFeature("Tranquility:\r\n"
          + "Beginning at 11th level, you can enter a special meditation that surrounds you wi"
          + "th an aura of peace. At the end of a long rest, you gain the effect of a Sanctuar"
          + "y spell that lasts until the start of your next long rest (the spell can end earl"
          + "y as normal). The saving throw DC for the spell equals 8 + your Wisdom modifier +"
          + " your proficiency bonus.\r\n\r\n", 11);
      addFeature("Quivering Palm:\r\n"
          + "At 17th level, you gain the ability to set up lethal vibrations in someone's body"
          + ". When you hit a creature with an unarmed strike, you can spend 3 ki points to st"
          + "art these imperceptible vibrations, which last for a number of days equal to your"
          + " monk level. The vibrations are harmless unless you use your action to end them. "
          + "To do so, you and the target must be on the same plane of existence. When you use"
          + " this action, the creature must make a Constitution saving throw. If it fails, it"
          + " is reduced to 0 hit points. If it succeeds, it takes 10d10 necrotic damage. You "
          + "can have only one creature under the effect of this feature at a time. You can ch"
          + "oose to end the vibrations harmlessly without using an action.\r\n\r\n", 17);
    } else if (subclass.equals("Shadow")) {
      addFeature("Shadow Arts:\r\n"
          + "Starting when you choose this tradition at 3rd level, you can use your ki to dupl"
          + "icate the effects of certain spells. As an action, you can spend 2 ki points to c"
          + "ast Darkness, Darkvision, Pass without Trace, or Silence, without providing mater"
          + "ial components. Additionally, you gain the Minor Illusion cantrip if you don't al"
          + "ready know it.\r\n\r\n", 3);
      addFeature("Shadow Step:\r\n"
          + "At 6th level, you gain the ability to step from one shadow into another. When you"
          + " are in dim light or darkness, as a bonus action you can teleport up to 60 feet t"
          + "o an unoccupied space you can see that is also in dim light or darkness. You then"
          + " have advantage on the first melee attack you make before the end of the turn."
          + "\r\n\r\n", 6);
      addFeature("Cloak of Shadows:\r\n"
          + "By 11th level, you have learned to become one with the shadows. When you are in a"
          + "n area of dim light or darkness, you can use your action to become invisible. You"
          + " remain invisible until you make an attack, cast a spell, or are in an area of br"
          + "ight light.\r\n\r\n", 11);
      addFeature("Opportunist:\r\n"
          + "At 17th level, you can exploit a creature's momentary distraction when it is hit "
          + "by an attack. Whenever a creature within 5 feet of you is hit by an attack made b"
          + "y a creature other than you, you can use your reaction to make a melee attack aga"
          + "inst that creature.\r\n\r\n", 17);
    }
  }
}
