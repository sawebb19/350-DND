package dndcompanion.character.chrclasses;

/**
 * Class for the Druid character class.

 * @author Sam Webb
 *
 */
@SuppressWarnings("serial")
public class Druid extends CharacterClass {
	/**
	 * Constructor for Druid Class.
	 */
    public Druid() {
        this.name = "Druid";
        this.hit = 8;
        this.saves[3] = 1; // Intelligence
        this.saves[4] = 1; // Wisdom
        this.features = new String[] {
                //Level 1
                  "Druidic:\r\n"
                  + "You know Druidic, the secret language of druids. You can speak the langua"
                  + "ge and use it to leave hidden messages. You and others who know this lang"
                  + "uage automatically spot such a message. Others spot the message's presenc"
                  + "e with a successful DC 15 Wisdom (Perception) check but can't decipher it"
                  + " without magic.\r\n\r\n"
                  + "Spellcasting:\r\n"
                  + "Drawing on the divine essence of nature itself, you can cast spells to sh"
                  + "ape that essence to your will. Wisdom is your spellcasting ability for yo"
                  + "ur druid spells, since your magic draws upon your devotion and attunement"
                  + " to nature. You use your Wisdom whenever a spell refers to your spellcast"
                  + "ing ability. In addition, you use your Wisdom modifier when setting the s"
                  + "aving throw DC for a druid spell you cast and when making an attack roll "
                  + "with one. You can use a druidic focus as a spellcasting focus for your dr"
                  + "uid spells. More info is online, look it up.\r\n\r\n", 
                //Level 2
                  "Wild Shape:\r\n"
                  + "Starting at 2nd level, you can use your action to magically assume the sh"
                  + "ape of a beast that you have seen before. You can use this feature twice."
                  + " You regain expended uses when you finish a short or long rest.\r\n"
                  + "Your druid level determines the beasts you can transform into, as shown i"
                  + "n the Beast Shapes table. At 2nd level, for example, you can transform in"
                  + "to any beast that has a challenge rating of 1/4 or lower that doesn't hav"
                  + "e a flying or swimming speed. More Wild Shape info is online, look it up."
                  + "\r\n\r\n",
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
                  "Timeless Body:\r\n"
                  + "Starting at 18th level, the primal magic that you wield causes you to age"
                  + " more slowly. For every 10 years that pass, your body ages only 1 year."
                  + "\r\n\r\n"
                  + "Beast Spells:\r\n"
                  + "Beginning at 18th level, you can cast many of your druid spells in any sh"
                  + "ape you assume using Wild Shape. You can perform the somatic and verbal c"
                  + "omponents of a druid spell while in a beast shape, but you aren't able to"
                  + " provide material components.\r\n\r\n",
                //Level 19
                  "",
                //Level 20
                  "Archdruid:\r\n"
                  + "At 20th level, you can use your Wild Shape an unlimited number of times. "
                  + "Additionally, you can ignore the verbal and somatic components of your dr"
                  + "uid spells, as well as any material components that lack a cost and aren'"
                  + "t consumed by a spell. You gain this benefit in both your normal shape an"
                  + "d your beast shape from Wild Shape.\r\n\r\n"
                  };
    }

