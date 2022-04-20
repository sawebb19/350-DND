package dndcompanion.character.chrclasses;

/**
 * Class for the Warlock character class.

 * @author Sam Webb
 * @author Nick Ford
 *
 */
@SuppressWarnings("serial")
public class Warlock extends CharacterClass {
	/**
	 * Constructor for Warlock Class.
	 */
    public Warlock() {
        this.name = "Warlock";
        this.hit = 8;
        this.saves[4] = 1; // Wisdom
        this.saves[5] = 1; // Charisma
        this.features = new String[] {
                //Level 1
                  "Pact Magic:\r\n"
                  + "Your arcane research and the magic bestowed on you by your patron have gi"
                  + "ven you facility with spells. Charisma is your spellcasting ability for y"
                  + "our warlock spells, so you use your Charisma whenever a spell refers to y"
                  + "our spellcasting ability. In addition, you use your Charisma modifier whe"
                  + "n setting the saving throw DC for a warlock spell you cast and when makin"
                  + "g an attack roll with one.\r\n\r\n", 
                //Level 2
                  "Eldritch Invocations:\r\n"
                  + "In your study of occult lore, you have unearthed Eldritch Invocations, fr"
                  + "agments of forbidden knowledge that imbue you with an abiding magical abi"
                  + "lity. At 2nd level, you gain two eldritch invocations of your choice. Whe"
                  + "n you gain certain warlock levels, you gain additional invocations of you"
                  + "r choice, as shown in the Invocations Known column of the Warlock table. "
                  + "A level prerequisite refers to your level in this class. Additionally, wh"
                  + "en you gain a level in this class, you can choose one of the invocations "
                  + "you know and replace it with another invocation that you could learn at t"
                  + "hat level.\r\n\r\n",
                //Level 3
                  "Pact Boon:\r\n"
                  + "At 3rd level, your otherworldly patron bestows a gift upon you for your l"
                  + "oyal service. You gain one of the following features of your choice.\r\n"
                  + "- Pact of the Blade\r\n"
                  + "- Pact of the Chain\r\n"
                  + "- Pact of the Tome\r\n\r\n",
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
                  "Mystic Arcanum:\r\n"
                  + "At 11th level, your patron bestows upon you a magical secret called an ar"
                  + "canum. Choose one 6th-level spell from the warlock spell list as this arc"
                  + "anum. You can cast your arcanum spell once without expending a spell slot"
                  + ". You must finish a long rest before you can do so again. At higher level"
                  + "s, you gain more warlock spells of your choice that can be cast in this w"
                  + "ay: one 7th-level spell at 13th level, one 8th-level spell at 15th level,"
                  + " and one 9th-level spell at 17th level. You regain all uses of your Mysti"
                  + "c Arcanum when you finish a long rest.\r\n\r\n",
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
                  "Eldritch Master:\r\n"
                  + "At 20th level, you can draw on your inner reserve of mystical power while"
                  + " entreating your patron to regain expended spell slots. You can spend 1 m"
                  + "inute entreating your patron for aid to regain all your expended spell sl"
                  + "ots from your Pact Magic feature. Once you regain spell slots with this f"
                  + "eature, you must finish a long rest before you can do so again.\r\n\r\n"
                  };
    }

