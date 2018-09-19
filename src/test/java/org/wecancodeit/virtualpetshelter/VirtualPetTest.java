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
		int iExpectedHealth = 100;
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
		int iExpectedHealth = 100;
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
		int iExpectedHealth = 100;
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
		int iExpectedHealth = 100;
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
		int iExpectedHealth = 100;
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
		int iExpectedHealth = 100;
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
	
	@Test
	public void assertHealth87DiabetesOneTick()
	{
		// assemble
		AbstractVirtualPet oPetTest = new DiabetesVP( new VirtualPet("hobo", "a feral, too tired to not get caught"));
		int iExpectedHydration = 90;
		int iExpectedFullness = 90;
		int iExpectedHealth = 100;
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
	public void assertHydration87SmallTongueOneTick()
	{
		// assemble
		AbstractVirtualPet oPetTest = new SmallTongueVP( new VirtualPet("hobo", "a feral, too tired to not get caught"));
		int iExpectedHydration = 87;
		int iExpectedFullness = 90;
		int iExpectedHealth = 100;
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
	public void assertHealth95BigChestOneTickOneSignificantIncrement()
	{
		// assemble
		AbstractVirtualPet oPetTest = new BigChestVP( new VirtualPet("hobo", "a feral, too tired to not get caught"));
		int iExpectedHydration = 90;
		int iExpectedFullness = 90;
		int iExpectedHealth = 105;
		int iExpectedStimulation = 90;
		// administer
		oPetTest.tick();
		oPetTest.incrementSignificantHealth();
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
	public void assertStimulation85EmphysemaNoTick()
	{
		// assemble
		AbstractVirtualPet oPetTest = new EmphysemaVP( new VirtualPet("hobo", "a feral, too tired to not get caught"));
		int iExpectedHydration = 100;
		int iExpectedFullness = 100;
		int iExpectedHealth = 100;
		int iExpectedStimulation = 85;
		// administer
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
	public void assertHealth90DirtyCageEmphysemaOneTick()
	{
		// assemble
		AbstractVirtualPet oPetTest = new DirtyCage( new EmphysemaVP( new VirtualPet("hobo", "a feral, too tired to not get caught")));
		int iExpectedHydration = 90;
		int iExpectedFullness = 90;
		int iExpectedHealth = 90;
		int iExpectedStimulation = 75;
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
}
