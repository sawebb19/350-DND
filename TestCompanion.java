package DNDCompanion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import DNDCompanion.character.chrclasses.Barbarian;
import DNDCompanion.character.chrclasses.Bard;
import DNDCompanion.character.chrclasses.CharacterClass;
import DNDCompanion.character.chrclasses.Cleric;
import DNDCompanion.character.chrclasses.Druid;
import DNDCompanion.character.chrclasses.Fighter;
import DNDCompanion.character.chrclasses.Monk;
import DNDCompanion.character.chrclasses.Paladin;
import DNDCompanion.character.chrclasses.Ranger;
import DNDCompanion.character.chrclasses.Rogue;
import DNDCompanion.character.chrclasses.Sorcerer;
import DNDCompanion.character.chrclasses.Warlock;
import DNDCompanion.character.chrclasses.Wizard;

import DNDCompanion.character.chrraces.Dragonborn;
import DNDCompanion.character.chrraces.DwarfHill;
import DNDCompanion.character.chrraces.DwarfMountain;
import DNDCompanion.character.chrraces.ElfHigh;
import DNDCompanion.character.chrraces.ElfWood;
import DNDCompanion.character.chrraces.GnomeDeep;
import DNDCompanion.character.chrraces.GnomeRock;
import DNDCompanion.character.chrraces.HalfElf;
import DNDCompanion.character.chrraces.HalfOrc;
import DNDCompanion.character.chrraces.HalflingLightfoot;
import DNDCompanion.character.chrraces.HalflingStout;
import DNDCompanion.character.chrraces.Human;
import DNDCompanion.character.chrraces.Race;
import DNDCompanion.character.chrraces.Tiefling;

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
	}
	@Test
	public void testRaceObjectCreation() {
		Race object = null;	
		object = new Dragonborn();
		object = new DwarfHill();
		object = new DwarfMountain();
		object = new ElfHigh();
		object = new ElfWood();
		object = new GnomeDeep();
		object = new GnomeRock();
		object = new HalfElf();
		object = new HalfOrc();
		object = new HalflingLightfoot();
		object = new HalflingStout();
		object = new Human();
		object = new Tiefling();
	}
	
	@Test
	public void testHumanMethods() {
		Human object = new Human();
		object.setEthnicity("test");
		assertEquals(object.getEthnicity(), "test");
		assertEquals(object.getSubrace(), null);
		String testStr = "Human" + "{\n\t" + "ethnicity=" + "test" + "\n\t" + "size=" + "Medium" + "\n\t" + "speed=" + "30" + "\n\t" 
        + "langs=" + "[Common]" + "\n\t" + "mods=" + "[1, 1, 1, 1, 1, 1]" + "\n}\n";
		assertEquals(object.toString(), testStr);
	}
	
	@Test
	public void testDragonbornMethods() {
		Dragonborn object = new Dragonborn();
		object.setAncestry("test");
		assertEquals(object.getAncestry(), "test");
		assertEquals(object.getSubrace(), null);
		String testStr = "Dragonborn" + "{\n\t" + "ancestry=" + "test" + "\n\t" + "size=" + "Medium" + "\n\t" + "speed=" + "30" + "\n\t" 
        + "langs=" + "[Common, Draconic]" + "\n\t" + "mods=" + "[2, 0, 0, 0, 0, 1]" + "\n}\n";
		assertEquals(object.toString(), testStr);
	}
	
	@Test
	public void testRaceMethods() {
		Race object = new HalfElf();
		assertEquals(object.getName(), "Half-Elf");
		assertEquals(object.getSize(), "Medium");
		assertEquals(object.getSpeed(), 30);
//		assertEquals(object.getMods(), new int[] {0, 0, 0, 0, 0, 2});
		
	}
	
	@Test
	public void testSubraceMethods() {
		
	}
	
	@Test
	public void testBlank() {
		
	}
}
