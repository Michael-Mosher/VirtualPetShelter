package org.wecancodeit.virtualpetshelter;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void assertNameAndDescriptionAsProvidedStandardBuild()
	{
		// assemble
		VirtualPet oPetTest = new VirtualPet("hobo", "a feral, too tired to not get caught");
		String sExpectedName = new String("hobo");
		String sExpectedDescription = new String("a feral, too tired to not get caught");
		// administer
//		oPetTest.tick();
		// assert
		String sActualName = oPetTest.getName();
		String sActualDescrip = oPetTest.getDescription();
		assertThat(sExpectedName, is(sActualName));
		assertThat(sExpectedDescription, is(sActualDescrip));
	}
	
	@Test
	public void assertHydrationFullnessHealthStimulationAre90EachStandardBuildOneTick()
	{
		// assemble
		VirtualPet oPetTest = new VirtualPet("hobo", "a feral, too tired to not get caught");
		int iExpectedHydration = 90;
		int iExpectedFullness = 90;
		int iExpectedHealth = 90;
		int iExpectedStimulation = 90;
		// administer
		oPetTest.tick();
		// assert
		int actualHydro = oPetTest.getHydration();
		int actualFull = oPetTest.getFullness();
		int actualHealth = oPetTest.getHealth();
		int actualStimulation = oPetTest.getStimulation();
		assertThat(iExpectedHydration, is(actualHydro));
		assertThat(iExpectedFullness, is(actualFull));
		assertThat(iExpectedHealth, is(actualHealth));
		assertThat(iExpectedStimulation, is(actualStimulation));
	}
	
	@Test
	public void assertHydrationFullnessHealthStimulationAre80EachStandardBuildOneTick()
	{
		// assemble
		VirtualPet oPetTest = new VirtualPet("hobo", "a feral, too tired to not get caught");
		int iExpectedHydration = 90;
		int iExpectedFullness = 90;
		int iExpectedHealth = 90;
		int iExpectedStimulation = 90;
		// administer
		oPetTest.tick();
		// assert
		int actualHydro = oPetTest.getHydration();
		int actualFull = oPetTest.getFullness();
		int actualHealth = oPetTest.getHealth();
		int actualStimulation = oPetTest.getStimulation();
		assertThat(iExpectedHydration, is(actualHydro));
		assertThat(iExpectedFullness, is(actualFull));
		assertThat(iExpectedHealth, is(actualHealth));
		assertThat(iExpectedStimulation, is(actualStimulation));
	}
	
	@Test
	public void assertEach90StandardBuildFourTickIncrementSignificantOnce()
	{
		// assemble
		VirtualPet oPetTest = new VirtualPet("hobo", "a feral, too tired to not get caught");
		int iExpectedHydration = 90;
		int iExpectedFullness = 90;
		int iExpectedHealth = 90;
		int iExpectedStimulation = 90;
		// administer
		oPetTest.tick();
		oPetTest.tick();
		oPetTest.tick();
		oPetTest.tick();
		oPetTest.incrementSignificantHydration();
		oPetTest.incrementSignificantFullness();
		oPetTest.incrementSignificantHealth();
		oPetTest.incrementSignificantStimulation();
		// assert
		int actualHydro = oPetTest.getHydration();
		int actualFull = oPetTest.getFullness();
		int actualHealth = oPetTest.getHealth();
		int actualStimulation = oPetTest.getStimulation();
		assertThat(iExpectedHydration, is(actualHydro));
		assertThat(iExpectedFullness, is(actualFull));
		assertThat(iExpectedHealth, is(actualHealth));
		assertThat(iExpectedStimulation, is(actualStimulation));
	}
	
	@Test
	public void assertEach90StandardBuildTwoTickIncrementModestOnce()
	{
		// assemble
		VirtualPet oPetTest = new VirtualPet("hobo", "a feral, too tired to not get caught");
		int iExpectedHydration = 90;
		int iExpectedFullness = 90;
		int iExpectedHealth = 90;
		int iExpectedStimulation = 90;
		// administer
		oPetTest.tick();
		oPetTest.tick();
		oPetTest.incrementModestHydration();
		oPetTest.incrementModestFullness();
		oPetTest.incrementModestHealth();
		oPetTest.incrementModestStimulation();
		// assert
		int actualHydro = oPetTest.getHydration();
		int actualFull = oPetTest.getFullness();
		int actualHealth = oPetTest.getHealth();
		int actualStimulation = oPetTest.getStimulation();
		assertThat(iExpectedHydration, is(actualHydro));
		assertThat(iExpectedFullness, is(actualFull));
		assertThat(iExpectedHealth, is(actualHealth));
		assertThat(iExpectedStimulation, is(actualStimulation));
	}
	
	@Test
	public void assertEach90StandardBuildOneTickIncrementPoorOnce()
	{
		// assemble
		VirtualPet oPetTest = new VirtualPet("hobo", "a feral, too tired to not get caught");
		int iExpectedHydration = 90;
		int iExpectedFullness = 90;
		int iExpectedHealth = 90;
		int iExpectedStimulation = 90;
		// administer
		oPetTest.tick();
		oPetTest.incrementPoorHydration();
		oPetTest.incrementPoorFullness();
		oPetTest.incrementPoorHealth();
		oPetTest.incrementPoorStimulation();
		// assert
		int actualHydro = oPetTest.getHydration();
		int actualFull = oPetTest.getFullness();
		int actualHealth = oPetTest.getHealth();
		int actualStimulation = oPetTest.getStimulation();
		assertThat(iExpectedHydration, is(actualHydro));
		assertThat(iExpectedFullness, is(actualFull));
		assertThat(iExpectedHealth, is(actualHealth));
		assertThat(iExpectedStimulation, is(actualStimulation));
	}
	
	@Test
	public void assertEach100StandardBuildFourTickIncrementFullOnce()
	{
		// assemble
		VirtualPet oPetTest = new VirtualPet("hobo", "a feral, too tired to not get caught");
		int iExpectedHydration = 100;
		int iExpectedFullness = 100;
		int iExpectedHealth = 100;
		int iExpectedStimulation = 100;
		// administer
		oPetTest.tick();
		oPetTest.tick();
		oPetTest.tick();
		oPetTest.tick();
		oPetTest.incrementFullHydration();
		oPetTest.incrementFullFullness();
		oPetTest.incrementFullHealth();
		oPetTest.incrementFullStimulation();
		// assert
		int actualHydro = oPetTest.getHydration();
		int actualFull = oPetTest.getFullness();
		int actualHealth = oPetTest.getHealth();
		int actualStimulation = oPetTest.getStimulation();
		assertThat(iExpectedHydration, is(actualHydro));
		assertThat(iExpectedFullness, is(actualFull));
		assertThat(iExpectedHealth, is(actualHealth));
		assertThat(iExpectedStimulation, is(actualStimulation));
	}
	
	@Test
	public void assertEach1StandardBuildTenTick()
	{
		// assemble
		VirtualPet oPetTest = new VirtualPet("hobo", "a feral, too tired to not get caught");
		int iExpectedHydration = 1;
		int iExpectedFullness = 1;
		int iExpectedHealth = 1;
		int iExpectedStimulation = 1;
		// administer
		oPetTest.tick();
		oPetTest.tick();
		oPetTest.tick();
		oPetTest.tick();
		oPetTest.tick();
		oPetTest.tick();
		oPetTest.tick();
		oPetTest.tick();
		oPetTest.tick();
		oPetTest.tick();
		// assert
		int actualHydro = oPetTest.getHydration();
		int actualFull = oPetTest.getFullness();
		int actualHealth = oPetTest.getHealth();
		int actualStimulation = oPetTest.getStimulation();
		assertThat(iExpectedHydration, is(actualHydro));
		assertThat(iExpectedFullness, is(actualFull));
		assertThat(iExpectedHealth, is(actualHealth));
		assertThat(iExpectedStimulation, is(actualStimulation));
	}
}