    /**
     * Constructor for Warlock Class with Subclass

     * @param subclass input subclass for the player's Barbarian Class.
     */
    public Warlock(String subclass) {
      this();
      if (subclass.equals("Archfey")) {
        addFeature("Expanded Spell List:\r\n"
            + "The Archfey lets you choose from an expanded list of spells when you learn a wa"
            + "rlock spell. It's online, just look it up.\r\n\r\n"
            + "Fey Presence:\r\n"
            + "Starting at 1st level, your patron bestows upon you the ability to project the "
            + "beguiling and fearsome presence of the fey. As an action, you can cause each cr"
            + "eature in a 10-foot cube originating from you to make a Wisdom saving throw aga"
            + "inst your warlock spell save DC. The creatures that fail their saving throws ar"
            + "e all charmed or frightened by you (your choice) until the end of your next tur"
            + "n. Once you use this feature, you can't use it again until you finish a short o"
            + "r long rest.\r\n\r\n"
            + "", 1);
        addFeature("Misty Escape:\r\n"
            + "Starting at 6th level, you can vanish in a puff of mist in response to harm. Wh"
            + "en you take damage, you can use your reaction to turn invisible and teleport up"
            + " to 60 feet to an unoccupied space you can see. You remain invisible until the "
            + "start of your next turn or until you attack or cast a spell. Once you use this "
            + "feature, you can't use it again until you finish a short or long rest.\r\n\r\n",
            6);
        addFeature("Beguiling Defenses:\r\n"
            + "Beginning at 10th level, your patron teaches you how to turn the mind-affecting"
            + " magic of your enemies against them. You are immune to being charmed, and when "
            + "another creature attempts to charm you, you can use your reaction to attempt to"
            + " turn the charm back on that creature. The creature must succeed on a Wisdom sa"
            + "ving throw against your warlock spell save DC or be charmed by you for 1 minute"
            + " or until the creature takes any damage.\r\n\r\n", 10);
        addFeature("Dark Delirium:\r\n"
            + "Starting at 14th level, you can plunge a creature into an illusory realm. As an"
            + " action, choose a creature that you can see within 60 feet of you. It must make"
            + " a Wisdom saving throw against your warlock spell save DC. On a failed save, it"
            + " is charmed or frightened by you (your choice) for 1 minute or until your conce"
            + "ntration is broken (as if you are concentrating on a spell). This effect ends e"
            + "arly if the creature takes any damage. Until this illusion ends, the creature t"
            + "hinks it is lost in a misty realm, the appearance of which you choose. The crea"
            + "ture can see and hear only itself, you, and the illusion. You must finish a sho"
            + "rt or long rest before you can use this feature again.\r\n\r\n", 14);
      } else if (subclass.equals("Fiend")) {
        addFeature("Expanded Spell List:\r\n"
            + "The Fiend lets you choose from an expanded list of spells when you learn a warl"
            + "ock spell. It's online, just look it up.\r\n\r\n"
            + "Dark One's Blessing\r\n"
            + "Starting at 1st level, when you reduce a hostile creature to 0 hit points, you "
            + "gain temporary hit points equal to your Charisma modifier + your warlock level "
            + "(minimum of 1).\r\n\r\n", 1);
        addFeature("Dark One's Own Luck\r\n"
            + "Starting at 6th level, you can call on your patron to alter fate in your favor."
            + " When you make an ability check or a saving throw, you can use this feature to "
            + "add a d10 to your roll. You can do so after seeing the initial roll but before "
            + "any of the roll's effects occur. Once you use this feature, you can't use it ag"
            + "ain until you finish a short or long rest.\r\n\r\n"
            + "", 6);
        addFeature("Fiendish Resilience:\r\n"
            + "Starting at 10th level, you can choose one damage type when you finish a short "
            + "or long rest. You gain resistance to that damage type until you choose a differ"
            + "ent one with this feature. Damage from magical weapons or silver weapons ignore"
            + "s this resistance.\r\n\r\n", 10);
        addFeature("Hurl Through Hell:\r\n"
            + "Starting at 14th level, when you hit a creature with an attack, you can use thi"
            + "s feature to instantly transport the target through the lower planes. The creat"
            + "ure disappears and hurtles through a nightmare landscape. At the end of your ne"
            + "xt turn, the target returns to the space it previously occupied, or the nearest"
            + " unoccupied space. If the target is not a fiend, it takes 10d10 psychic damage "
            + "as it reels from its horrific experience. Once you use this feature, you can't "
            + "use it again until you finish a long rest.\r\n\r\n", 14);
      } else if (subclass.equals("Great Old One")) {
        addFeature("Expanded Spell List:\r\n"
            + "The Great Old One lets you choose from an expanded list of spells when you lear"
            + "n a warlock spell. It's online, just look it up.\r\n\r\n"
            + "Awakened Mind:\r\n"
            + "Starting at 1st level, your alien knowledge gives you the ability to touch the "
            + "minds of other creatures. You can telepathically speak to any creature you can "
            + "see within 30 feet of you. You don't need to share a language with the creature"
            + " for it to understand your telepathic utterances, but the creature must be able"
            + " to understand at least one language.\r\n\r\n", 1);
        addFeature("Entropic Ward:\r\n"
            + "At 6th level, you learn to magically ward yourself against attack and to turn a"
            + "n enemy's failed strike into good luck for yourself. When a creature makes an a"
            + "ttack roll against you, you can use your reaction to impose disadvantage on tha"
            + "t roll. If the attack misses you, your next attack roll against the creature ha"
            + "s advantage if you make it before the end of your next turn. Once you use this "
            + "feature, you can't use it again until you finish a short or long rest.\r\n\r\n",
            6);
        addFeature("Thought Shield:\r\n"
            + "Starting at 10th level, your thoughts can't be read by telepathy or other means"
            + " unless you allow it. You also have resistance to psychic damage, and whenever "
            + "a creature deals psychic damage to you, that creature takes the same amount of "
            + "damage that you do.\r\n\r\n", 10);
        addFeature("Create Thrall:\r\n"
            + "At 14th level, you gain the ability to infect a humanoid's mind with the alien "
            + "magic of your patron. You can use your action to touch an incapacitated humanoi"
            + "d. That creature is then charmed by you until a Remove Curse spell is cast on i"
            + "t, the charmed condition is removed from it, or you use this feature again. You"
            + " can communicate telepathically with the charmed creature as long as the two of"
            + " you are on the same plane of existence.\r\n\r\n", 14);
      }
        
    }
}