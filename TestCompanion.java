package dndcompanion;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import dndcompanion.character.DndChar;
import dndcompanion.character.chrclasses.Barbarian;
import dndcompanion.character.chrclasses.Bard;
import dndcompanion.character.chrclasses.CharacterClass;
import dndcompanion.character.chrclasses.Cleric;
import dndcompanion.character.chrclasses.Druid;
import dndcompanion.character.chrclasses.Fighter;
import dndcompanion.character.chrclasses.Monk;
import dndcompanion.character.chrclasses.Paladin;
import dndcompanion.character.chrclasses.Ranger;
import dndcompanion.character.chrclasses.Rogue;
import dndcompanion.character.chrclasses.Sorcerer;
import dndcompanion.character.chrclasses.Warlock;
import dndcompanion.character.chrclasses.Wizard;
import dndcompanion.character.chrraces.Dragonborn;
import dndcompanion.character.chrraces.Dwarf;
import dndcompanion.character.chrraces.Elf;
import dndcompanion.character.chrraces.Gnome;
import dndcompanion.character.chrraces.HalfElf;
import dndcompanion.character.chrraces.HalfOrc;
import dndcompanion.character.chrraces.Halfling;
import dndcompanion.character.chrraces.Human;
import dndcompanion.character.chrraces.Race;
import dndcompanion.character.chrraces.Tiefling;

/**
 * Class used for testing all of the DNDCompanion classes.

 * @author Nick Ford
 *
 */
public class TestCompanion {
	@Test
	public void testClassObjectCreation() {
		CharacterClass object = null;
		String[] subclass;
		object = new Barbarian();
		subclass = object.getSubclasses();
		for(int i = 0; i < subclass.length; i++) {
		  object = new Barbarian(subclass[i]);
		}
		object = new Bard();
		subclass = object.getSubclasses();
        for(int i = 0; i < subclass.length; i++) {
          object = new Bard(subclass[i]);
        }
		object = new Cleric();
		subclass = object.getSubclasses();
        for(int i = 0; i < subclass.length; i++) {
          object = new Cleric(subclass[i]);
        }
		object = new Druid();
		subclass = object.getSubclasses();
        for(int i = 0; i < subclass.length; i++) {
          object = new Druid(subclass[i]);
        }
		object = new Fighter();
		subclass = object.getSubclasses();
        for(int i = 0; i < subclass.length; i++) {
          object = new Fighter(subclass[i]);
        }
		object = new Monk();
		subclass = object.getSubclasses();
        for(int i = 0; i < subclass.length; i++) {
          object = new Monk(subclass[i]);
        }
		object = new Paladin();
		subclass = object.getSubclasses();
        for(int i = 0; i < subclass.length; i++) {
          object = new Paladin(subclass[i]);
        }
		object = new Ranger();
		subclass = object.getSubclasses();
        for(int i = 0; i < subclass.length; i++) {
          object = new Ranger(subclass[i]);
        }
		object = new Rogue();
		subclass = object.getSubclasses();
        for(int i = 0; i < subclass.length; i++) {
          object = new Rogue(subclass[i]);
        }
		object = new Sorcerer();
		subclass = object.getSubclasses();
        for(int i = 0; i < subclass.length; i++) {
          object = new Sorcerer(subclass[i]);
        }
		object = new Warlock();
		subclass = object.getSubclasses();
        for(int i = 0; i < subclass.length; i++) {
          object = new Warlock(subclass[i]);
        }
		
		object = new Wizard();
		subclass = object.getSubclasses();
        for(int i = 0; i < subclass.length; i++) {
          object = new Wizard(subclass[i]);
        }
        assertTrue(object.getSubclass().equals("Transmutation"));
        object.addFeature("I am better.\r\n\r\n", 15);
        assertTrue(object.getFeatures()[14].contains("I am better.\r\n\r\n"));
		
        
		object.getName();
	}
	
	@Test
	public void testCharacterClassMethods() {
		CharacterClass object = new Barbarian();
		object.setName("UrMom");
		assertEquals(object.getName(), "UrMom");
		object.setHit(69);
		assertEquals(object.getHit(), 69);
		int[] intList = new int[] {0, 0, 1, 0, 1, 0};
		object.setSaves(new int[] {0, 0, 1, 0, 1, 0});
		for (int i = 0; i < intList.length; i++) {
			assertEquals(object.getSaves()[i], intList[i]);
		}
		String testStr = "class=" + "UrMom" + "{\n\t" + "hit=" + 69 + "\n\t"
		        + "saves=" + "[0, 0, 1, 0, 1, 0]" + "\n}\n";
		assertEquals(object.toString(), testStr);
	}
	
