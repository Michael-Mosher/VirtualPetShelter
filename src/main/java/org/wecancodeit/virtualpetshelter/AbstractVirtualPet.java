package org.wecancodeit.virtualpetshelter;

abstract class AbstractVirtualPet implements IVirtualPet {
	
	abstract protected void shiftMaxHydrationBy(int shift);
	
	abstract protected void shiftMinHydrationBy(int shift);
	
	abstract protected void shiftMaxFullnessBy(int shift);
	
	abstract protected void shiftMinFullnessBy(int shift);
	
	abstract protected void shiftMaxStimulationBy(int shift);
	
	abstract protected void shiftMinStimulationBy(int shift);
	
	abstract protected void shiftMaxHealthBy(int shift);
	
	abstract protected void shiftMinHealthBy(int shift);
}
