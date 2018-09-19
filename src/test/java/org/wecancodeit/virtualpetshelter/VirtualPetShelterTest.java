package org.wecancodeit.virtualpetshelter;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class VirtualPetShelterTest {

	
	@Test
	public void assertShelterReturnsTextForOneContainedPet()
	{
		// assemble
		VirtualPetShelter oShelterTest = new VirtualPetShelter();
		AbstractVirtualPet oPetOne = new VirtualPet("Jack", "A rogue");
		String sExpectedOutput = "Jack 100 100 100 100";
		// administer
		oShelterTest.admitPet(oPetOne);
		 String[] aRawOutput = oShelterTest.getPetStatistics();
		 String sActualOutput = String.join(" ", aRawOutput);
		// assert
		assertThat(sExpectedOutput, is(sActualOutput));
	}
	
	@Test
	public void assertShelterReturnsTextForTwoContainedPets()
	{
		// assemble
		VirtualPetShelter oShelterTest = new VirtualPetShelter();
		AbstractVirtualPet oPetOne = new VirtualPet("Jack", "A rogue");
		AbstractVirtualPet oPetTwo = new VirtualPet("Vanessa", "A poser");
		String sExpectedOutput = "Jack 100 100 100 100\nVanessa 100 100 100 100";
		// administer
		oShelterTest.admitPet(oPetOne);
		oShelterTest.admitPet(oPetTwo);
		 String[] aRawOutput = oShelterTest.getPetStatistics();
		 oShelterTest.next();
		 String[] aRawAgain = oShelterTest.getPetStatistics();
		 String sActualOutput = String.join(" ", aRawOutput) + "\n" + String.join(" ", aRawAgain);
		// assert
		assertThat(sExpectedOutput, is(sActualOutput));
	}
	
	@Test
	public void assertShelterReturnsTextForTwoContainedPetsAfterOneTickAll()
	{
		// assemble
		VirtualPetShelter oShelterTest = new VirtualPetShelter();
		AbstractVirtualPet oPetOne = new VirtualPet("Jack", "A rogue");
		AbstractVirtualPet oPetTwo = new VirtualPet("Vanessa", "A poser");
		String sExpectedOutput = "Jack 90 90 90 90\nVanessa 90 90 90 90";
		// administer
		oShelterTest.admitPet(oPetOne);
		oShelterTest.admitPet(oPetTwo);
		oShelterTest.tickAll();
		 String[] aRawOutput = oShelterTest.getPetStatistics();
		 oShelterTest.next();
		 String[] aRawAgain = oShelterTest.getPetStatistics();
		 String sActualOutput = String.join(" ", aRawOutput) + "\n" + String.join(" ", aRawAgain);
		// assert
		assertThat(sExpectedOutput, is(sActualOutput));
	}
	
	@Test
	public void assertShelterReturnsTextForTwoContainedPetsAfterTwoTickAllFeedAllWaterAll()
	{
		// assemble
		VirtualPetShelter oShelterTest = new VirtualPetShelter();
		AbstractVirtualPet oPetOne = new VirtualPet("Jack", "A rogue");
		AbstractVirtualPet oPetTwo = new VirtualPet("Vanessa", "A poser");
		String sExpectedOutput = "Jack 100 90 80 80\nVanessa 100 90 80 80";
		// administer
		oShelterTest.admitPet(oPetOne);
		oShelterTest.admitPet(oPetTwo);
		oShelterTest.tickAll();
		oShelterTest.feedAll();
		oShelterTest.tickAll();
		oShelterTest.waterAll();
		 String[] aRawOutput = oShelterTest.getPetStatistics();
		 oShelterTest.next();
		 String[] aRawAgain = oShelterTest.getPetStatistics();
		 String sActualOutput = String.join(" ", aRawOutput) + "\n" + String.join(" ", aRawAgain);
		// assert
		assertThat(sExpectedOutput, is(sActualOutput));
	}
	
	@Test
	public void assertShelterReturnsTextForTwoContainedPetsAfterTwoTickAllPlayOneCleanAllCages()
	{
		// assemble
		VirtualPetShelter oShelterTest = new VirtualPetShelter();
		AbstractVirtualPet oPetOne = new VirtualPet("Jack", "A rogue");
		AbstractVirtualPet oPetTwo = new VirtualPet("Vanessa", "A poser");
		String sExpectedOutput = "Jack 80 80 80 100\nVanessa 80 80 90 100";
		// administer
		oShelterTest.admitPet(oPetOne);
		oShelterTest.admitPet(oPetTwo);
		oShelterTest.tickAll();
		oShelterTest.playWith(Integer.parseInt("2")-1);
		oShelterTest.tickAll();
		oShelterTest.cleanAllCages();
		 String[] aRawOutput = oShelterTest.getPetStatistics();
		 oShelterTest.next();
		 String[] aRawAgain = oShelterTest.getPetStatistics();
		 String sActualOutput = String.join(" ", aRawOutput) + "\n" + String.join(" ", aRawAgain);
		// assert
		assertThat(sExpectedOutput, is(sActualOutput));
	}
	
	@Test
	public void assertShelterReturnsTextForOneContainedPetAfterOneTickAdoptOne()
	{
		// assemble
		VirtualPetShelter oShelterTest = new VirtualPetShelter();
		AbstractVirtualPet oPetOne = new VirtualPet("Jack", "A rogue");
		AbstractVirtualPet oPetTwo = new VirtualPet("Vanessa", "A poser");
		String sExpectedOutput = "Jack 90 90 90 90";
		// administer
		oShelterTest.admitPet(oPetOne);
		oShelterTest.admitPet(oPetTwo);
		oShelterTest.tickAll();
		oShelterTest.adoptOne(Integer.parseInt("2")-1);
		 String[] aRawOutput = oShelterTest.getPetStatistics();
//		 oShelterTest.next();
//		 String[] aRawAgain = oShelterTest.getPetStatistics();
		 String sActualOutput = String.join(" ", aRawOutput);// + "\n" + String.join(" ", aRawAgain);
		// assert
		assertThat(sExpectedOutput, is(sActualOutput));
	}
	
	
	@Test
	public void assertShelterReturnsTextForTwoContainedPetsAfterTwoTickAdoptOneAdmitOne()
	{
		// assemble
		VirtualPetShelter oShelterTest = new VirtualPetShelter();
		AbstractVirtualPet oPetOne = new VirtualPet("Jack", "A rogue");
		AbstractVirtualPet oPetTwo = new VirtualPet("Vanessa", "A poser");
		AbstractVirtualPet oPetThree = new VirtualPet("Joan", "Wants to be your dog");
		String sExpectedOutput = "Jack 80 80 80 80\nJoan 100 100 100 100";
		// administer
		oShelterTest.admitPet(oPetOne);
		oShelterTest.admitPet(oPetTwo);
		oShelterTest.tickAll();
		oShelterTest.adoptOne(Integer.parseInt("2")-1);
		oShelterTest.tickAll();
		oShelterTest.admitPet(oPetThree);
		oShelterTest.resetIndex();
		 String[] aRawOutput = oShelterTest.getPetStatistics();
		 oShelterTest.next();
		 String[] aRawAgain = oShelterTest.getPetStatistics();
		 String sActualOutput = String.join(" ", aRawOutput) + "\n" + String.join(" ", aRawAgain);
		// assert
		assertThat(sExpectedOutput, is(sActualOutput));
	}
}