	@Test
	public void testRaceObjectCreation() {
		Race object;	
		object = new Dragonborn();
		object = new Dragonborn("Silver");
		object = new Dwarf();
		object = new Dwarf("Hill");
		object = new Dwarf("Mountain");
		object = new Elf();
		object = new Elf("High");
		object = new Elf("Wood");
		object = new Gnome();
		object = new Gnome("Deep");
		object = new Gnome("Rock");
		object = new HalfElf();
		object = new HalfOrc();
		object = new Halfling();
		object = new Halfling("Lightfoot");
		object = new Halfling("Stout");
		object = new Human();
		object = new Human("Kaltari");
		object.setSubrace("Other");
		object = new Tiefling();
		object.getName();
		
	}
	
	@Test
	public void testHumanMethods() {
		Human object = new Human();
		object.setEthnicity("test");
		assertEquals(object.getEthnicity(), "test");
		assertEquals(object.getSubrace(), null);
		String testStr = "Human" + "{\n\t" + "ethnicity=" + "test" + "\n\t" + "size="
		+ "Medium" + "\n\t" + "speed=" + "30" + "\n\t" 
        + "langs=" + "[Common]" + "\n\t" + "mods=" + "[1, 1, 1, 1, 1, 1]" + "\n}\n";
		assertEquals(object.toString(), testStr);
	}
	
	@Test
	public void testDragonbornMethods() {
		Dragonborn object = new Dragonborn();
		object.setAncestry("test");
		assertEquals(object.getAncestry(), "test");
		assertEquals(object.getSubrace(), null);
		String testStr = "Dragonborn" + "{\n\t" + "ancestry=" + "test" + "\n\t"
				+ "size=" + "Medium" + "\n\t" + "speed=" + "30" + "\n\t" 
				+ "langs=" + "[Common, Draconic]" + "\n\t" + "mods=" 
				+ "[2, 0, 0, 0, 0, 1]" + "\n}\n";
		assertEquals(object.toString(), testStr);
	}
	
	@Test
	public void testDummyGetSubraces() {
		Race object = new HalfElf();
		object.getSubrace();
		object = new HalfOrc();
		object.getSubrace();
		object = new Tiefling();
		object.getSubrace();
	}
	
	@Test
	public void testRaceMethods() {
		Race object = new HalfElf();
		object.setName("UrMom");
		assertEquals(object.getName(), "UrMom");
		object.setSize("Big");
		assertEquals(object.getSize(), "Big");
		object.setSpeed(5);
		assertEquals(object.getSpeed(), 5);
		object.setMods(new int[] {0, 0, 0, 0, 0, 2});
		int[] intList = new int[] {0, 0, 0, 0, 0, 2};
		for (int i = 0; i < intList.length; i++) {
			assertEquals(object.getMods()[i], intList[i]);
		}
		object.setSubraces(new String[] {"none"});
		String[] strList = new String[] {"none"};
		for (int i = 0; i < strList.length; i++) {
			assertEquals(object.getSubraces()[i], strList[i]);
		}
	}
	
