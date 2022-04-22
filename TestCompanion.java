package dndcompanion;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.RepeatedTest;
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
import dndcompanion.character.chrraces.Subrace;
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
		object = new Barbarian();
		object = new Bard();
		object = new Cleric();
		object = new Druid();
		object = new Fighter();
		object = new Monk();
		object = new Paladin();
		object = new Ranger();
		object = new Rogue();
		object = new Sorcerer();
		object = new Warlock();
		object = new Wizard();
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
		String testStr = "race=" + "UrMom" + "{\n\t" 		
		        + "size=" + "Big" + "\n\t" 
		        + "speed=" + 5 + "\n\t" 
		        + "langs=" + "[Cmoon, Elvish]" + "\n\t" 
		        + "mods=" + "[0, 0, 0, 0, 0, 2]" + "\n}\n";
		assertEquals(object.toString(), testStr);
	}
	
	@Test
	public void testSubraceMethods() {
		Subrace object = new Elf("Wood");
		assertEquals(object.getSubrace(), "Wood");
		String testStr = "Elf" + "{\n\t" 
		        + "subrace=" + "Wood" + "\n\t" 
		        + "size=" + "Medium" + "\n\t" 
		        + "speed=" + 35 + "\n\t" 
		        + "langs=" + "[Common, Elvish]" + "\n\t" 
		        + "mods=" + "[0, 2, 0, 0, 1, 0]" + "\n}\n";
		assertEquals(object.toString(), testStr);
	}
	
	@Test
	public void testDndCharMethods() {
		DndChar object = new DndChar();
		assertEquals(object.getName(), null);
		String dummy1 = null;
		String dummy2 = null;
		String testStr = dummy1 + dummy2;
		assertEquals(object.getAlignment(), testStr);
		assertEquals(object.getRace(), null);
		assertEquals(object.getCharClass(), null);
		assertEquals(object.getLevel(), 0);
		assertEquals(object.getExp(), 0);
		assertEquals(object.getStats(), null);
		assertEquals(object.getSkills(), null);
		assertEquals(object.getBackground(), null);
		assertEquals(object.getTraits(), null);
		assertEquals(object.getIdeals(), null);
		assertEquals(object.getBonds(), null);
		assertEquals(object.getFlaws(), null);
		assertEquals(object.getArmor(), 0);
		assertEquals(object.getMaxHp(), 0);
		assertEquals(object.getFeatures(), null);
		assertEquals(object.getProfs(), null);
		assertEquals(object.getEquip(), null);
		assertEquals(object.getPlayer(), null);
		
		object = new DndChar("Biff", "C", "E", new Human(), new Fighter(), 10, 64000,
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


	}
	
	/**
	 * Repeated Test so that many randomly generated rolls can be checked.
	 */
	@RepeatedTest(20)
	public void testDieMethods() {
		RollingGui cube = new RollingGui(6);
		int rollNum = cube.roll();
		assertTrue(rollNum < 7 && rollNum > 0);
	}
}