    /**
     * Constructor for Druid Class with Subclass

     * @param subclass input subclass for the player's Druid Class.
     */
    public Druid(String subclass) {
      this();
      if (subclass.equals("Land")) {
        addFeature("Bonus Cantrip:\r\n"
            + "When you choose this circle at 2nd level, you learn one additional druid cantri"
            + "p of your choice. This cantrip doesn’t count against the number of druid cantri"
            + "ps you know.\r\n"
            + "\r\n"
            + "Natural Recovery:\r\n"
            + "Starting at 2nd level, you can regain some of your magical energy by sitting in"
            + " meditation and communing with nature. During a short rest, you choose expended"
            + " spell slots to recover. The spell slots can have a combined level that is equa"
            + "l to or less than half your druid level (rounded up), and none of the slots can"
            + " be 6th level or higher. You can't use this feature again until you finish a lo"
            + "ng rest. For example, when you are a 4th-level druid, you can recover up to two"
            + " levels worth of spell slots. You can recover either a 2nd-level slot or two 1s"
            + "t-level slots.\r\n\r\n", 2);
        addFeature("Circle Spells:\r\n"
            + "Your mystical connection to the land infuses you with the ability to cast certa"
            + "in spells. At 3rd, 5th, 7th, and 9th level you gain access to circle spells con"
            + "nected to the land where you became a druid. Choose that land – arctic, coast, "
            + "desert, forest, grassland, mountain, swamp, or Underdark – and consult the asso"
            + "ciated list of spells. Once you gain access to a circle spell, you always have "
            + "it prepared, and it doesn't count against the number of spells you can prepare "
            + "each day. If you gain access to a spell that doesn't appear on the druid spell "
            + "list, the spell is nonetheless a druid spell for you.\r\n\r\n", 3);
        addFeature("Land's Stride:\r\n"
            + "Starting at 6th level, moving through nonmagical difficult terrain costs you no"
            + " extra movement. You can also pass through nonmagical plants without being slow"
            + "ed by them and without taking damage from them if they have thorns, spines, or "
            + "a similar hazard. In addition, you have advantage on saving throws against plan"
            + "ts that are magically created or manipulated to impede movement, such as those "
            + "created by the Entangle spell.\r\n\r\n", 6);
        addFeature("Nature's Ward:\r\n"
            + "When you reach 10th level, you can't be charmed or frightened by elementals or "
            + "fey, and you are immune to poison and disease.\r\n\r\n"
            + "", 10);
        addFeature("Nature's Sanctuary:\r\n"
            + "When you reach 14th level, creatures of the natural world sense your connection"
            + " to nature and become hesitant to attack you. When a beast or plant creature at"
            + "tacks you, that creature must make a Wisdom saving throw against your druid spe"
            + "ll save DC. On a failed save, the creature must choose a different target, or t"
            + "he attack automatically misses. On a successful save, the creature is immune to"
            + " this effect for 24 hours. The creature is aware of this effect before it makes"
            + " its attack against you.\r\n\r\n", 14);
      } else if (subclass.equals("Moon")) {
        addFeature("Combat Wild Shape:\r\n"
            + "When you choose this circle at 2nd level, you gain the ability to use Wild Shap"
            + "e on your turn as a bonus action, rather than as an action. Additionally, while"
            + " you are transformed by Wild Shape, you can use a bonus action to expend one sp"
            + "ell slot to regain 1d8 hit points per level of the spell slot expended.\r\n\r\n"
            + "Circle Forms:\r\n"
            + "The rites of your circle grant you the ability to transform into more dangerous"
            + " animal forms. Starting at 2nd level, you can use your Wild Shape to transform "
            + "into a beast with a challenge rating as high as 1. You ignore the Max. CR colum"
            + "n of the Beast Shapes table, but must abide by the other limitations there. Sta"
            + "rting at 6th level, you can transform into a beast with a challenge rating as h"
            + "igh as your druid level divided by 3, rounded down.\r\n\r\n", 2);
        addFeature("Primal Strike:\r\n"
            + "Starting at 6th level, your attacks in beast form count as magical for the purp"
            + "ose of overcoming resistance and immunity to nonmagical attacks and damage.\r\n"
            + "\r\n", 6);
        addFeature("Elemental Wild Shape:\r\n"
            + "At 10th level, you can expend two uses of Wild Shape at the same time to transf"
            + "orm into an air elemental, an earth elemental, a fire elemental, or a water ele"
            + "mental.\r\n\r\n", 10);
        addFeature("Thousand Forms:\r\n"
            + "By 14th level, you have learned to use magic to alter your physical form in mor"
            + "e subtle ways. You can cast the Alter Self spell at will.\r\n\r\n", 14);
      }
        
    }
}