	@Test
	public void testDndCharMethods() {
		DndChar object = new DndChar();
		assertEquals(object.getName(), null);
		object.setName("A");
		assertEquals(object.getName(), "A");
		
		assertEquals(object.getAlignment(), null);
		object.setAlignment("NN");
		assertEquals(object.getAlignment(), "NN");
		
		assertEquals(object.getRace(), null);
		Race race = new Elf();
		object.setRace(race);
        assertEquals(object.getRace(), race);
		
		assertEquals(object.getCharClass(), null);
		CharacterClass charClass = new Fighter();
        object.setCharClass(charClass);
        assertEquals(object.getCharClass(), charClass);
		
		assertEquals(object.getLevel(), 0);
		object.setLevel(5);
		assertEquals(object.getLevel(), 5);
		
		assertEquals(object.getExp(), 0);
		object.setExp(50);
        assertEquals(object.getExp(), 50);
		
		assertEquals(object.getStats(), null);
		int[] newStats = new int[] {1, 1, 1, 1, 1, 1};
		object.setStats(newStats);
		assertEquals(object.getStats(), newStats);
		
		assertEquals(object.getSkills(), null);
		object.setSkills("B");
		assertEquals(object.getSkills(), "B");
		
		assertEquals(object.getBackground(), null);
		object.setBackground("C");
		assertEquals(object.getBackground(), "C");
		
		assertEquals(object.getTraits(), null);
		object.setTraits("D");
		assertEquals(object.getTraits(), "D");
		
		assertEquals(object.getIdeals(), null);
		object.setIdeals("E");
		assertEquals(object.getIdeals(), "E");
		
		assertEquals(object.getBonds(), null);
		object.setBonds("F");
		assertEquals(object.getBonds(), "F");
		
		assertEquals(object.getFlaws(), null);
		object.setFlaws("G");
		assertEquals(object.getFlaws(), "G");
		
		assertEquals(object.getArmor(), 0);
		object.setArmor(1);
		assertEquals(object.getArmor(), 1);
		
		assertEquals(object.getMaxHp(), 0);
		object.setMaxHp(2);
		assertEquals(object.getMaxHp(), 2);
		
		assertEquals(object.getFeatures(), null);
		object.setFeatures("H");
		assertEquals(object.getFeatures(), "H");
		
		assertEquals(object.getProfs(), null);
		object.setProfs("I");
		assertEquals(object.getProfs(), "I");
		
		assertEquals(object.getEquip(), null);
		object.setEquip("J");
		assertEquals(object.getEquip(), "J");
		
		assertEquals(object.getPlayer(), null);
		object.setPlayer("K");
		assertEquals(object.getPlayer(), "K");
		
		
		object = new DndChar("Biff", "CE", new Human(), new Fighter(), 10, 64000,
				new int[] {20, 8, 20, 2, 5, 10}, "Deception", "Acolyte", 
				"Bad Traits", "ideally evil", "blood bond", "psychotic flaw", 15,
				64, "Human features", "simple weapons", "just a knife", "no one");
		assertEquals(object.getName(), "Biff");
		assertEquals(object.getAlignment(), "CE");
		assertEquals(object.getRace().getName(), "Human");
		assertEquals(object.getCharClass().getName(), "Fighter");
		assertEquals(object.getLevel(), 10);
		assertEquals(object.getExp(), 64000);
		int[] intList = new int[] {20, 8, 20, 2, 5, 10};
		for (int i =  0; i < intList.length; i++) {
			assertEquals(object.getStats()[i], intList[i]);
		}
		assertEquals(object.getSkills(), "Deception");
		assertEquals(object.getBackground(), "Acolyte");
		assertEquals(object.getTraits(), "Bad Traits");
		assertEquals(object.getIdeals(), "ideally evil");
		assertEquals(object.getBonds(), "blood bond");
		assertEquals(object.getFlaws(), "psychotic flaw");
		assertEquals(object.getArmor(), 15);
		assertEquals(object.getMaxHp(), 64);
		assertEquals(object.getFeatures(), "Human features");
		assertEquals(object.getProfs(), "simple weapons");
		assertEquals(object.getEquip(), "just a knife");
		assertEquals(object.getPlayer(), "no one");
		
		//race gen
		object.raceGen(0);
		assertTrue(object.getRace() instanceof Dragonborn);
		object.raceGen(1);
        assertTrue(object.getRace() instanceof Dwarf);
        object.raceGen(2);
        assertTrue(object.getRace() instanceof Elf);
        object.raceGen(3);
        assertTrue(object.getRace() instanceof Gnome);
        object.raceGen(4);
        assertTrue(object.getRace() instanceof HalfElf);
        object.raceGen(5);
        assertTrue(object.getRace() instanceof Halfling);
        object.raceGen(6);
        assertTrue(object.getRace() instanceof HalfOrc);
        object.raceGen(7);
        assertTrue(object.getRace() instanceof Human);
        object.raceGen(8);
        assertTrue(object.getRace() instanceof Tiefling);
        
        //class gen
        object.classGen(0);
        assertTrue(object.getCharClass() instanceof Barbarian);
        object.classGen(1);
        assertTrue(object.getCharClass() instanceof Bard);
        object.classGen(2);
        assertTrue(object.getCharClass() instanceof Cleric);
        object.classGen(3);
        assertTrue(object.getCharClass() instanceof Druid);
        object.classGen(4);
        assertTrue(object.getCharClass() instanceof Fighter);
        object.classGen(5);
        assertTrue(object.getCharClass() instanceof Monk);
        object.classGen(6);
        assertTrue(object.getCharClass() instanceof Paladin);
        object.classGen(7);
        assertTrue(object.getCharClass() instanceof Ranger);
        object.classGen(8);
        assertTrue(object.getCharClass() instanceof Rogue);
        object.classGen(9);
        assertTrue(object.getCharClass() instanceof Sorcerer);
        object.classGen(10);
        assertTrue(object.getCharClass() instanceof Warlock);
        object.classGen(11);
        assertTrue(object.getCharClass() instanceof Wizard);

	}
	
	@Test
    public void testClassWithSubclass() {
	  
	}
	
}
