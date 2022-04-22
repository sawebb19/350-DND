package dndcompanion.character.chrclasses;

/**
 * Class for the Wizard character class.

 * @author Sam Webb
 * @author Nick Ford
 *
 */
@SuppressWarnings("serial")
public class Wizard extends CharacterClass {
  /**
   * Constructor for Wizard Class.
   */
  public Wizard() {
    this.name = "Wizard";
    this.hit = 6;
    this.saves[3] = 1; // Intelligence
    this.saves[4] = 1; // Wisdom
    this.subclasses = new String[] {"Abjuration", "Conjuration", "Divination", 
        "Enchantment", "Evocation", "Illusion", "Necromancy", "Transmutation"};
    this.features = new String[] {
        //Level 1
        "Spellcasting:\r\n"
        + "As a student of arcane magic, you have a spellbook containing spells that"
        + " show the first glimmerings of your true power. Intelligence is your spel"
        + "lcasting ability for your wizard spells, since you learn your spells thro"
        + "ugh dedicated study and memorization. You use your Intelligence whenever "
        + "a spell refers to your spellcasting ability. In addition, you use your In"
        + "telligence modifier when setting the saving throw DC for a wizard spell y"
        + "ou cast and when making an attack roll with one.\r\n\r\n"
        + "Arcane Recovery:\r\n"
        + "You have learned to regain some of your magical energy by studying your s"
        + "pellbook. Once per day when you finish a short rest, you can choose expen"
        + "ded spell slots to recover. The spell slots can have a combined level tha"
        + "t is equal to or less than half your wizard level (rounded up), and none "
        + "of the slots can be 6th level or higher. For example, if you're a 4th-lev"
        + "el wizard, you can recover up to two levels worth of spell slots. You can"
        + " recover either a 2nd-level spell slot or two 1st-level spell slots.\r\n"
        + "\r\n", 
        //Level 2
        "",
        //Level 3
        "",
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
        "Spell Mastery:\r\n"
        + "At 18th level, you have achieved such mastery over certain spells that yo"
        + "u can cast them at will. Choose a 1st-level wizard spell and a 2nd-level "
        + "wizard spell that are in your spellbook. You can cast those spells at the"
        + "ir lowest level without expending a spell slot when you have them prepare"
        + "d. If you want to cast either spell at a higher level, you must expend a "
        + "spell slot as normal. By spending 8 hours in study, you can exchange one "
        + "or both of the spells you chose for different spells of the same levels."
        + "\r\n\r\n",
        //Level 19
        "",
        //Level 20
        "Signature Spells:\r\n"
        + "When you reach 20th level, you gain mastery over two powerful spells and "
        + "can cast them with little effort. Choose two 3rd-level wizard spells in y"
        + "our spellbook as your signature spells. You always have these spells prep"
        + "ared, they don't count against the number of spells you have prepared, an"
        + "d you can cast each of them once at 3rd level without expending a spell s"
        + "lot. When you do so, you can't do so again until you finish a short or lo"
        + "ng rest. If you want to cast either spell at a higher level, you must exp"
        + "end a spell slot as normal.\r\n\r\n"
    };
  }

  /**
   * Constructor for Wizard Class with Subclass.

   * @param subclass input subclass for the player's Wizard Class.
   */
  public Wizard(String subclass) {
    this();
    if (!subclass.equals("")) {
      this.subclass = subclass;
    }
    if (subclass.equals("Abjuration")) {
      addFeature("Abjuration Savant:\r\n"
          + "Beginning when you select this school at 2nd level, the gold and time you must "
          + "spend to copy a abjuration spell into your spellbook is halved.\r\n\r\n"
          + "Arcane Ward:\r\n"
          + "Starting at 2nd level, you can weave magic around yourself for protection. When"
          + " you cast an abjuration spell of 1st level or higher, you can simultaneously us"
          + "e a strand of the spell's magic to create a magical ward on yourself that lasts"
          + " until you finish a long rest. The ward has hit points equal to twice your wiza"
          + "rd level + your Intelligence modifier. Whenever you take damage, the ward takes"
          + " the damage instead. If this damage reduces the ward to 0 hit points, you take "
          + "any remaining damage. While the ward has 0 hit points, it can't absorb damage, "
          + "but its magic remains. Whenever you cast an abjuration spell of 1st level or hi"
          + "gher, the ward regains a number of hit points equal to twice the level of the s"
          + "pell. Once you create the ward, you can't create it again until you finish a lo"
          + "ng rest.\r\n\r\n", 2);
      addFeature("Projected Ward:\r\n"
          + "Starting at 6th level, when a creature that you can see within 30 feet of you t"
          + "akes damage, you can use your reaction to cause your Arcane Ward to absorb that"
          + " damage. If this damage reduces the ward to 0 hit points, the warded creature t"
          + "akes any remaining damage.\r\n\r\n"
          + "", 6);
      addFeature("Improved Abjuration:\r\n"
          + "Beginning at 10th level, when you cast an abjuration spell that requires you to"
          + " make an ability check as a part of casting that spell (as in Counterspell and "
          + "Dispel Magic), you add your proficiency bonus to that ability check.\r\n\r\n",
          10);
      addFeature("Spell Resistance:\r\n"
          + "Starting at 14th level, you have advantage on saving throws against spells. Fur"
          + "thermore, you have resistance against the damage of spells.\r\n\r\n", 14);
    } else if (subclass.equals("Conjuration")) {
      addFeature("Conjuration Savant:\r\n"
          + "Beginning when you select this school at 2nd level, the gold and time you must "
          + "spend to copy a Conjuration spell into your spellbook is halved.\r\n\r\n"
          + "Minor Conjuration:\r\n"
          + "Starting at 2nd level when you select this school, you can use your action to c"
          + "onjure up an inanimate object in your hand or on the ground in an unoccupied sp"
          + "ace that you can see within 10 feet of you. This object can be no larger than 3"
          + " feet on a side and weigh no more than 10 pounds, and its form must be that of "
          + "a nonmagical object that you have seen. The object is visibly magical, radiatin"
          + "g dim light out to 5 feet. The object disappears after 1 hour, when you use thi"
          + "s feature again, or if it takes or deals any damage.\r\n\r\n", 2);
      addFeature("Benign Transportation:\r\n"
          + "Starting at 6th level, you can use your action to teleport up to 30 feet to an "
          + "unoccupied space that you can see. Alternatively, you can choose a space within"
          + " range that is occupied by a Small or Medium creature. If that creature is will"
          + "ing, you both teleport, swapping places. Once you use this feature, you can't u"
          + "se it again until you finish a long rest or you cast a conjuration spell of 1st"
          + " level or higher.\r\n\r\n", 6);
      addFeature("Focused Conjuration:\r\n"
          + "Beginning at 10th level, while you are concentrating on a conjuration spell, yo"
          + "ur concentration can't be broken as a result of taking damage.\r\n\r\n", 10);
      addFeature("Durable Summons:\r\n"
          + "Starting at 14th level, any creature that you summon or create with a conjurati"
          + "on spell has 30 temporary hit points.\r\n\r\n"
          + "", 14);
    } else if (subclass.equals("Divination")) {
      addFeature("Divination Savant:\r\n"
          + "Beginning when you select this school at 2nd level, the gold and time you must sp"
          + "end to copy a Divination spell into your spellbook is halved.\r\n"
          + "\r\n"
          + "Portent:\r\n"
          + "Starting at 2nd level when you choose this school, glimpses of the future begin t"
          + "o press in on your awareness. When you finish a long rest, roll two d20s and reco"
          + "rd the numbers rolled. You can replace any attack roll, saving throw, or ability "
          + "check made by you or a creature that you can see with one of these foretelling ro"
          + "lls. You must choose to do so before the roll, and you can replace a roll in this"
          + " way only once per turn. Each foretelling roll can be used only once. When you fi"
          + "nish a long rest, you lose any unused foretelling rolls.\r\n"
          + "\r\n"
          + "", 2);
      addFeature("Expert Divination:\r\n"
          + "Beginning at 6th level, casting divination spells comes so easily to you that it "
          + "expends only a fraction of your spellcasting efforts. When you cast a divination "
          + "spell of 2nd level or higher using a spell slot, you regain one expended spell sl"
          + "ot. The slot you regain must be of a level lower than the spell you cast and can'"
          + "t be higher than 5th level.\r\n"
          + "\r\n"
          + "", 6);
      addFeature("The Third Eye:\r\n"
          + "Starting at 10th level, you can use your action to increase your powers of perce"
          + "ption. When you do so, choose one of the following benefits, which lasts until "
          + "you are incapacitated or you take a short or long rest. You can't use the featu"
          + "re again until you finish a short or long rest.\r\n"
          + "- Darkvision. You gain darkvision out to a range of 60 feet.\r\n"
          + "- Ethereal Sight. You can see into the Ethereal Plane within 60 feet of you.\r\n"
          + "- Greater Comprehension. You can read any language.\r\n"
          + "- See Invisibility. You can see invisible creatures and objects within 10 feet of"
          + " you that are within line of sight.\r\n"
          + "\r\n"
          + "", 10);
      addFeature("Greater Portent:\r\n"
          + "Starting at 14th level, the visions in your dreams intensify and paint a more acc"
          + "urate picture in your mind of what is to come. You roll three d20s for your Porte"
          + "nt feature, rather than two.\r\n"
          + "\r\n"
          + "", 14);
    } else if (subclass.equals("Enchantment")) {
      addFeature("Enchantment Savant:\r\n"
          + "Beginning when you select this school at 2nd level, the gold and time you must s"
          + "pend to copy a Enchantment spell into your spellbook is halved.\r\n"
          + "\r\n"
          + "Hypnotic Gaze:\r\n"
          + "Starting at 2nd level when you choose this school, your soft words and enchanti"
          + "ng gaze can magically enthrall another creature. As an action, choose one creatu"
          + "re that you can see within 5 feet of you. If the target can see or hear you, it m"
          + "ust succeed on a Wisdom saving throw against your wizard spell save DC or be char"
          + "med by you until the end of your next turn. The charmed creature's speed drops to"
          + " 0, and the creature is incapacitated and visibly dazed. On subsequent turns, you"
          + " can use your action to maintain this effect, extending its duration until the en"
          + "d of your next turn. However, the effect ends if you move more than 5 feet away f"
          + "rom the creature, if the creature can neither see nor hear you, or if the creatur"
          + "e takes damage. Once the effect ends, or if the creature succeeds on its initial "
          + "saving throw against this effect, you can't use this feature on that creature aga"
          + "in until you finish a long rest.\r\n"
          + "\r\n"
          + "", 2);
      addFeature("Instinctive Charm:\r\n"
          + "Beginning at 6th level, when a creature you can see within 30 feet of you makes a"
          + "n attack roll against you, you can use your reaction to divert the attack, provi"
          + "ded that another creature is within the attack's range. The attacker must make a "
          + "Wisdom saving throw against your wizard spell save DC. On a failed save, the atta"
          + "cker must target the creature that is closest to it, not including you or itself."
          + " If multiple creatures are closest, the attacker chooses which one to target. On "
          + "a successful save, you can't use this feature on the attacker again until you fin"
          + "ish a long rest. You must choose to use this feature before knowing whether the a"
          + "ttack hits or misses. Creatures that can't be charmed are immune to this effect."
          + "\r\n"
          + "\r\n"
          + "", 6);
      addFeature("Split Enchantment:\r\n"
          + "Starting at 10th level, when you cast an enchantment spell of 1st level or higher"
          + " that targets only one creature, you can have it target a second creature.\r\n"
          + "\r\n"
          + "", 10);
      addFeature("Alter Memories:\r\n"
          + "At 14th level, you gain the ability to make a creature unaware of your magical in"
          + "fluence on it. When you cast an enchantment spell to charm one or more creatures,"
          + " you can alter one creature's understanding so that it remains unaware of being c"
          + "harmed. Additionally, once before the spell expires, you can use your action to t"
          + "ry to make the chosen creature forget some of the time it spent charmed. The crea"
          + "ture must succeed on an Intelligence saving throw against your wizard spell save "
          + "DC or lose a number of hours of its memories equal to 1 + your Charisma modifier "
          + "(minimum 1). You can make the creature forget less time, and the amount of time c"
          + "an't exceed the duration of your enchantment spell.\r\n"
          + "\r\n"
          + "", 14);
    } else if (subclass.equals("Evocation")) {
      addFeature("Evocation Savant:\r\n"
          + "Beginning when you select this school at 2nd level, the gold and time you must sp"
          + "end to copy a Evocation spell into your spellbook is halved.\r\n"
          + "\r\n"
          + "Sculpt Spells:\r\n"
          + "Beginning at 2nd level, you can create pockets of relative safety within the effe"
          + "cts of your evocation spells. When you cast an evocation spell that affects other"
          + " creatures that you can see, you can choose a number of them equal to 1 + the sp"
          + "ell's level. The chosen creatures automatically succeed on their saving throws a"
          + "gainst the spell, and they take no damage if they would normally take half damag"
          + "e on a successful save.\r\n"
          + "\r\n"
          + "", 2);
      addFeature("Potent Cantrip:\r\n"
          + "Starting at 6th level, your damaging cantrips affect even creatures that avoid t"
          + "he brunt of the effect. When a creature succeeds on a saving throw against your "
          + "cantrip, the creature takes half the cantrip's damage (if any) but suffers no a"
          + "dditional effect from the cantrip.\r\n"
          + "\r\n"
          + "", 6);
      addFeature("Empowered Evocation:\r\n"
          + "Beginning at 10th level, you can add your Intelligence modifier (minimum of +1) t"
          + "o one damage roll of any wizard evocation spell that you cast.\r\n"
          + "\r\n"
          + "", 10);
      addFeature("Overchannel:\r\n"
          + "Starting at 14th level, you can increase the power of your simpler spells. When y"
          + "ou cast a wizard spell of 1st through 5th level that deals damage, you can deal m"
          + "aximum damage with that spell. The first time you do so, you suffer no adverse ef"
          + "fect. If you use this feature again before you finish a long rest, you take 2d12 "
          + "necrotic damage for each level of the spell, immediately after you cast it. Each "
          + "time you use this feature again before finishing a long rest, the necrotic damage"
          + " per spell level increases by 1d12. This damage ignores resistance and immunity."
          + "\r\n\r\n", 14);
    } else if (subclass.equals("Illusion")) {
      addFeature("Illusion Savant:\r\n"
          + "Beginning when you select this school at 2nd level, the gold and time you must sp"
          + "end to copy a Illusion spell into your spellbook is halved.\r\n"
          + "\r\n"
          + "Improved Minor Illusion:\r\n"
          + "When you choose this school at 2nd level, you learn the Minor Illusion cantrip. I"
          + "f you already know this cantrip, you learn a different wizard cantrip of your cho"
          + "ice. The cantrip doesn't count against your number of cantrips known. When you ca"
          + "st Minor Illusion, you can create both a sound and an image with a single casting"
          + " of the spell.\r\n"
          + "\r\n"
          + "", 2);
      addFeature("Malleable Illusions:\r\n"
          + "Starting at 6th level, when you cast an illusion spell that has a duration of 1 m"
          + "inute or longer, you can use your action to change the nature of that illusion (u"
          + "sing the spell's normal parameters for the illusion), provided that you can see t"
          + "he illusion.\r\n"
          + "\r\n"
          + "", 6);
      addFeature("Illusory Self:\r\n"
          + "Beginning at 10th level, you can create an illusory duplicate of yourself as an "
          + "instant, almost instinctual reaction to danger. When a creature makes an attack "
          + "roll against you, you can use your reaction to interpose the illusory duplicate "
          + "between the attacker and yourself. The attack automatically misses you, then the"
          + " illusion dissipates. Once you use this feature, you can't use it again until yo"
          + "u finish a short or long rest.\r\n"
          + "\r\n"
          + "", 10);
      addFeature("Illusory Reality:\r\n"
          + "By 14th level, you have learned the secret of weaving shadow magic into your ill"
          + "usions to give them a semi-reality. When you cast an illusion spell of 1st leve"
          + "l or higher, you can choose one inanimate, nonmagical object that is part of th"
          + "e illusion and make that object real. You can do this on your turn as a bonus a"
          + "ction while the spell is ongoing. The object remains real for 1 minute. For exa"
          + "mple, you can create an illusion of a bridge over a chasm and then make it real"
          + " long enough for your allies to cross. The object can't deal damage or otherwis"
          + "e directly harm anyone.\r\n"
          + "\r\n"
          + "", 14);
    } else if (subclass.equals("Necromancy")) {
      addFeature("Necromancy Savant:\r\n"
          + "Beginning when you select this school at 2nd level, the gold and time you must"
          + " spend to copy a Necromancy spell into your spellbook is halved.\r\n"
          + "\r\n"
          + "Grim Harvest:\r\n"
          + "At 2nd level, you gain the ability to reap life energy from creatures you kill "
          + "with your spells. Once per turn when you kill one or more creatures with a spel"
          + "l of 1st level or higher, you regain hit points equal to twice the spell's leve"
          + "l, or three times its level if the spell belongs to the School of Necromancy. Y"
          + "ou don't gain this benefit for killing constructs or undead.\r\n"
          + "\r\n"
          + "", 2);
      addFeature("Undead Thralls:\r\n"
          + "At 6th level, you add the Animate Dead spell to your spellbook if it is not the"
          + "re already. When you cast Animate Dead, you can target one additional corpse or"
          + " pile of bones, creating another zombie or skeleton, as appropriate. Whenever y"
          + "ou create an undead using a necromancy spell, it has additional benefits:\r\n"
          + "- The creature's hit point maximum is increased by an amount equal to your wiza"
          + "rd level.\r\n"
          + "- The creature adds your proficiency bonus to its weapon damage rolls.\r\n"
          + "\r\n"
          + "", 6);
      addFeature("Inured to Undeath:\r\n"
          + "Beginning at 10th level, you have resistance to necrotic damage, and your hit p"
          + "oint maximum can't be reduced. You have spent so much time dealing with undead a"
          + "nd the forces that animate them that you have become inured to some of their wors"
          + "t effects.\r\n"
          + "\r\n"
          + "", 10);
      addFeature("Command Undead:\r\n"
          + "Starting at 14th level, you can use magic to bring undead under your control, eve"
          + "n those created by other wizards. As an action, you can choose one undead that yo"
          + "u can see within 60 feet of you. That creature must make a Charisma saving throw "
          + "against your wizard spell save DC. If it succeeds, you can't use this feature on "
          + "it again. If it fails, it becomes friendly to you and obeys your commands until y"
          + "ou use this feature again. Intelligent undead are harder to control in this way. "
          + "If the target has an Intelligence of 8 or higher, it has advantage on the saving "
          + "throw. If it fails the saving throw and has an Intelligence of 12 or higher, it c"
          + "an repeat the saving throw at the end of every hour until it succeeds and breaks "
          + "free.\r\n\r\n", 14);
    } else if (subclass.equals("Transmutation")) {
      addFeature("Transmutation Savant:\r\n"
          + "Beginning when you select this school at 2nd level, the gold and time you must sp"
          + "end to copy a Transmutation spell into your spellbook is halved.\r\n"
          + "\r\n"
          + "Minor Alchemy:\r\n"
          + "Starting at 2nd level when you select this school, you can temporarily alter the "
          + "physical properties of one nonmagical object, changing it from one substance into "
          + "another. You perform a special alchemical procedure on one object composed entirely"
          + " of wood, stone (but not a gemstone), iron, copper, or silver, transforming it int"
          + "o a different one of those materials. For each 10 minutes you spend performing the"
          + " procedure, you can transform up to 1 cubic foot of material. After 1 hour, or unt"
          + "il you lose your concentration (as if you were concentrating on a spell), the mate"
          + "rial reverts to its original substance.\r\n"
          + "\r\n"
          + "", 2);
      addFeature("Transmuter's Stone:\r\n"
          + "Starting at 6th level, you can spend 8 hours creating a transmuter's stone that st"
          + "ores transmutation magic. You can benefit from the stone yourself or give it to an"
          + "other creature. A creature gains a benefit of your choice as long as the stone is "
          + "in the creature's possession. When you create the stone, choose the benefit from t"
          + "he following options:\r\n"
          + "- Darkvision out to a range of 60 feet\r\n"
          + "- An increase to speed of 10 feet while the creature is unencumbered\r\n"
          + "- Proficiency in Constitution saving throws\r\n"
          + "- Resistance to acid, cold, fire, lightning, or thunder damage (your choice whenev"
          + "er you choose this benefit)\r\n"
          + "Each time you cast a transmutation spell of 1st level or higher, you can change t"
          + "he effect of your stone if the stone is on your person. If you create a new transm"
          + "uter's stone, the previous one ceases to function.\r\n"
          + "\r\n"
          + "", 6);
      addFeature("Shapechanger:\r\n"
          + "At 10th level, you add the Polymorph spell to your spellbook, if it is not there al"
          + "ready. You can cast Polymorph without expending a spell slot. When you do so, you c"
          + "an target only yourself and transform into a beast whose challenge rating is 1 or l"
          + "ower. Once you cast Polymorph in this way, you can't do so again until you finish a"
          + " short or long rest, though you can still cast it normally using an available spell"
          + " slot.\r\n"
          + "\r\n"
          + "", 10);
      addFeature("Master Transmuter:\r\n"
          + "Starting at 14th level, you can use your action to consume the reserve of transmut"
          + "ation magic stored within your transmuter's stone in a single burst. When you do s"
          + "o, choose one of the following effects. Your transmuter's stone is destroyed and ca"
          + "n't be remade until you finish a long rest.\r\n"
          + "- Major Transformation\r\n"
          + "- Panacea\r\n"
          + "- Restore Life\r\n"
          + "- Restore Youth\r\n"
          + "\r\n"
          + "", 14);
    }

  }
}